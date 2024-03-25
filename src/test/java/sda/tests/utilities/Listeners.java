package sda.tests.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
    @Override
    public void onStart(ITestContext context){
        System.out.println("-------------------");
        System.out.println("the moment test execution started..");
        System.out.println("Start time : " +context.getStartDate());
    }

    @Override
    public void onFinish(ITestContext context){
        System.out.println("the moment test execution ended..");
        System.out.println("-------------------");
        System.out.println("Start time : " +context.getEndDate());

    }
    @Override
    public void onTestStart(ITestResult result){
        System.out.println(result.getName() + " test is starting...");
    }
    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println(result.getName() + " test is successfully executed...");
    }
    @Override
    public void onTestFailure(ITestResult result){
        System.out.println(result.getName() + " test is failed...");
    }
    @Override
    public void onTestSkipped(ITestResult result){
        System.out.println(result.getName() + " test is skipped...");
    }
}
