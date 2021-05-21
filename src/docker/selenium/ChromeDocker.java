package docker.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class ChromeDocker {

    public static void main(String args[]) throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName(BrowserType.CHROME);
        WebDriver driver;
        driver = new RemoteWebDriver(new URL("http://localhost:4545/wd/hub"), cap);

        driver.get("http://www.google.com");

        driver.findElement(By.name("q")).sendKeys("testing");

        driver.close();



    }
}
