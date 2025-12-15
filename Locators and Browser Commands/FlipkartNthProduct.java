package selniumassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartNthProduct {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		driver.findElement(By.cssSelector("input[name='q']")).click();
		
		driver.findElement(By.cssSelector("input[class='Pke_EE']")).sendKeys("laptop");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		
		driver.findElement(By.xpath("(//div[@class='RG5Slk'])[7]")).click();
	}

}
