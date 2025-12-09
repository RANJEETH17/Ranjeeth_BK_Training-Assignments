package selniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioBtn_Checkbox {

	public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.cssSelector("input[value='radio2']")).click();
        Thread.sleep(1000);

        
        driver.findElement(By.id("checkBoxOption1")).click();
        Thread.sleep(500);

        driver.findElement(By.id("checkBoxOption3")).click();
        Thread.sleep(500);

    }


}
