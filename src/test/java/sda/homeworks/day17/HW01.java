package sda.homeworks.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sda.tests.utilities.TestBase;

public class HW01 extends TestBase {

    @Test(dataProvider = "getData")
    public void test(String data) throws InterruptedException {
        // Open the site: http://opencart.abstracta.us/index.php?route=account/login
        driver.get("http://opencart.abstracta.us/index.php?route=account/login");

        //Login with that credentials
        driver.findElement(By.id("input-email")).sendKeys("clarusway@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("123456789");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        driver.findElement(By.xpath("//input[@name='search']")).sendKeys(data, Keys.ENTER);
        Thread.sleep(1000);

    }
    //Using the Search function do it with Data Provider for Mac, iPad and Samsung.
    @DataProvider()
    public Object[][] getData() {
        Object[][] data = {{"Mac"}, {"iPad"}, {"Samsung"}};
        return data;
    }
}
