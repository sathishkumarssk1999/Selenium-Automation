package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class registerpage {

  //  RemoteWebDriver driver=null;
    private final WebDriver driver;
    public registerpage(WebDriver driver) {
        this.driver = driver;
    }
    //enter register form
    public void Enterfullname(String firstname, String lastname)
    {
      driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(firstname);
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(lastname);

    }
    public void address(String address)
    {
        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(address);
    }
    public void Emailaddress(String email)
    {
        driver.findElement(By.xpath("//*[@type='email']")).sendKeys(email);
    }

  public void Phone(String no)
  {
    driver.findElement(By.xpath("//*[@type='tel']")).sendKeys(no);
  }

  public void Gender()
  {
    driver.findElement(By.xpath("//*[@value='Male']")).click();
  }

  public void Hobbies()
  {
    driver.findElement(By.xpath("//*[@id='checkbox1']")).click();
  }
  public void lang()
  {
    driver.findElement(By.xpath("//*[@id='msdd']")).click();
    driver.findElement(By.xpath("//a[text()='Arabic']")).click();
  }
  public void skill()
  {
    WebElement skill = driver.findElement(By.xpath("//*[@id='Skills']"));
    Select ss = new Select(skill);
    ss.selectByValue("SQL");
  }
  public void country()
  {
    driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
    driver.findElement(By.xpath("(//*[text()='India'])[2]")).click();
  }

  public void DOB()
  {
    WebElement year = driver.findElement(By.xpath("//*[@id='yearbox']"));
    WebElement mon = driver.findElement(By.xpath("//*[@ng-model='monthbox']"));
    WebElement date = driver.findElement(By.xpath("//*[@id='daybox']"));

    Select x = new Select(year);
    Select y = new Select(mon);
    Select z = new Select(date);

    x.selectByValue("1999");
    y.selectByValue("December");
    z.selectByValue("5");
  }
  public void pass()
  {
    driver.findElement(By.xpath("//*[@id='firstpassword']")).sendKeys("Password@123");
    driver.findElement(By.xpath("//*[@id='secondpassword']")).sendKeys("Password@123");
  }
}
