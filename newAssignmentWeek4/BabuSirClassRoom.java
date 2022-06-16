package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BabuSirClassRoom {

	public static void main(String[] args) {
	/* Classroom Exercise
1) Launch chrome and go to http://www.leafground.com/pages/Link.html
2) Get all the links (using findElements)
3) Click on the first link (using get method with index as 0)
4) Print the title
5) Navigate back on the browser (driver.navigate().back())
6) Get all the links again (using findElements)
7) Print the count of the links (size)
8) print the href value (getAttribute) of the second link
Time: 20 Minutes (max)*/	
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://www.leafground.com/pages/Link.html");
		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		allLink.get(0).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
	
	List<WebElement> countLink = driver.findElements(By.tagName("a"));
	int linkSize = countLink.size();
	System.out.println(linkSize);
	String attribute = countLink.get(1).getAttribute("id");
	System.out.println(attribute);
	
		
		
	}

}
