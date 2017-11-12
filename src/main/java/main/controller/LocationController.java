package main.controller;

import main.model.User;
import main.services.IService;
import main.model.Location;
import main.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * @author Ása Júlía Aðalsteinsdóttir
 * @author Melkorka Mjöll Jóhansdóttir
 * @author Sigurlaug Þórðardóttir
 * @author Vagerður Sigfinnsdóttir
 * @date September 2017
 * Háskóli Íslands
 *
 * Stýriklasi fyrir aðgerðir framkvæmdar á staðsetningu
 */

@Controller
@RequestMapping("/location")
public class LocationController {

    @Autowired
    IService service;

    /**
     * Þetta fall birtir AddLocation síðuna
     * @return
     */
    @RequestMapping(value = "/add")
    public String showPage(ModelMap model, HttpSession session){
        User currentUser = (User) session.getAttribute("user");
        model.addAttribute("currentUser", currentUser);
        return "view/AddLocation";
    }

    /**
     * Þetta fall bætir við nýrri staðsetningu
     * @param name
     * @param description
     * @param openHours
     * @param maxPeople
     * @param model
     * @return
     */
    @RequestMapping(value = "/location", method = RequestMethod.POST)
    public String addLocation(@RequestParam(value = "name", required=false) String name,
                              @RequestParam(value = "description") String description,
                              @RequestParam(value = "openHours") String openHours,
                              @RequestParam(value = "maxPeople") int maxPeople,
                              ModelMap model, HttpSession session){
        Location location = new Location(name, description, openHours, maxPeople);
        Location l = service.addLocation(location);
        return getLocationById(l.getId(), model, session);
    }

    /**
     * Þetta fall nær í staðsetningu eftir auðkenni
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getLocationById(@PathVariable(value = "id") Long id, ModelMap model, HttpSession session){
        Location location = service.getLocationById(id);
        User currentUser = (User) session.getAttribute("user");
        model.addAttribute("currentUser", currentUser);
        model.addAttribute("location", location);
        return "view/ShowLocation";
    }
}
