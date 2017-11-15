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
 * @author Valgerður Sigfinnsdóttir
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
    @RequestMapping(value = "/login")
    public String showLogin() {
        return "view/Login";
    }

    /**
     * Birtir SignUp síðuna
     * @return
     */
    @RequestMapping(value = "/signUp")
    public String showSignUp() {
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

    /**
     * Þetta fall athugar hvort user er til og hvort lykilorð sé rétt og innskráir notanda
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/loginUser", method = RequestMethod.GET)
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

    /**
     * Þetta fall sér um að útskrá notanda
     * @return
     */
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session, HttpServletResponse response) throws ServletException, IOException {
        session.setAttribute("user", null);
        response.sendRedirect("../");
        return "view/MainPage";
    }

}
