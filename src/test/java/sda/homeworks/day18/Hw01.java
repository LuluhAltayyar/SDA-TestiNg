package sda.homeworks.day18;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import sda.tests.utilities.TestBase;

public class Hw01 extends TestBase {

    //Test Case1: Positive Login Test
    @Test
    public void PositiveLogin() {
        //Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");

        //Type username student into Username field
        driver.findElement(By.id("username")).sendKeys("student");
        //Type password Password123 into Password field
        driver.findElement(By.id("password")).sendKeys("Password123");
        //Click Submit button.
        driver.findElement(By.id("submit")).click();

        //Verify new page URL contains practicetestautomation.com/logged-in-successfully/
        Assert.assertTrue(driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"));
        //Verify new page contains expected text ('Congratulations' or 'successfully logged in')
        String text = driver.findElement(By.xpath("//p[@class='has-text-align-center']")).getText();
        Assert.assertTrue(text.contains("Congratulations")|| text.contains("successfully logged in") );

        //Verify button Log out is displayed on the new page.
        Assert.assertTrue(driver.findElement(By.linkText("Log out")).isDisplayed());

    }
}
