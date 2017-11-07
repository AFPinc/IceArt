package main.controller;

import main.model.Category;
import main.model.Event;
import main.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author Ása Júlía Aðalsteinsdóttir
 * @author Melkorka Mjöll Jóhansdóttir
 * @author Sigurlaug Þórðardóttir
 * @author Vagerður Sigfinnsdóttir
 * @date Október 2017
 * Háskóli Íslands
 *
 * Stýriklasi fyrir aðgang notenda að kerfinu
 */

@Controller
public class MainController {

    @Autowired
    IService service;

    /**
     * Þetta fall birtir upphafssíðuna með 10 eventum
     * @return
     */
    @RequestMapping(value = "")
    public String showPage(ModelMap model){
        List<Event> events = service.getTop10Events();
        List<Category> categories = service.getAllCategories();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        Calendar cal = Calendar.getInstance();
        Date now = cal.getTime();
        String todayDate = dateFormat.format(now);
        cal.add(Calendar.DATE, 7);
        cal.add(Calendar.HOUR, 5);
        Date week = cal.getTime();
        String inWeekDate = dateFormat.format(week);

        model.addAttribute("events", events);
        model.addAttribute("categories", categories);
        model.addAttribute("todayDate", todayDate);
        model.addAttribute("inWeekDate", inWeekDate);
        return "view/MainPage";
    }

}
