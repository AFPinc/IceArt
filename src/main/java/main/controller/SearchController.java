package main.controller;

import main.services.IService;
import main.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.ModelMap;

/**
 * @author Sigurlaug Þórðardóttir
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
     * @param title
     * @param model
     * @return
     */

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String getEventByTitle(@RequestParam(value = "title") String title, ModelMap model) {
        Event event = service.getEventByTitle(title);
        model.addAttribute("event", event);
        return "view/ShowEvent";
    }

    //Þetta fall sér um að leita af Staðsetningu og skila niðurstöðunum.
    public void searchLocation(){

    }

    //Þetta fall sér um að leita af Listamanni og skila niðurstöðunum.
    public void searchArtist(){

    }
}
