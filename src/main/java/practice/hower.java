package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class hower {

    @Test
    public void mouse() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//*[@role='button'])[3]")).click();

        WebElement mouse = driver.findElement(By.xpath("(//*[@class='_27h2j1'])[2]"));
        Actions a = new Actions(driver);
        a.moveToElement(mouse).perform();
        WebElement click = driver.findElement(By.xpath("(//*[@class='_1BJVlg'])[2]"));
        click.click();


    }


}
