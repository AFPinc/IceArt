package main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/page")
    public String demoPage(){
        return "demo/demo";
    }

    @RequestMapping("/spyrjaNotanda")
    public String spyrjaNotanda(){
        return "demo{hvadaNotandi";
    }

    @RequestMapping(value = "/hver", method = RequestMethod.POST)
    public String hver(@RequestParam(value = "nafn", required=false) String nafn, ModelMap model){
        model.addAttribute("nafn", nafn);
        return "demo/synaNotandi";
    }
}
