package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class alert {
    @Test
    public void alertmsg() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/alert");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id= 'accept']")).click();
        Alert alert = driver.switchTo().alert();
        String al = alert.getText();
        System.out.println(al);
        alert.accept();

        driver.findElement(By.xpath(" //*[@id= 'prompt'] ")).click();
        driver.switchTo().alert();
        alert.sendKeys("sample");
        alert.accept();
        String name = driver.findElement(By.xpath(" //*[@id = 'myName'] ")).getText();
        System.out.println(name);

    }

    @Test
    public void validation() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/");
        driver.manage().window().maximize();

        //is displayed
        WebElement vali = driver.findElement(By.xpath(" //*[@class = 'button is-primary is-rounded is-small'][1] "));
        boolean answer = vali.isDisplayed();
        System.out.println(answer);

        //is enabled
        driver.navigate().to("https://letcode.in/edit");
        boolean answers = driver.findElement(By.xpath("//*[@id= 'noEdit']")).isEnabled();
        System.out.println(answers);

        //is selected
        driver.navigate().to("https://letcode.in/radio");
        boolean answerss = driver.findElement(By.xpath("//*[@class= 'checkbox'][1]")).isSelected();
        System.out.println(answerss);

    }
}
