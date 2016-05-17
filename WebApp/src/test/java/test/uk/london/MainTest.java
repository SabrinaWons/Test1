package test.uk.london;

import org.junit.Assert;
import org.junit.Test;

import uk.london.Main;

public class MainTest {

	@Test
	public void testMain(){
		String expected = "Hello World";
		String actual = Main.sayHello();
		Assert.assertEquals(actual, expected);
	}
	
	
}
