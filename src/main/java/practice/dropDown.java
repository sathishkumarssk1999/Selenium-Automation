package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class dropDown {
    @Test
    public void select() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/dropdowns");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Find the WebElement and click on it
        WebElement fruits = driver.findElement(By.xpath("//*[@id= 'fruits']"));
        fruits.click();
        Select myFruits = new Select(fruits);
        myFruits.selectByVisibleText("Apple");
        Thread.sleep(5000);

        WebElement hero = driver.findElement(By.xpath("//*[@id= 'superheros']"));
        hero.click();
        Select name = new Select(hero);
        name.selectByIndex(1);
        Thread.sleep(2000);
        name.selectByValue("ta");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        WebElement lang = driver.findElement(By.xpath("//*[@id= 'lang']"));
        lang.click();
        Select ss = new Select(lang);
        ss.selectByValue("sharp");
        List<WebElement> allValue = ss.getAllSelectedOptions();
        for (WebElement WebElement : allValue) {
            System.out.println(WebElement.getText());
        }


        WebElement count = driver.findElement(By.xpath("//*[@id= 'country']"));
        count.click();
        Select india = new Select(count);
        india.selectByValue("India");


    }

    @Test
    public void drop() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/dropdowns");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement country = driver.findElement(By.xpath("//*[@id= 'country']"));
        Select count = new Select(country);


        List<WebElement> result = count.getOptions();

        for (WebElement ans : result) {
            System.out.println(ans.getText());
        }


    }

}
