package calculatortest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {

	public ThreadLocal<AppiumDriver> driver = new ThreadLocal<AppiumDriver>();

	public void setDriver(AppiumDriver driver) {
		this.driver.set(driver);
	}

	public AppiumDriver getDriver() {
		return this.driver.get();
	}
	
	@BeforeSuite
	public void before() {
		System.out.println("Before Suite ...");
	}

	@BeforeTest
	@Parameters({ "devicename", "platformversion", "portnumber", "udid" })
	public void initiatedriver(String devicename, String platformversion, String portnumber, String udid)
			throws MalformedURLException {
		System.out.println("devicename:" + devicename);
		startappiumservice(portnumber);
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Pixel XL");
		caps.setCapability("platformVersion", "8.0.0");
		caps.setCapability("udid", "emulator-5554");
		caps.setCapability("platformName", "Android");
		caps.setCapability("appPackage", "com.android.calculator2");
		caps.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		System.out.println("befor driver initiated");
		setDriver(new AndroidDriver(new URL("http://127.0.0.1:" + portnumber + "/wd/hub"), caps));
		System.out.println("driver initiated");
	}

	@AfterTest
	public void closedriver() {
		getDriver().quit();
	}

	public void startappiumservice(String portnumber) {
		AppiumDriverLocalService service;
		AppiumServiceBuilder builder = new AppiumServiceBuilder();
		builder.withIPAddress("127.0.0.1");
		builder.usingPort(Integer.parseInt(portnumber));
		service = AppiumDriverLocalService.buildService(builder);
		service.start();
		System.out.println("Service has been started with port number" + portnumber);
	}

}
