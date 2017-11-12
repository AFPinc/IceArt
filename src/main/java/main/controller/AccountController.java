package main.controller;

import main.model.User;
import main.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * @author Ása Júlía Aðalsteinsdóttir
 * @author Melkorka Mjöll Jóhannesdóttir
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

    @RequestMapping(value = "/loginPage")
    public String showPage() {
        return "view/Login";
    }

    @RequestMapping(value = "/signUpPage")
    public String showPage2() {
        return "view/SignUp";
    }

    /**
     * Þetta fall bætir við notanda (user)
     * @param name
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/addUser")
    public String addUser(@RequestParam(value = "name") String name,
                          @RequestParam(value = "username") String username,
                          @RequestParam(value = "password") String password,
                          HttpServletResponse response, HttpSession session) throws IOException {
        User u = service.addUser(new User(name, username, password));
        session.setAttribute("user", u);
        response.sendRedirect("../");
        return "view/MainPage";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(@RequestParam(value = "username") String username,
                        @RequestParam(value = "password") String password,
                        HttpSession session, HttpServletResponse response) throws IOException {

        User user = service.getUserByUserName(username);

        if (user != null && user.getPassword().equals(password)){
            session.setAttribute("user", user);
            response.sendRedirect("../");
            return "view/MainPage";
        }
        else{
            return "view/Login";
        }
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session, HttpServletResponse response) throws ServletException, IOException {
        session.setAttribute("user", null);
        response.sendRedirect("../");
        return "view/MainPage";
    }

}
