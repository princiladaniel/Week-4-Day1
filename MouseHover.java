package week4.Day2;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.snapdeal.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement menfashion =driver.findElement(By.xpath("(//span[contains(text(),'Fashion')])[5]"));
		//Create object for Action class and pass the driver as argu
		Actions builder=new Actions(driver);
		builder.moveToElement(menfashion).perform();
		
		 //driver.get("http://www.leafground.com/pages/mouseOver.html#");
		 //WebElement TestCourse = driver.findElement(By.linkText("TestLeaf Courses"));
		 //Actions builder=new Actions(driver);
		 //builder.moveToElement(TestCourse).perform();
		 
	}

}
