package IceArtTest;


import is.hi.byrjun.controller.DemoController;
import static javax.management.Query.value;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

// Athugið vel að þessi import séu rétt 
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.hamcrest.Matchers.containsString;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
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
@WebMvcTest (DemoController.class)                                                  
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
