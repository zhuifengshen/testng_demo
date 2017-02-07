package site.zhangchuzhao.samples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Devin     Date: 2017/2/6 17:13
 * More wonderful content please pay attention to -> http://zhangchuzhao.site
 */

public class ParameterizedTest {
    @Test
    @Parameters("name")
    public void parameterTest(String name){
        System.out.println("My name is : " + name);
    }
}
