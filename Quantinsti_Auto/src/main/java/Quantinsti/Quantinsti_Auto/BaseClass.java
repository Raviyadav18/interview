package Quantinsti.Quantinsti_Auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	
	public void open_browser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ryadav\\Downloads\\chromedriver_win32 83\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://quantra.quantinsti.com/");
	driver.manage().window().maximize();
	}
	

}
