package main.controller;

import main.model.Event;
import main.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

/**
 * @author Sigurlaug Þórðardóttir
 * @date September 2017
 * Háskóli Íslands
 *
 * Stýriklasi fyrir aðgerðir framkvæmdar á viðburð
 */
@Controller
@RequestMapping("/event")
public class EventController {

    @Autowired
    IService service;

    //Þetta fall bætir við nýjum viðburði
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addEvent(@RequestParam(value = "title", required=false) String title,
                           @RequestParam(value = "location", required=false) String location,
                           @RequestParam(value = "artist", required=false) String artist,
                           @RequestParam(value = "timeBegin", required=false) Date timeBegin,
                           @RequestParam(value = "timeEnd", required=false) Date timeEnd,
                           @RequestParam(value = "description", required=false) String description,
                           ModelMap model){
        //Vantar að bæta artist í smiðinn á Event
        Event event = new Event(title, location, timeBegin, timeEnd, description, 1, false);
        int id = service.addEvent(event);
        return getEventById(id, model);
    }

    //Þetta fall bætir eyðir viðburði
    public void deleteEvent(){

    }

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String getEventById(@RequestParam(value = "id", required=false) int id, ModelMap model){
        Event event = service.getEventById(id);
        model.addAttribute("event", event);
        return "showEvent";
    }
}
