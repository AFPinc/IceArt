package main;


import main.controller.*;
import main.model.Artist;
import main.model.Category;
import main.model.Event;
import main.model.Location;
import main.repository.IEventRepository;
import main.services.IService;
import main.services.Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

// Athugið vel að þessi import séu rétt
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Matchers.anyListOf;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.hamcrest.Matchers.containsString;

import static org.mockito.Mockito.when;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ása Júlía Aðalsteinsdóttir
 * @author Melkorka Mjöll Jóhansdóttir
 * @author Sigurlaug Þórðardóttir
 * @author Vagerður Sigfinnsdóttir
 * @date Nóvember 2017
 * HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 *
 * Prófunarklasi sem framkvæmir prófanir á weblayer og notar WebMvcTest og
 * Mockito til að prófa service klasa
*/

@RunWith(SpringRunner.class)
/**
 *  Aðeins veflagið er keyrt upp en ekki allur "context"-inn
 *  Biðjum um að bæta Service inn í "context-inn" sem Mock (prófanahlut)
 */
@WebMvcTest(MainController.class)

public class WebMockTest {

    // Þjónninn (Tomcat) ekki keyrður upp
    @Autowired
    private MockMvc mockMvc;

    // Bætum við prófunar (e. Mock) service klasa - kemur úr springframework safninu (fyrir Mockito
    // sérstaklega gert fyrir Mockito safnið
    @MockBean
    IService service;

    /**
     * Aðferðin prófar hvort getTop10Event() virki eins og hún á að virka
     * og skili réttri síðu.
     */

    @Test
    public void testTop10Events() throws Exception {
        Calendar cal = Calendar.getInstance();
        Date now = cal.getTime();
        Location loc = new Location("", "", "", 1);
        Artist a = new Artist("", "", 1, "");
        Category c = new Category("");
        Event event = new Event("hæ", loc, a, now, now, now, now, c, "", false);
        List<Event> events = new ArrayList<Event>();
        events.add(event);
        when(service.getTop10Events()).thenReturn(events);
        this.mockMvc.perform(get(""))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(view().name("view/MainPage"));
    }
}
