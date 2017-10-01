package main.controller;

import main.model.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
public class MainController {

    //Þetta fall birtir upphafssíðuna
    @RequestMapping(value = "")
    public String showPage(){
        return "view/MainPage";
    }

}
