package firstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class seleniumtest {

    @Test(timeOut = 10000)
    public void setup() throws InterruptedException, IOException
      {
          WebDriverManager.chromedriver().setup();
          WebDriver driver = new ChromeDriver();
          driver.get("https://web.workline.hr/");
          driver.manage().window().maximize();
          //TIME OUT COMMAND
          driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
          driver.findElement(By.xpath("//input[@id = 'txtClientCode']")).sendKeys("Solartis");
          driver.findElement(By.xpath("//input[@value='Submit']")).click();
          File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
          File g = new File("F:\\Automation\\automation\\SS\\s.jpg");
          FileHandler.copy(f, g);
          driver.quit();
      }


    @Test( invocationCount = 1, threadPoolSize= 1)
    public void scroll()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.zoho.com/");
        driver.manage().window().maximize();
       // driver.findElement(By.xpath("//a[@class = 'login']")).click();
       // driver.findElement(By.xpath("//input[@id = '']")).sendKeys("gicey48988@notedns.com");
        driver.findElement(By.id("login_id")).sendKeys("gicey48988@notedns.com");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.switchTo().defaultContent();
       // driver.close();
    }

}
