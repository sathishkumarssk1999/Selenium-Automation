package interview;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class secondone {

    @Test
    public void second () throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");

        Actions a = new Actions(driver);
        WebElement name = driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[3]"));
        a.moveToElement(name).perform();

          Thread.sleep(3000);
          driver.findElement(By.xpath("//a[text()='Drag and Drop ']")).click();
          driver.findElement(By.xpath("//*[@href='Static.html']")).click();

        WebElement source = driver.findElement(By.xpath("//*[@id='angular']"));
        WebElement target = driver.findElement(By.xpath("//*[@id='droparea']"));
        a.dragAndDrop(source,target).perform();




    }
}
