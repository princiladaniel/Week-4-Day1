package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//1. Launch the URL http://www.leafground.com/pages/table.html
		driver.get("http://testleaf.herokuapp.com/pages/table.html");
			WebElement table = driver.findElement(By.tagName("table"));
			//2. Get the count of number of rows
		List<WebElement> row = table.findElements(By.tagName("tr"));
			int rowSize = row.size();
			System.out.println(rowSize);
		//3. Get the count of number of columns
		
		  List<WebElement> coloumn =table.findElements(By.tagName("th"));
		  System.out.println(coloumn.size());
		 //Get the progress value of Learn To interact with element
		  for (int i = 1; i <=3; i++) {
			System.out.println(row.get(i).getText());
			  
			
		}
		  //String progress= driver.findElement(By.xpath("//tr[@class='even']//td[2]")).getText();
          //System.out.println("progress value"+progress);
          //Check the vital task for least completed progress
		  Set<String>str=new TreeSet<String>();
		  for (int i = 2; i <=rowSize; i++) {
         String least = table.findElement(By.xpath("//table//tr["+i+"]/td[2]")).getText();
	        
		//System.out.println(least);
		String replaceValue = least.replaceAll("%", " ");
		System.out.println(replaceValue);
		  str.add(replaceValue.trim());
		  }
          
		System.out.println(str);
	
	List<String> lst=new ArrayList<String>(str);
	List<Integer> intlst=new ArrayList<Integer>();
	for (String integer : lst) {
	intlst.add(Integer.valueOf(integer));
}
Collections.sort(intlst);
System.out.println(intlst);
//Check the vital task for the least completed progress
int input=intlst.get(0);
driver.findElement(By.xpath("//td/font[contains(text(),'"+input+"')]/following::input")).click();
	}
	
}
