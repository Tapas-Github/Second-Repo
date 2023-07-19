package calculatortest;


import org.testng.annotations.Test;
import calculatorevents.Calculatorevents;


public class Sampletest1 extends BaseTest {
	@Test
	public void firstexemethod() throws InterruptedException {
		System.out.println("Begin Test Sampletest1");
		Calculatorevents ce = new Calculatorevents(getDriver());
		ce.firstmethod();
		System.out.println("End of Test Sampletest1");
	}
}
