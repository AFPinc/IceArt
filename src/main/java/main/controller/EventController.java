package main.controller;

import main.model.Artist;
import main.model.Event;
import main.model.Location;
import main.model.Category;
import main.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;


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

    /**
     * Þetta fall bætir við nýjum viðburði
     * @param title
     * @param locationId
     * @param artistId
     * @param categoryId
     * @param dateBegin
     * @param timeBegin
     * @param dateEnd
     * @param timeEnd
     * @param categoryId
     * @param description
     * @param model
     * @return
     */
    @RequestMapping(value = "/event", method = RequestMethod.POST)
    public String addEvent(@RequestParam(value = "title", required=false) String title,
                           @RequestParam(value = "location") Long locationId,
                           @RequestParam(value = "artist") Long artistId,
                           @RequestParam(value = "dateBegin", required=false) @DateTimeFormat(pattern="yyyy-MM-dd") Date dateBegin,
                           @RequestParam(value = "timeBegin", required=false) @DateTimeFormat(pattern="HH:mm") Date timeBegin,
                           @RequestParam(value = "dateEnd", required=false) @DateTimeFormat(pattern="yyyy-MM-dd") Date dateEnd,
                           @RequestParam(value = "timeEnd", required=false) @DateTimeFormat(pattern="HH:mm") Date timeEnd,
                           @RequestParam(value = "category") Long categoryId,
                           @RequestParam(value = "description", required=false) String description,
                           ModelMap model){
        Location location = service.getLocationById(locationId);
        Artist artist = service.getArtistById(artistId);
        Category category = service.getCategoryById(categoryId);
        Event event = new Event(title, location, artist, dateBegin, timeBegin, dateEnd, timeEnd, category, description, false);
        Event e = service.addEvent(event);
        return getEventById(e.getId(), model);
    }

    //Þetta fall eyðir viðburði
    public void deleteEvent(){

    }

    /**
     * Þetta fall nær í viðbuðr eftir auðkenni hans
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getEventById(@PathVariable(value = "id") Long id, ModelMap model){
        Event event = service.getEventById(id);
        model.addAttribute("event", event);
        return "view/ShowEvent";
    }

    /**
     * Þetta fall birtir upphafssíðuna
     * @param model
     * @return
     */
    @RequestMapping(value = "/add")
    public String showPage(ModelMap model){
        List<Location> locations = service.getAllLocations();
        List<Artist> artists = service.getAllArtist();
        List<Category> categories = service.getAllCategories();
        model.addAttribute("locations", locations);
        model.addAttribute("artists", artists);
        model.addAttribute("categories", categories);
        return "view/AddEvent";
    }

}
