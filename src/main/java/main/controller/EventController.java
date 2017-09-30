package main.controller;

import main.model.Event;
import main.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


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
                           @RequestParam(value = "timeBegin", required=false) String timeBegin,
                           @RequestParam(value = "timeEnd", required=false) String timeEnd,
                           @RequestParam(value = "description", required=false) String description,
                           ModelMap model){
        Event event = new Event(title, location, artist, timeBegin, timeEnd, description, false);
        Event e = service.addEvent(event);
        return getEventById(e.getId(), model);
    }

    //Þetta fall eyðir viðburði
    public void deleteEvent(){

    }

    //Þetta fall nær í viðbuðr eftir auðkenni hans
    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String getEventById(@RequestParam(value = "id", required=false) Long id, ModelMap model){
        Event event = service.getEventById(id);
        model.addAttribute("event", event);
        return "view/ShowEvent";
    }

    //Þetta fall birtir upphafssíðuna
    @RequestMapping(value = "/event")
    public String showPage(){
        return "view/AddEvent";
    }
}
