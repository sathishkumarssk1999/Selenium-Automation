package POM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class executefile {

   @Test

   public void login() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();

       registerpage rp = new registerpage(driver);

        rp.Enterfullname("sathish","kumar");
        rp.address("sampleaddress");
        rp.Emailaddress("sskakmrmek@gamil.com");
        rp.Phone("87945861522");
        rp.Gender();
        rp.Hobbies();
        rp.lang();
        rp.skill();

       JavascriptExecutor js = (JavascriptExecutor)driver;
       js.executeScript("window.scrollBy(0,500)");

        rp.country();
        rp.DOB();
        rp.pass();
    }
}
