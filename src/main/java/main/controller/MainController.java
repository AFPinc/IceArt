package main.controller;

import main.model.Event;
import main.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    IService service;

    /**
     * Þetta fall birtir upphafssíðuna með 10 eventum
     * @return
     */
    @RequestMapping(value = "")
    public String showPage(ModelMap model){
        List<Event> events = service.getTop10Events();
        model.addAttribute("events", events);
        return "view/MainPage";
    }

}
