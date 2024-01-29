package readexcel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class getinputfromexcel

{
    @Test
    public static void main(String args[]) throws IOException {

       String filelocation = "C:\\Users\\SATHISHKUMAR S\\IdeaProjects\\sample\\Testdata\\sample_testdata.xlsx";
       XSSFWorkbook wb = new XSSFWorkbook(filelocation);
       XSSFSheet sheet = wb.getSheetAt(0);
       XSSFRow row = sheet.getRow(1);
       XSSFCell cell = row.getCell(0);
        XSSFCell cell2 = row.getCell(1);

       String value = cell.getStringCellValue();
        String value2 = cell2.getStringCellValue();
       System.out.println(value + value2);
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
