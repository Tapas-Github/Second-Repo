package calculatorevents;

import calculatorobjects.Calculatorelements;
import io.appium.java_client.AppiumDriver;
import utils.Elementfetch;

public class Calculatorevents {
	 AppiumDriver driver;
	    public Calculatorevents(AppiumDriver driver){
	        this.driver=driver;
	    }

	    public void firstmethod() throws InterruptedException {
	        Elementfetch ef= new Elementfetch();
	        ef.getwebelement(driver,"ID", Calculatorelements.one).click();
	        Thread.sleep(1000);
	        ef.getwebelement(driver,"ID", Calculatorelements.plus).click();
	        Thread.sleep(1000);
	        ef.getwebelement(driver,"ID", Calculatorelements.two).click();
	        Thread.sleep(1000);
	        ef.getwebelement(driver,"ID", Calculatorelements.equals).click();
	        Thread.sleep(1000);

	    }
	    public void secondmethod() throws InterruptedException {
	        Elementfetch ef= new Elementfetch();
	        ef.getwebelement(driver,"ID", Calculatorelements.one).click();
	        Thread.sleep(1000);
	        ef.getwebelement(driver,"ID", Calculatorelements.plus).click();
	        Thread.sleep(1000);
	        ef.getwebelement(driver,"ID", Calculatorelements.two).click();
	        Thread.sleep(1000);
	        ef.getwebelement(driver,"ID", Calculatorelements.equals).click();
	        Thread.sleep(1000);
	    }
}
