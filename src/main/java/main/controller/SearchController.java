package main.controller;

import main.model.Category;
import main.model.User;
import main.services.IService;
import main.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpSession;
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
                         ModelMap model, HttpSession session) {
        List<Event> events = service.search(text, text, category_id, dateBegin, dateEnd);
        User currentUser = (User) session.getAttribute("user");
        model.addAttribute("events", events);
        model.addAttribute("currentUser", currentUser);
        return "view/ShowSearchResults";
    }
}
