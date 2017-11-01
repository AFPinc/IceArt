package main;

import main.controller.*;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
/**
 * @author Ása Júlía Aðalsteinsdóttir
 * @author Melkorka Mjöll Jóhansdóttir
 * @author Sigurlaug Þórðardóttir
 * @author Vagerður Sigfinnsdóttir
 * @date október 2017 
 * HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 * 
 * Prófunarklasi sem athugar hvort Controller klasarnir keyri
*/

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmokeTest {

        @Autowired
        ArtistController artistController;

        @Autowired
        EventController eventController;

        @Autowired
        LocationController locationController;

        @Autowired
        MainController mainController;

        @Autowired
        SearchController searchController;

        /**
         * Aðferð til að athuga hvort Controller hlutir hafi verið búnir til
         */
        
	@Test
	public void contextLoads() {

                    assertThat(artistController).isNotNull();
                    assertThat(eventController).isNotNull();
                    assertThat(locationController).isNotNull();
                    assertThat(mainController).isNotNull();
                    assertThat(searchController).isNotNull();
	}

}
