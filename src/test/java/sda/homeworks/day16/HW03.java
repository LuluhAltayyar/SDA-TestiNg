package sda.homeworks.day16;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import sda.tests.utilities.TestBase;

public class HW03 extends TestBase {

    //Test Case3: Parametrized Negative Test
    @Test
    @Parameters({"username","password"})
    public void NegativeLogin(String username, String password ) throws InterruptedException {
        //Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        //Click Submit button.
        driver.findElement(By.id("submit")).click();

        Thread.sleep(1000);
        //Verify error message is displayed.
        Assert.assertTrue(driver.findElement(By.id("error")).isDisplayed());


    }
}
