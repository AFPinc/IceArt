package is.hi.vidmotDaemi;

import main.controller.*;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
/**
 *
 * @author Ása Júlía Aðalsteinsdóttir
 * @author Melkorka Mjöll
 * @author Sigurlaug Þórðardóttir
 * @author Valgerður Sigfinnsdóttir
 * @date október 2017 
 * HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 * 
 * Prófunarklasi sem athugar hvort KennariController keyrir 
*/

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmokeTest {
    
        @Autowired
        Acc

        /**
         * Aðferð til að athuga hvort KennariController hlutur hefur verið búinn til 
         */
        
	@Test
	public void contextLoads() {
        
                   assertThat(kennariController).isNotNull();
	}

}
