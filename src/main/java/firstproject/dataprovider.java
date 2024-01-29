package firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
     @DataProvider(name = "login")
     public String[][] readdata()
     {
         String[][] data= new String[2][2];
         data[0][0] = "fekifa5804@rentaen.com" ;
         data[0][1] = "fekifa5804@" ;

         data[1][0] = "fekifa5804@rentaen.com" ;
         data[1][1] = "fekifa5804@" ;
         return data;
     }


    @Test(dataProvider ="login")
    public void data(String email,String pass) throws InterruptedException
    {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://letcode.in/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//*[@class=\"button is-primary is-rounded is-small\"])[2]")).click();
        driver.findElement(By.xpath("//*[@name='email']")).sendKeys(email);
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys(pass);
    }


}
