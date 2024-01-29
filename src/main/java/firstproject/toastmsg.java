package firstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class toastmsg {
    WebDriver driver;

    @Test(expectedExceptions = { } )
    public void toast()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://codeseven.github.io/toastr/demo.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id = 'title']")).sendKeys("sathish");
        driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("test_plan");
        driver.findElement(By.xpath("//button[@id='showtoast']")).click();
        String expectedTitle = "toastr examples";
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title " +actualTitle);
        Assert.assertEquals(expectedTitle,actualTitle,"Pass");

        driver.close();
    }

}
