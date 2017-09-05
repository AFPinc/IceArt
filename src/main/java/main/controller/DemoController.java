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
        return "demo/demo";
    }

    //Fallið hver tekur inn nafn og bætir því við modelið, það skilar síðan strengnum
    //demo/synaNotandi sem kallar í viðeigandi .jsp skrá sem birtir á vefinn með nafninu.
    @RequestMapping(value = "/hver", method = RequestMethod.POST)
    public String hver(@RequestParam(value = "nafn", required=false) String nafn, ModelMap model){
        model.addAttribute("nafn", nafn);
        return "demo/synaNotandi";
    }
}
