package main;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

// Athugið vel að þessi import séu rétt
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.hamcrest.Matchers.containsString;
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
 * Prófunarklasi sem framkvæmir prófanir án þess að þurfa að kalla á þjóninn
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc       // Spring MockMvc - allt "context"-ið keyrt upp
public class ApplicationTest {

    // Þjónninn (Tomcat) ekki keyrður upp
    @Autowired
    private MockMvc mockMvc;

    /* Test til að athuga hvort virkar að senda HttpRequest á /event/add
    * og fá til baka view/AddEvent.jsp síðuna */
    @Test
    public void viewAddEvent() throws Exception {
        this.mockMvc.perform(get("/event/add"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(view().name("view/AddEvent"));
    }

    /* Test til að athuga hvort virkar að senda HttpRequest á /event/{id}
 * og fá til baka view/ShowEvent.jsp síðuna sem inniheldur event með id nr.3 */
    @Test
    public void viewShowEvent() throws Exception {
        this.mockMvc.perform(get("/event/3"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(view().name("view/ShowEvent"));
    }

    /* Test til að athuga hvort virkar að senda HttpRequest á /artist/add
    * og fá til baka view/AddArtist.jsp síðuna */
    @Test
    public void viewAddArtist() throws Exception {
        this.mockMvc.perform(get("/artist/add"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(view().name("view/AddArtist"));
    }

    /* Test til að athuga hvort virkar að senda HttpRequest á /artist/{id}
    * og fá til baka view/showArtist.jsp síðuna sem inniheldur listamann með id nr.2*/
    @Test
    public void viewShowArtist() throws Exception {
        this.mockMvc.perform(get("/artist/2"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(view().name("view/showArtist"));
    }

    /* Test til að athuga hvort virkar að senda HttpRequest á /location/add
    * og fá til baka view/AddLocation.jsp síðuna */
    @Test
    public void viewAddLocation() throws Exception {
        this.mockMvc.perform(get("/location/add"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(view().name("view/AddLocation"));
    }

    /* Test til að athuga hvort virkar að senda HttpRequest á /location/{id}
    * og fá til baka view/ShowLocation.jsp síðuna sem inniheldur listamann með id nr.4*/
    @Test
    public void viewShowLocation() throws Exception {
        this.mockMvc.perform(get("/location/4"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(view().name("view/ShowLocation"));
    }

    /* Test til að athuga hvort virkar að senda HttpRequest á engu og fá til baka
    * view/MainPage.jsp síðuna */
    @Test
    public void viewMainPage() throws Exception {
        this.mockMvc.perform(get(""))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(view().name("view/MainPage"));
    }

}
