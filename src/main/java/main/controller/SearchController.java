package main.controller;

import main.model.Category;
import main.services.IService;
import main.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.ModelMap;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author Ása Júlía Aðalsteinsdóttir
 * @author Melkorka Mjöll Jóhansdóttir
 * @author Sigurlaug Þórðardóttir
 * @author Vagerður Sigfinnsdóttir
 * @date September 2017
 * Háskóli Íslands
 *
 * Stýriklasi fyrir allar leitir í kerfinu
 */

@Controller
@RequestMapping("/search")
public class SearchController {

    @Autowired
    IService service;

    //Þetta fall sér um að leita af Viðburðum og skila niðurstöðunum.
    public void searchEvents(){
    }

    /**
     * Þetta fall sér um að leita af viðburði eftir titli
     * @param text
     * @param model
     * @return
     */

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String search(@RequestParam(value = "text", required = false) String text,
                         @RequestParam(value = "category", required = false) Long category_id,
                         @RequestParam(value = "dateBegin", required = true) @DateTimeFormat(pattern="yyyy-MM-dd") Date dateBegin,
                         @RequestParam(value = "dateEnd", required = true) @DateTimeFormat(pattern="yyyy-MM-dd") Date dateEnd,
                         ModelMap model) {
        List<Event> events = service.search(text, text, category_id, dateBegin, dateEnd);
        model.addAttribute("events", events);
        return "view/ShowSearchResults";
    }
/*
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String searchLess(@RequestParam(value = "title", required = false) String title,
                         @RequestParam(value = "category", required = false) Long category_id,
                         @RequestParam(value = "dateBegin", required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date dateBegin,
                         @RequestParam(value = "dateEnd", required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date dateEnd,
                         ModelMap model) {

        List<Event> events = service.searchLess(title, category_id, dateBegin, dateEnd);
        model.addAttribute("events", events);
        return "view/ShowAllEvent";
    }
    */
    //Þetta fall sér um að leita af Staðsetningu og skila niðurstöðunum.
    public void searchLocation(){

    }

    //Þetta fall sér um að leita af Listamanni og skila niðurstöðunum.
    public void searchArtist(){

    }
}
