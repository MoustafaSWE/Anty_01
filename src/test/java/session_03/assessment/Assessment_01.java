package session_03.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

public class Assessment_01 {

    /*
    Test Case No1 : Validate that user can log in successfully
        1. Open URL: https://www.saucedemo.com/v1/
        2. Enter Valid username: standard_user
        3. Enter Valid Password: secret_sauce
        4. Click On Login
     */

    public static void main(String[] args) {


        // 1. Open URL: https://www.saucedemo.com/v1/

        // 2. Enter Valid username: standard_user

        // 3. Enter Valid Password: secret_sauce

        // 4. Click On Login
        WebDriver driver;
driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("standard_user");
        driver.findElement(By.id("Password")).sendKeys("secret_sauce");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.elementToBeClickable(driver
        .findElement(By.id("login-button")))).click();

    }
}
