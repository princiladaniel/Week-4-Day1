package week4.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExampleFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//b[@id='topic']/following::input")).sendKeys("Frames");
		
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement animal = driver.findElement(By.id("animals"));
		Select s = new Select(animal);
		s.selectByVisibleText("Baby Cat");
		Select s1=new Select(animal);
		s1.selectByValue("big baby cat");
		Select s3=new Select(animal);
		s3.selectByIndex(3);
	}

}
