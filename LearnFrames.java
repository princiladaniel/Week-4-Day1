package week4.Day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//frame1
		driver.switchTo().frame(0);
		WebElement button1=driver.findElement(By.id("click"));
		button1.click();
		String text=driver.findElement(By.id("click")).getText();
		System.out.println(text);
		//1.Take the the screenshot of the click me button of first frame
				File source = driver.getScreenshotAs(OutputType.FILE);
				File destination = new File("./leafground.png");
				FileUtils.copyFile(source, destination);
		//Nested frame
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement button2=driver.findElement(By.id("Click1"));
		button2.click();
		String text1=driver.findElement(By.id("Click1")).getText();
		System.out.println(text1);
		/*- find the Elements by tagname - iframe
		  - Store it in a list
		  - Get the size of the list. (This gives the count of the frames visible to the main page)*/
		//total frame
		driver.switchTo().defaultContent();
		List<WebElement>totalframes= driver.findElements(By.tagName("iframe"));
		int size=totalframes.size();
		System.out.println(size);

	}



}
