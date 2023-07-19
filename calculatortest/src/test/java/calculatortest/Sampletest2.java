package calculatortest;



import org.testng.annotations.Test;

import calculatorevents.Calculatorevents;

public class Sampletest2 extends BaseTest{
	@Test
    public void secondexemethod() throws InterruptedException {
        Calculatorevents ce = new Calculatorevents(getDriver());
        ce.secondmethod();
    }
}
