package week4.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickAndHold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://leafground.com/pages/selectable.html");

		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));

		//Create object for Actions class and pass the driver as argument
		Actions builder = new Actions(driver);
		builder
		.keyDown(Keys.CONTROL)
		.click(item1)
		.click(item3)
		
		.click(item5)
		.keyUp(Keys.CONTROL)
		.perform();
	}

}
