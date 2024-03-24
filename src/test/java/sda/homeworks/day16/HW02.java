package sda.homeworks.day16;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import sda.tests.utilities.TestBase;

public class HW02 extends TestBase {

    //Test Case2: Parametrizes Positive Login Test
    @Test
    @Parameters({"username","password"})
    public void PositiveLogin(String username, String password ) {
        //Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");

        //Type username student into Username field
        driver.findElement(By.id("username")).sendKeys(username);
        //Type password Password123 into Password field
        driver.findElement(By.id("password")).sendKeys(password);
        //Click Submit button.
        driver.findElement(By.id("submit")).click();

        //Verify new page URL contains practicetestautomation.com/logged-in-successfully/
        Assert.assertTrue(driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"));
        //You should execute this test with xml file

    }
}
