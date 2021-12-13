
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class TestfinalApplicationTests {

	@Test
	public void nbPlaceInCar()
    {
		Place place = new Place ();
		assertEquals("5",place.getHashcode()); 
    }

}
