package chrome.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromeBrowser {

    public static void main(String args[]) throws InterruptedException {

        System.out.println("testing chrome ");
        System.setProperty("webdriver.chrome.driver", "/Users/anand.kumar/Downloads/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://demoqa.com");
        Thread.sleep(3000);



        webDriver.quit();
        System.out.println("Chrome testing completed ");
    }
}
