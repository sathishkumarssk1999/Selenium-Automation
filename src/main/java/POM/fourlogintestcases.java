package POM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class fourlogintestcases {

    String[][] data =
            {
                    {"fekifa5804@rentaen.com", "fekifa5804@"},
                    {"fekifa5804@1rentaen.com", "fekifa5804@1"},
                    {"fekifa5804@1rentaen.com", "fekifa5804@"},
                    {"fekifa5804@rentaen.com", "fekifa5804@1"}
            };

    @DataProvider(name = "logindata")
    public String[][] login() {
         return data;
    }


    @Test(dataProvider = "logindata")
    public void fourlogins(String email, String pass)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("(//*[@class=\"button is-primary is-rounded is-small\"])[2]")).click();

        WebElement username = driver.findElement(By.xpath("//*[@name='email']"));
        username.sendKeys(email);

        WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
        password.sendKeys(pass);

        WebElement button = driver.findElement(By.xpath("(//*[@class='button is-primary'])[1]"));
        button.click();

        driver.quit();
    }
}
