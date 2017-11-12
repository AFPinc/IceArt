package main.controller;

import main.model.User;
import main.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Ása Júlía Aðalsteinsdóttir
 * @author Melkorka Mjöll Jóhansdóttir
 * @author Sigurlaug Þórðardóttir
 * @author Vagerður Sigfinnsdóttir
 * @date September 2017
 * Háskóli Íslands
 *
 * Stýriklasi fyrir aðgang notenda að kerfinu
 */

@Controller
@RequestMapping("/user")
public class AccountController extends HttpServlet {

    @Autowired
    IService service;

    /**
     * Birtir Login síðuna
     * @return
     */

    /*@RequestMapping(value = "/loginPage") login
    public String showPage() {
        return "view/Login";
    }

    @RequestMapping(value = "/signUpPage") addUser
    public String showPage2() {
        return "view/SignUp";
    }

    @RequestMapping(value = "/logoutPage") logout
    public String showPage3() {
        return "view/Logout";
    }
    */

    /**
     * Þetta fall bætir við notanda (user)
     * @param name
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/signup")
    public String addUser(@RequestParam(value = "name") String name,
                          @RequestParam(value = "username") String username,
                          @RequestParam(value = "password") String password,
                          HttpServletResponse response) throws IOException {
        User user = new User(name, username, password);
        User u = service.addUser(user);
        response.sendRedirect("../");
        return "view/MainPage";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(@RequestParam(value = "username") String username,
                        @RequestParam(value = "password") String password,
                        HttpServletResponse response,
                        HttpServletRequest request) throws ServletException, IOException {

        User user = service.getUserByUserName(username);

        if (user != null && user.getPassword().equals(password)){
            Cookie ck = new Cookie("username", username);
            ck.setValue(username);
            response.addCookie(ck);

            response.sendRedirect("../");
            return "view/MainPage";
        }
        else{
            //response.sendRedirect("/user/loginPage");
            request.getRequestDispatcher("/user/login").include(request, response);
            return "view/Login";
        }
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {

        Cookie[] ck = request.getCookies();
        for (Cookie cookie : ck){
            if (cookie.getValue()!=null){
                cookie.setValue(null);
                cookie.setMaxAge(0);
                response.addCookie(cookie);
            }
        }



        //session.invalidate();
        //return "redirect:view/MainPage";
        //request.getRequestDispatcher("/user/logout").include(request, response);
        return "view/Logout";
    }

}
