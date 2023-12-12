import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AirthematicTest {

	public String message = "Biva";
	
	JUnitMessage junitMessage = new JUnitMessage(message);
	
	@Test(expected = ArithmeticException.class)
	public void testJUnitMessage(){

		System.out.println("Junit Message is printing ");
		junitMessage.printMessage();

	}

	@Test
	public void testJUnitHiMessage(){ 
		message="Hi!" + message;
		System.out.println("Junit Message is printing ");
		assertEquals(message,junitMessage.printHiMessage());
		
	
	}
}

