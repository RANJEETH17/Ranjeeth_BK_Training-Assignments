package selniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialLinkTestLocator {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.rediff.com/");
        driver.findElement(By.linkText("Money")).click();

        Thread.sleep(1200);

        driver.findElement(By.partialLinkText("Mutual")).click();
    }
}
