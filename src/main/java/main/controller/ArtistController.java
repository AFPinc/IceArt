package main.controller;

import main.model.Artist;
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
 * Stýriklasi fyrir aðgerðir framkvæmdar á listamanni
 */

@Controller
@RequestMapping("/artist")
public class ArtistController {

    @Autowired
    IService service;

    /**
     * Birtir addArtist síðuna
     * @return
     */
    @RequestMapping(value = "/artist")
    public String showPage(){
        return "view/AddArtist";
    }

    /**
     * Þetta fall bætir við listamanni
     * @param name
     * @param age
     * @param age
     * @param country
     * @param model
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addArtist(@RequestParam(value = "name", required=false) String name,
                            @RequestParam(value = "description") String description,
                            @RequestParam(value = "age") int age,
                            @RequestParam(value = "country") String country,
                            ModelMap model){
        Artist artist = new Artist(name, description, age, country);
        Artist a = service.addArtist(artist);
        return getArtistById(a.getId(), model);
    }

    /**
     * Þetta fall eyðir listamanni sem er til
     * @param
     */
    public void deleteArtist(){

    }

    /**
     * Þetta fall nær í listamann eftir auðkenni
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String getArtistById(@RequestParam(value = "id", required=false) Long id, ModelMap model){
        Artist artist = service.getArtistById(id);
        model.addAttribute("artist", artist);
        return "view/ShowArtist";
    }
}
