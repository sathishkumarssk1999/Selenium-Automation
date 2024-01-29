package interview;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class interview {

      @Test
      public void inter() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("Amazon");
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//*[@class='gNO89b'])[2]")).sendKeys(Keys.RETURN);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("(//*[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("smart watch");

        driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();

        WebElement Answer = driver.findElement(By.xpath("(//*[@class='a-badge-label-inner a-text-ellipsis'])[1]"));
        System.out.println(Answer.getText());
    }
   @Test
   public void newwindow()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
// A new window is opened and switches to it
        driver.switchTo().newWindow(WindowType.WINDOW);
// Loads Sauce Labs open source website in the newly opened window
        driver.get("https://opensource.saucelabs.com/");

    }
    @Test
    public void newtab()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
// A new tab is opened and switches to it
        driver.switchTo().newWindow(WindowType.TAB);
// Loads Sauce Labs open source website in the newly opened window
        driver.get("https://opensource.saucelabs.com/");



    }


}
