package week4.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryResizable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//driver.findElement(By.xpath("//h3[text()='Resizable']")).click();
		driver.switchTo().frame(0);
		
		 //div[@id='resizable']
		Thread.sleep(2000);
		WebElement resize = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-s']/following-sibling::div[1]"));
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(resize, 40, 50).perform();
	}

}
