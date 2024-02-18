package interview;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class firstRoundMyself {
    @Test
    void test() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();

        // user try to Log in the site
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

        // user try to click three symbols
        driver.findElement(By.xpath("//*[@id='react-burger-menu-btn']")).click();
        Thread.sleep(5000);
        // user try to click the about page
        driver.findElement(By.xpath("//a[@id='about_sidebar_link']")).click();

        //Check if user is taken to https://saucelabs.com/ site
        String name1 = driver.getCurrentUrl();
        String name2 = "https://saucelabs.com/";
        if (name1.equals(name2)) {
            System.out.println("you are in saucelabs page ");
        } else {
            System.out.println("you are not in the saucelabs page ");
        }


        //Check if user is taken tosaucedemo PRODUCTS page
        driver.navigate().back();
        String name3 = driver.getCurrentUrl();
        String name4 = "https://www.saucedemo.com/inventory.html";

        if (name3.equals(name4)) {
            System.out.println("you are in the saucedemo product page ");
        } else {
            System.out.println("you are not in the saucedemo product page ");
        }


        // Select the item with the highest price
        // Assume each product has a 'price' class indicating the price
        List<WebElement> productPrices = driver.findElements(By.xpath("//*[@class='inventory_item_price']"));

        //double maxPrice = 0;
        System.out.println(productPrices.size());
        double[] myNum = new double[productPrices.size()];
        ;
        int i = 0;
        for (WebElement webElement : productPrices) {
            String name = webElement.getText().replace("$", " ");
            myNum[i] = Double.parseDouble(name);
            System.out.println(myNum[i]);
            ++i;
        }

        double maxValue = Arrays.stream(myNum).max().orElse(Double.NaN);
        System.out.println(maxValue);

        driver.findElement(By.xpath("//*[@class='btn btn_primary btn_small btn_inventory ']")).click();


        // user try to check your in cart page
        String cart1 = driver.findElement(By.xpath("//*[@class='title']")).getText();
        String cart2 = "Your Cart";

        if (cart1.equals(cart2)) {
            System.out.println("you are in the cart page ");
        } else {
            System.out.println("you are not in the cart page ");
        }
        driver.findElement(By.xpath("//*[@id='checkout']")).click();


        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("sample name");
        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("sample last name");
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("795433");
        driver.findElement(By.xpath("//input[@id='continue']")).click();


        String checkout1 = driver.findElement(By.xpath("//*[@class='title']")).getText();
        String checkout2 = "Checkout: Overview";
        if (checkout1.equals(checkout2)) {
            System.out.println("you are in the checkout page ");
        } else {
            System.out.println("you are not in the checkout page ");
        }
        driver.quit();

    }
}
