package sda.homeworks.day15;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import sda.tests.utilities.TestBase;

public class D15HW03 extends TestBase {

    // Test Case3: Negative Password Test
    @Test
    public void NegativeLogin() {
        //Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");

        // Type username student into Username field.
        driver.findElement(By.id("username")).sendKeys("student");
        // Type password incorrectPassword into Password field.
        driver.findElement(By.id("password")).sendKeys("Password1233");
        //Puch Submit button.
        driver.findElement(By.id("submit")).click();
        //Verify error message is displayed.
        Assert.assertTrue(driver.findElement(By.id("error")).isDisplayed());
        // Verify error message text is Your password is invalid!
        Assert.assertEquals(driver.findElement(By.id("error")).getText(), "Your password is invalid!");
    }
}
