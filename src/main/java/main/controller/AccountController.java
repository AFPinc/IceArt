package main.controller;

import main.model.User;
import main.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.net.ssl.SSLSessionContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam(value = "username") String username,
                        @RequestParam(value = "password") String password,
                        HttpServletResponse response,
                        HttpServletRequest request) throws ServletException, IOException {
        User user = service.getUserByUserName(username);
        if (user != null && user.getPassword().equals(password)){
            response.sendRedirect("../");

            HttpSession session = request.getSession();
            session.setAttribute("user", user);

            return "view/MainPage";

        }
        else{
            //response.sendRedirect("/user/loginPage");
            request.getRequestDispatcher("/user/login").include(request, response);
            return "view/Login";
        }
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request,
                         HttpServletRequest response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        return "view/Logout";

    }


}
