package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WaitInSelenium {

    public static void main(String args[]) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/anand.kumar/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String url = "https://www.facebook.com/" ;
        driver.get(url);

        String createAccount ="//a[text()='Create New Account']";
        String signUp = "//div[@id=\"reg_box\"]//button[@name=\"websubmit\"]";
        String signUp1 = "//div[text()='Sign Up']";
        String  selectDay = "//select[@title='Day']";
        String  selectMonth = "//select[@title='Month']";
        String  selectYear = "//select[@title='Year']";
        String  female="//input[@type='radio' and @value='1']";    ////label[text()='Male']
        String  male="//input[@type='radio' and @value='2']";
        String  custom="//input[@type='radio' and @value='-1']";


        driver.findElement(By.xpath(    createAccount)).click();
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath(signUp));
        Wait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.textToBePresentInElement(element,"Sign Up"));

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Anand");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kumar");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("test@gmal.com");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("234020");

        Select dropDownSelectDay = new Select(driver.findElement(By.xpath(selectDay)));
        dropDownSelectDay.selectByValue("8");

        Select dropDownSelectMonth = new Select(driver.findElement(By.xpath(selectMonth)));
        dropDownSelectMonth.selectByVisibleText("Jul");

        Select dropDownSelectYear = new Select(driver.findElement(By.xpath(selectYear)));
        dropDownSelectYear.selectByVisibleText("1990");
        driver.findElement(By.xpath(male)).click();
        Thread.sleep(3000);
        driver.close();

    }
}
