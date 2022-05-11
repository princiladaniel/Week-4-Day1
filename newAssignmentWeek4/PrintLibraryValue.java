package newAssignmentWeek4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintLibraryValue {

	public static void main(String[] args) {
		//Assignment3:
		//Assignment2:
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				//1. Launch the URL https://html.com/tags/table/
				driver.get("https://html.com/tags/table/");
			//1. Launch the URL https://html.com/tags/table/
			//2. You have to print the respective values based on given Library
			String absolute = driver.findElement(By.xpath("//div[@class='render']//tr[2]")).getText();
			System.out.println(absolute);
				//(hint: if the library was absolute usage, then print all its value)
			String text = driver.findElement(By.xpath("(//div[@class='render']//tr)[2]")).getText();
			System.out.println(text);
 List<WebElement> MarketShare = driver.findElements(By.xpath("//td[text()='Market Share']//following-sibling::td"));
 for (int i = 0; i < MarketShare.size(); i++) {
	 System.out.println(" MarketShare"+MarketShare.get(i).getText());
	
}
 
	}

}
