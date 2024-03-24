package sda.homeworks.day18;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import sda.tests.utilities.TestBase;

public class HW02 extends TestBase {

    // Test Case2: Negative Username Test
    @Test
    public void NegativeLogin() throws InterruptedException {
        //Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");

        // Type username incorrectUser into Username field.
        driver.findElement(By.id("username")).sendKeys("studentt");
        // Type password Password123 into Password field.
        driver.findElement(By.id("password")).sendKeys("Password123");
        //Click Submit button.
        driver.findElement(By.id("submit")).click();
        //Verify error message is displayed.
        Thread.sleep(500);
        Assert.assertTrue(driver.findElement(By.id("error")).isDisplayed());
        Thread.sleep(500);
        // Verify error message text is Your username is invalid!
        Assert.assertEquals(driver.findElement(By.id("error")).getText(), "Your username is invalid!");
    }
}
