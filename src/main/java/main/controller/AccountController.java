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
public class AccountController {

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
     * @param model
     * @return
     */
    @RequestMapping(value = "/addUser")
    public String addUser(@RequestParam(value = "name") String name,
                          @RequestParam(value = "username") String username,
                          @RequestParam(value = "password") String password,
                          ModelMap model, HttpServletResponse res) throws IOException {
        User user = new User(name, username, password);
        User u = service.addUser(user);
        res.sendRedirect("../");
        return "view/MainPage";
    }

    /**
     * Þetta fall nær í notanda eftir auðkenni hans
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getUserById(@PathVariable(value = "id") Long id, ModelMap model) {
        User user = service.getUserById(id);
        model.addAttribute( "user", user);
        return "view/myPage";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam(value = "username") String username,
                         @RequestParam(value = "password") String password,
                         ModelMap model, HttpServletResponse res) throws IOException {
        User user = service.getUserByUserName(username);
        if (user != null && user.getPassword().equals(password)){
            res.sendRedirect("../");
            return "view/MainPage";
        }
        else{
            res.sendRedirect("/user/loginPage");
            return "view/Login";
        }
    }
}
