import static org.junit.Assert.*;

import org.junit.Test;

public class GoogleTestPage {
	
	@Test
	public void testSearch(){
		HomePage home = new HomePage();		
		ResultPage result = home.search("automated testing info");
		assertTrue(result.getFirstLink().contains("automated"));
	}

}
