package site.zhangchuzhao.samples;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Devin     Date: 2/4/2017 2:39 PM
 * More wonderful content please pay attention to -> http://zhangchuzhao.site
 */

public class TestEmployeeDetails1 {
        EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
        EmployeeDetails employee = new EmployeeDetails();

    //是否忽略
    @Test(enabled = false)
    public void testCalculateYearlySalary1(){
        System.out.println("testCalculateYearlySalary");
    }

    //产生指定异常
    @Test(expectedExceptions = ArithmeticException.class)
    public void testThrowException(){
        System.out.println("被依赖的测试方法");
        int a = 0;
        int b = 1/a;
    }

    //依赖指定测试方法
    @Test(dependsOnMethods = {"testThrowException"})
    public void testDependsOnMethods(){
        System.out.println("有依赖的方法");
    }

    //依赖指定分组
    @Test(dependsOnGroups = {"salary"})
    public void testDependsOnGroups(){
        System.out.println("依赖组salary");
    }

    @Test(groups = {"salary"})
    public void testCalculateYearlySalary(){
        System.out.println("testCalculateYearlySalary");
        employee.setName("Devin");
        employee.setAge(25);
        employee.setMonthlySalary(8800);
        double salary = empBusinessLogic.calculateYearlySalary(employee);
        Assert.assertEquals(105600, salary, 0.0, "8800);");
    }

}
