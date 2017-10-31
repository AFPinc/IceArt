package main;


import main.controller.*;
import static javax.management.Query.value;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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
 * @author Ebba Þóra Hvannberg
 * @date október 2017 
 * HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 * 
 * Prófunarklasi sem framkvæmir prófanir á weblayer og notar WebMvcTest 
*/
@RunWith(SpringRunner.class)
// Sleppum hér @SpringBootTest
/**
 *  Aðeins veflagið er keyrt upp en ekki allur "context"-inn
 *  Getum beðið um að keyra bara upp KennariController klasann 
 */
@WebMvcTest (EventController.class)
public class WebLayerTest {
    
        // Þjónninn ekki keyrður upp 
        @Autowired
        private MockMvc mockMvc;
        
        /**
         * Aðferð til að athuga hvort virkar að senda HttpRequest á listiKennari
         * og fá til baka listiKennara.html síðuna 
         */
	@Test 
        public void demoProf() throws Exception {
        this.mockMvc.perform(get("/demo/page"))                
                          .andDo(print()).andExpect(status().isOk())
    //            .andExpect(content().string(containsString("Sýnidæmi")));
        // JSP prófa að nafnið á viðmótsskránni sé demo/demo 
        // Ekki hægt að prófa innihald á JSP "renderer" 
      .andExpect(view().name("demo/demo"));

    }

}
