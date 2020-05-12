package dockerValidation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest3 {

	@Test
	public void test3() throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		URL url = new URL("http://192.168.99.100:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, cap);
		driver.get("http://yahoo.com");
		System.out.println(driver.getTitle());
	}

}
