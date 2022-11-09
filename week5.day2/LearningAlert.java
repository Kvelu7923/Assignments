package week5.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//span[text()='Show'][1]")).click();
		Alert simpleAlert=driver.switchTo().alert();
		simpleAlert.accept();
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert confirmationAlert=driver.switchTo().alert();
		Thread.sleep(2000);
		confirmationAlert.accept();
		
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert promptAlert=driver.switchTo().alert();
		Thread.sleep(3000);
		promptAlert.sendKeys("Kathir");
		promptAlert.accept();
		
		
	}

}
