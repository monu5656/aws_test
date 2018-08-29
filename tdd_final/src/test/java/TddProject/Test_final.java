package TddProject;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Test_final {

	@Test
	public void f1(){
		
		
		System.out.print("mera name");
		System.setProperty("webdriver.gecko.driver","/monu_tom/geckodriver");
		File pathBinary = new File("/usr/bin/firefox");
		FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);   
		DesiredCapabilities desired = DesiredCapabilities.firefox();
		FirefoxOptions options = new FirefoxOptions();
		desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
		WebDriver driver = new FirefoxDriver(options);
		driver.get("http://52.74.156.183:8070/Spring3HibernateApp-0.0.1-SNAPSHOT/");
	}
	
}
