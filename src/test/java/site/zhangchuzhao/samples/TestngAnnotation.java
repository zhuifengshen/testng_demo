package site.zhangchuzhao.samples;

import org.testng.annotations.*;

/**
 * Created with IntelliJ IDEA.
 * User: Devin     Date: 2/4/2017 5:46 PM
 * More wonderful content please pay attention to -> http://zhangchuzhao.site
 */

public class TestngAnnotation {
    @Test
    public void testCase1(){
        System.out.println("test case 1");
    }
    @Test
    public void testCase2(){
        System.out.println("test case 2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("after method");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("after class");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("before test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("after test");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite");
    }
}
