package week4.Day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//AlertBox
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert alertBox =driver.switchTo().alert();
		//Thread.sleep(3000);
		alertBox.accept();
		//Confirm Box
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Alert confirmAlert=driver.switchTo().alert();
		Thread.sleep(3000);
		confirmAlert.dismiss();
		//PromptBox
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Alert PromptAlert=driver.switchTo().alert();
		Thread.sleep(3000);
		PromptAlert.sendKeys("Teaching");
		PromptAlert.accept();

		//LineBreak
		driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
		Alert LineBreak=driver.switchTo().alert();
		Thread.sleep(3000);
		LineBreak.accept();
		//SweetAlert
		driver.findElement(By.xpath("//*[@id='btn']")).click();
		//Alert SweetAlert=driver.switchTo().alert();
		Thread.sleep(3000);
		//SweetAlert.accept();
	}


}
