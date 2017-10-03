package main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Sigurlaug Þórðardóttir
 * @date September 2017
 * Háskóli Íslands
 *
 * Stýriklasi fyrir aðgerðir framkvæmdar á listamanni
 */

@Controller
@RequestMapping("/Artist")
public class ArtistController {

    //Þetta fall birtir AddArtist síðuna.
    @RequestMapping(value = "/Artist")
    public String showPage(){
        return "view/AddArtist";
    }

    //Þetta fall bætir við nýjum listamanni
    public void addArtist(){

    }

    //Þetta fall bætir eyðir listamanni
    public void deleteArtist(){

    }
}
