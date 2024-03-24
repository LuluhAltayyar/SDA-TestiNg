package sda.homeworks.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import sda.tests.utilities.ParametrizedBrowserTestBase;

import java.util.List;


public class HW02 extends ParametrizedBrowserTestBase {

    @Test
    public void test() throws InterruptedException {
        //Go to URL: https://vziad3.github.io/todo-app/todo-app.html
        driver.get("https://vziad3.github.io/todo-app/todo-app.html");
        //Checking Box todo-4 and Checking Box todo-5
        driver.findElement(By.xpath("//input[@name='todo-4']")).click();
        driver.findElement(By.xpath("//input[@name='todo-5']")).click();
        Thread.sleep(1000);


        //If both clicks worked, then the following List should be have length 2.
        List<WebElement> todoList = driver.findElements(By.xpath("//span[@class='done-true']"));
        //Assert that this is correct
        Assert.assertEquals(2, todoList.size());

        //Assert that the todo we added is present in the list
        String text= "Add item";
        driver.findElement(By.id("todotext")).sendKeys(text);
        driver.findElement(By.id("addbutton")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//li[@class='ng-scope'][6]")).getText(), text);

        //Archiving old todos
        driver.findElement(By.linkText("archive")).click();
        todoList = driver.findElements(By.xpath("//span[@class='done-false']"));
        //If our archive link worked, then the following list should have length 4.
        //Assert that this is true as well
        Assert.assertEquals(4, todoList.size());

        //Doing Cross Browser Testing.

    }
}
