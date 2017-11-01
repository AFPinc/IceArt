package main;


import main.controller.*;
import static javax.management.Query.value;

import main.services.IService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

// Athugið vel að þessi import séu rétt 
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 *
 * @author Ása Júlía Aðalsteinsdóttir
 * @author Melkorka Mjöll Jóhansdóttir
 * @author Sigurlaug Þórðardóttir
 * @author Vagerður Sigfinnsdóttir
 * @date október 2017 
 * HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 * 
 * Prófunarklasi sem framkvæmir prófanir á weblayer og notar WebMvcTest 
*/
@RunWith(SpringRunner.class)
// Sleppum hér @SpringBootTest
/**
 *  Aðeins veflagið er keyrt upp en ekki allur "context"-inn
 *  Getum beðið um að keyra bara upp EventController klasann
 */
@WebMvcTest (EventController.class)
public class WebLayerTest {

        // Þjónninn ekki keyrður upp
        @Autowired
        private MockMvc mockMvc;

        @MockBean
        IService service;
        /** Test til að athuga hvort virkar að senda HttpRequest á /event/add
        * og fá til baka view/AddEvent.jsp síðuna
        */
        @Test
        public void viewAddEvent() throws Exception {
                this.mockMvc.perform(get("/event/add"))
                        .andDo(print()).andExpect(status().isOk())
                        .andExpect(view().name("view/AddEvent"));
        }

         /** Test til að athuga hvort virkar að senda HttpRequest á /event/{id}
         * og fá til baka view/ShowEvent.jsp síðuna sem inniheldur event með id nr.3
         */
        @Test
        public void viewShowEvent() throws Exception {
                this.mockMvc.perform(get("/event/3"))
                        .andDo(print()).andExpect(status().isOk())
                        .andExpect(view().name("view/ShowEvent"));
        }

}
