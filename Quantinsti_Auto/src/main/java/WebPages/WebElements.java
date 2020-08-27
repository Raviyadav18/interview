package WebPages;

import org.openqa.selenium.By;

import Quantinsti.Quantinsti_Auto.BaseClass;

public class WebElements extends BaseClass {

	public void browse_course() throws InterruptedException {
/*		driver.findElement(By.xpath("//li[@class='item menu__link--toggle']//a[@href='/courses']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//SPAN[text()='Sentiment Analysis in Trading']")).click();
		*/
		driver.get("https://quantra.quantinsti.com/learning-track/sentiment-analysis-trading");
	}
}
