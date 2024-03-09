package firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {
    @Parameters({"email", "pass", "browser"})
    @Test
    void para(String email, String pass, String browser) throws InterruptedException {
        WebDriver driver;

        if (browser.equals("chrome")) {
            driver = new ChromeDriver();
        } else {
            driver = new FirefoxDriver();
        }
        driver.get("https://letcode.in/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//*[@class=\"button is-primary is-rounded is-small\"])[2]")).click();
        driver.findElement(By.xpath("//*[@name='email']")).sendKeys(email);
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys(pass);


        // driver.quit();
    }
}
