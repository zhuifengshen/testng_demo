package site.zhangchuzhao.samples;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Devin     Date: 2017/2/6 15:00
 * More wonderful content please pay attention to -> http://zhangchuzhao.site
 */

public class TestEmployeeDetails2 {
    EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
    EmployeeDetails employee = new EmployeeDetails();

    @Test
    public void testCalculateAppraisal(){
        System.out.println("testCalculateAppraisal");
        employee.setName("Devin");
        employee.setAge(25);
        employee.setMonthlySalary(8800);
        double appraisal = empBusinessLogic.calculateAppraisal(employee);
        Assert.assertEquals(500, appraisal, 0.0, "500");
    }
}
