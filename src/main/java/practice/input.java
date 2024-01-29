package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class input {

    @Test
    public void input()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/edit");
    }

    @Test
    public void methods()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/edit");
        driver.findElement(By.xpath("//input[@id= 'fullName']")).sendKeys("name");
        driver.findElement(By.xpath("//input[@id= 'join']")).sendKeys(" & I am done", Keys.TAB);

        String name = driver.findElement(By.xpath("//input[@id= 'getMe']")).getAttribute("value");
        System.out.println(name);
        driver.findElement(By.xpath("//input[@id= 'clearMe']")).clear();
        boolean answer = driver.findElement(By.xpath("//input[@id= 'noEdit']")).isEnabled();
        System.out.println(answer);
        String named = driver.findElement(By.xpath("//input[@id= 'dontwrite']")).getAttribute("value");
        System.out.println(named);

    }
}
