package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Quantinsti.Quantinsti_Auto.BaseClass;


public class WebElements extends BaseClass {

	public void browse_course() throws InterruptedException {
	    	
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		WebElement e= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//header[@class='nav-wrapper']//a[@href='/courses']")));
		System.out.println(e.getText());
		actions.moveToElement(e);
		WebElement subMenu = driver.findElement(By.xpath("//header[@class='nav-wrapper']//a[@href='/learning-track/sentiment-analysis-trading']"));
		actions.moveToElement(subMenu);
		actions.click().build().perform();
		Thread.sleep(1000);
		
	}
}
