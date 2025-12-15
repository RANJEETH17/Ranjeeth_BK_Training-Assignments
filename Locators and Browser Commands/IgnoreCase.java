package selniumassignment;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IgnoreCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Browser Name (Brave / Chromium): ");
        String browser = sc.nextLine();

        WebDriver driver = null;

        // Brave Browser
        if (browser.equalsIgnoreCase("Brave")) {

            ChromeOptions options = new ChromeOptions();
            options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");

            driver = new ChromeDriver(options);
        } 
        // Chromium Browser
        else if (browser.equalsIgnoreCase("Chromium")) {

            ChromeOptions options = new ChromeOptions();
            options.setBinary("C:\\Program Files\\Chromium\\Application\\chrome.exe");

            driver = new ChromeDriver(options);
        }
        else {
            System.out.println("Invalid Browser Name. Please enter Brave / Chromium.");
            sc.close();
            return;
        }

        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org/");

        System.out.println(browser + " launched successfully!");

        sc.close();
    }
}
