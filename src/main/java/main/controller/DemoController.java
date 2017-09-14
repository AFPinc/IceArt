package main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//Pakkinn Controller geymir alla controllera sem sjá um að taka við gögnum frá vefnum, vinna með þau og skila til baka.

/*
    Höfundar

    Ása Júlía Aðalsteinsdóttir - aja11@hi.is
    Melkorka Mjöll Jóhannesdóttir - mmj8@hi.is
    Sigurlaug Þórðardóttir - sth301@hi.is
    Valgerður Sigfinnsdóttir - vas30@hi.is
 */

@Controller
@RequestMapping("/demo")
public class DemoController {

    //Fallið demoPage sér um að opna forsíðu vefsins, það skilar
    //strengnum demo/demo sem kallar í viðeigandi .jsp skrá sem birtir vefinn
    @RequestMapping("/page")
    public String demoPage(){
        return "demo/MainPage";
    }

    //Fallið hver tekur inn nafn og bætir því við modelið, það skilar síðan strengnum
    //demo/addEvent sem kallar í viðeigandi .jsp skrá sem birtir á vefinn með nafninu á viðburðinum.
    @RequestMapping(value = "/addEvent", method = RequestMethod.POST)
    public String addEvent(@RequestParam(value = "eventName", required=false) String eventName, ModelMap model){
        model.addAttribute("eventName", eventName);
        return "demo/addEvent";
    }

    //Fallið hver tekur inn nafn og bætir því við modelið, það skilar síðan strengnum
    //demo/addLocation sem kallar í viðeigandi .jsp skrá sem birtir á vefinn með nafninu á staðsetningunni.
    @RequestMapping(value = "/addLocation", method = RequestMethod.POST)
    public String addLocation(@RequestParam(value = "locationName", required=false) String locationName, ModelMap model){
        model.addAttribute("locationName", locationName);
        return "demo/addLocation";
    }


}
