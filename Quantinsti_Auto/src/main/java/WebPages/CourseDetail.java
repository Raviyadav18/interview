package WebPages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Quantinsti.Quantinsti_Auto.BaseClass;

public class CourseDetail extends BaseClass{

	public void detail() {
		String coursename=driver.findElement(By.xpath("//*[text()='Learning Track: Sentiment Analysis in Trading']")).getText();
		System.out.println("course name is :" + coursename);
		String price=driver.findElement(By.xpath("//*[text()='₹35192']")).getText();
		System.out.println("course price :" + price);
		driver.findElement(By.xpath("//div[@class='course-detail__buttons']//button[@type='button']")).click();
		
	}
	
	public void detaiedlist(){
	
			List<WebElement> myElements = driver.findElements(By.xpath("//div//h5[@class='cart-item-title']"));
			System.out.println("Toatal No. of course : " + myElements.size());
			for (WebElement e : myElements) {
				System.out.println(e.getText());
			}

			System.out.println("====================================================");
		
	}
	
	public void detaiedlistprice(){
		
		List<WebElement> myElements = driver.findElements(By.xpath("//div[@class='cart-item-right-section']//del"));
		System.out.println("Toatal No. of courseprice : " + myElements.size());
		for (WebElement e : myElements) {
			System.out.println(e.getText());
		}
		String cart=driver.findElement(By.xpath("//li//a[@href='/cart']//span[text()='5']")).getText();
		System.out.println("no of course in cart " + cart);
		String coursecount=Integer.toString(myElements.size());
		if(cart.equalsIgnoreCase(coursecount)) {
			
			System.out.println("Course count is correct");
		}
		else {
			System.out.println("course count is incorrect");
		System.out.println("====================================================");
		
		String baseamount=driver.findElement(By.xpath("//DIV[@class='cart-summary-right'][text()='₹35192']")).getText();
		System.out.println("Base Amount is :" + baseamount);
		System.out.println(driver.findElement(By.xpath("//div[@class='cart-summary-item amt-payable-wrap']")).getText());
	}

	public void viewdetails() throws InterruptedException {
		driver.findElement(By.xpath("//a[@href='/course/python-for-trading']")).click();
		
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    Thread.sleep(2000);
	    driver.close();
	    driver.switchTo().window(tabs2.get(0));
	    driver.navigate().refresh();
	    Thread.sleep(2000);
	    
	}
		
	public void removelink() throws InterruptedException {
		
		driver.findElement(By.xpath("(//A[@href='javascript:void(0);'][text()='Remove'][text()='Remove'])[1]")).click();
		Thread.sleep(3000);
	//	Alert alert=driver.switchTo().alert();
		Thread.sleep(3000);
	//	String alerttext=alert.getText();
	//	System.out.println("Alert message is :" + alerttext);
		
	}
	public void coupon() {
		driver.findElement(By.xpath("//span[text()='Apply Coupon']")).click();
		WebElement e=driver.findElement(By.xpath("//div[@class='coupon-form__unit']//input[@type='text']"));
		e.clear();
		e.sendKeys("ABC");
		driver.findElement(By.xpath("//span[text()='Apply']")).click();
		driver.findElement(By.xpath("//SPAN[@aria-hidden='true'][text()='×']")).click();
		
	}	
	
}
