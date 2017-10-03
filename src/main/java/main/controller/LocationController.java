package main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Sigurlaug Þórðardóttir
 * @date September 2017
 * Háskóli Íslands
 *
 * Stýriklasi fyrir aðgerðir framkvæmdar á staðsetningu
 */

@Controller
@RequestMapping("/Location")
public class LocationController {

    //Þetta fall birtir AddLocation síðuna.
    @RequestMapping(value = "/Location")
    public String showPage(){
        return "view/AddLocation";
    }

    //Þetta fall bætir við nýrri staðsetningu
    public void addLocation(){

    }

    //Þetta fall bætir eyðir staðsetningu
    public void deleteLocation(){

    }
}
