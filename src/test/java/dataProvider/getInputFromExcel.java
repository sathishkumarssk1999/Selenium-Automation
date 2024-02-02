package dataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.*;

public class getInputFromExcel {

    @DataProvider(name = "loginData")
    public static Object[][] getDataFromExcel() throws IOException {

        File f = new File("src/main/resources/sample_testdata.xlsx");
        FileInputStream fis = new FileInputStream(f);
        Workbook wb = WorkbookFactory.create(fis);
        Sheet excelSheetName = wb.getSheet("login");

        int rowCount = excelSheetName.getLastRowNum();
        System.out.println(rowCount);
        int columnCount = excelSheetName.getRow(0).getLastCellNum();
        System.out.println(columnCount);

        Object[][] excelData = new Object[rowCount][columnCount];
        DataFormatter dataFormat = new DataFormatter();

        for (int i = 1; i <= rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                excelData[i - 1][j] = dataFormat.formatCellValue(excelSheetName.getRow(i).getCell(j));
                System.out.println(excelData[i - 1][j]);

            }
        }

        return excelData;
    }


   @Test(dataProvider = "loginData")
   public void loginTest(String email, String pass) {

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

