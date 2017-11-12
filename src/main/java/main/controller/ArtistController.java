package main.controller;

import main.model.Artist;
import main.model.User;
import main.services.IService;
import org.apache.coyote.http2.Http2Error;
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
 * @author Melkorka Mjöll Jóhannesdóttir
 * @author Sigurlaug Þórðardóttir
 * @author Vagerður Sigfinnsdóttir
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
    @RequestMapping(value = "/add")
    public String showPage(ModelMap model, HttpSession session){
        User currentUser = (User) session.getAttribute("user");
        model.addAttribute("currentUser", currentUser);
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
    @RequestMapping(value = "/artist", method = RequestMethod.POST)
    public String addArtist(@RequestParam(value = "name", required=false) String name,
                            @RequestParam(value = "description") String description,
                            @RequestParam(value = "age") int age,
                            @RequestParam(value = "country") String country,
                            ModelMap model, HttpSession session){
        Artist artist = new Artist(name, description, age, country);
        Artist a = service.addArtist(artist);
        return getArtistById(a.getId(), model, session);
    }

    /**
     * Þetta fall nær í listamann eftir auðkenni
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getArtistById(@PathVariable(value = "id") Long id, ModelMap model, HttpSession session){
        Artist artist = service.getArtistById(id);
        User currentUser = (User) session.getAttribute("user");
        model.addAttribute("currentUser", currentUser);
        model.addAttribute("artist", artist);
        return "view/showArtist";
    }
}
