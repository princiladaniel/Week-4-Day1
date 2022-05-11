package newAssignmentWeek4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		//Assignment2:
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//1. Launch the URL https://html.com/tags/table/
		driver.get("https://html.com/tags/table/");
			
			//2. Get the count of number of rows
		List<WebElement> row = driver.findElements(By.xpath("//div[@class='render']//tr"));
			int rowSize = row.size();
			System.out.println(rowSize);
		//3. Get the count of number of columns
			List<WebElement> coloumn = driver.findElements(By.xpath("(//div[@class='render']//tr)/th"));
			System.out.println(coloumn.size());

}
}