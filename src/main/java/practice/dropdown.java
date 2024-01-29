package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class dropdown
{
    @Test
    public void select() throws IOException, InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/dropdowns");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Find the WebElement and click on it
        WebElement fruits = driver.findElement(By.xpath("//*[@id= 'fruits']"));
        fruits.click();
        Select myfruits = new Select(fruits);
        myfruits.selectByVisibleText("Apple");
        Thread.sleep(5000);

        WebElement hero = driver.findElement(By.xpath("//*[@id= 'superheros']"));
        hero.click();
        Select name = new Select(hero);
        name.selectByIndex(1);
        Thread.sleep(2000);
        name.selectByValue("ta");

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");

        WebElement lang = driver.findElement(By.xpath("//*[@id= 'lang']"));
        lang.click();
        Select prog = new Select(lang);
        prog.selectByValue("sharp");
        List<WebElement> allvalue = prog.getAllSelectedOptions();
        for (WebElement WebElement : allvalue)
        {
            System.out.println(WebElement.getText());
        }


        WebElement count = driver.findElement(By.xpath("//*[@id= 'country']"));
        count.click();
        Select india = new Select(count);
        india.selectByValue("India");



    }

    @Test
    public void drop() throws IOException, InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/dropdowns");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement country = driver.findElement(By.xpath("//*[@id= 'country']"));
        Select count = new Select(country);


        List<WebElement> result = count.getOptions();

        for (WebElement ans : result )
        {
          System.out.println(ans.getText());
        }


    }

}
