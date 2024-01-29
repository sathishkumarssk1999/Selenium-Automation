package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class button
{
    @Test
    public void buttons() throws IOException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/buttons");
        String name = driver.getTitle();
        driver.manage().window().maximize();
        System.out.println(name);

        driver.findElement(By.xpath("//*[@id= 'home']")).click();
        driver.navigate().back();

        WebElement xy = driver.findElement(By.xpath("//*[@id= 'position']"));
        Point point = xy.getLocation();

        int x = point.getX();
        int y = point.getY();
        System.out.println("x and y coordinates are " + x +" " + y );

        WebElement color = driver.findElement(By.xpath("//*[@id= 'color']"));
        String result = color.getCssValue("background-color");
        System.out.println("button color"+result);

        boolean enable = driver.findElement(By.xpath("//*[@id= 'isDisabled']")).isEnabled();
        System.out.println(enable);

        driver.quit();
    }

}
