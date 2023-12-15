package session_03.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Assessment_02 {

    /*
    Test Case No1 : Validate that user can log in successfully
        1. Open URL: https://www.saucedemo.com/v1/
        2. Enter Invalid username: standard
        3. Enter Invalid Password: secret
        4. Click On Login


        
     */

    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("standard");
        driver.findElement(By.id("Password")).sendKeys("secret");
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("login-button")))).click();

        // 1. Open URL: https://www.saucedemo.com/v1/

        // 2. Enter Valid username: standard

        // 3. Enter Valid Password: secret

        // 4. Click On Login



    }
}
