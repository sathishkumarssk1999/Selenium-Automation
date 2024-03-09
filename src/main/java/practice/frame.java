package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class frame {
    @Test
    public void frames() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/frame");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//*[@name= 'fname']")).sendKeys("dwanyne");
        driver.findElement(By.xpath("//*[@name= 'lname']")).sendKeys("John");
        driver.switchTo().frame(1);
        driver.findElement(By.xpath("//*[@name= 'email']")).sendKeys("abc@xyz.com");

        //  driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//*[@class= 'card-footer-item']")).click();

    }

    @Test(invocationCount = 2, threadPoolSize = 2)
    public void drag() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/dropable");
        driver.manage().window().maximize();

        WebElement src = driver.findElement(By.xpath("//*[@id= 'text']"));
        WebElement tar = driver.findElement(By.xpath("//*[@id= 'droppable']"));
        Actions build = new Actions(driver);
        build.dragAndDrop(src, tar).perform();

    }
}
