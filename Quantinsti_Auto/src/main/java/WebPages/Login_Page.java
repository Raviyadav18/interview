package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Quantinsti.Quantinsti_Auto.BaseClass;

public class  Login_Page extends BaseClass {

	public void login() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(5000);
		WebElement obj=driver.findElement(By.name("email"));
		obj.click();
		obj.clear();
		obj.sendKeys("rvdv7120@gmail.com");
		WebElement obj1=driver.findElement(By.name("password"));
		obj1.click();
		obj1.clear();
		obj1.sendKeys("12345678");
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		Thread.sleep(2000);
	}
	public void signout() {
		 driver.findElement(By.xpath("//li[@class='item avatar d-user-profile']//div[text()='RY']")).click();
		 driver.findElement(By.xpath("(//A[@href='javascript:void(0);'][text()='Logout'][text()='Logout'])[2]")).click();
		 System.out.println("=======Test Case Completed=======");
		 driver.close();
	}
	
}
