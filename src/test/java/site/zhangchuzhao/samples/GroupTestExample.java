package site.zhangchuzhao.samples;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Devin     Date: 2017/2/6 15:37
 * More wonderful content please pay attention to -> http://zhangchuzhao.site
 */

public class GroupTestExample {
    String message = "devin";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test(groups = {"function", "checkin"})
    public void testPrintMessage(){
        System.out.println("testPrintMessage");
        message = "devin";
        Assert.assertEquals(message, messageUtil.printMessage());
    }

    @Test(groups = {"function"})
    public void testSalutationMessage(){
        System.out.println("testSalutationMessage");
        message = "Hey,devin";
        Assert.assertEquals(message, messageUtil.salutationMessage());
    }

    @Test(groups = {"checkin"})
    public void testExitMessage(){
        System.out.println("testExitMessage");
        message = "devin+devin";
        Assert.assertEquals(message, messageUtil.exitMessage());
    }
}
