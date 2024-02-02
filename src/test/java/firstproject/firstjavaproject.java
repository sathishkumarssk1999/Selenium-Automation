package firstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class firstjavaproject {

    @Test(priority=2)
    void setup()
    {
     System.out.println(" I am inside setup");
    }

    @Test(priority=1)
    void test()
    {
        System.out.println(" I am inside test");
    }

    @Test(priority=3)
    void sample()
    {
        System.out.println(" I am inside sample");
    }

    @Test(alwaysRun = true)
    void alwaysrun()
    {
        System.out.println(" I am alwaysrun");
    }

    @Test(enabled = false)
    void enable()
    {
        System.out.println(" I am enabled");
    }

    @Test
    void description()
    {
        System.out.println(" I am description");
    }

}

