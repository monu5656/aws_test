package TddProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test_final {

	@Test
	public void f1(){
		System.setProperty("webdriver.gecko.driver","//usr//local//bin//geckodriver");
		WebDriver dd = new FirefoxDriver();
		dd.get("http://52.74.156.183:8090/Spring3HibernateApp-0.0.1-SNAPSHOT/");
		System.out.print("mera name");
	}
	
}
