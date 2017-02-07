package site.zhangchuzhao.samples;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Devin     Date: 2017/2/6 17:21
 * More wonderful content please pay attention to -> http://zhangchuzhao.site
 */

public class DataProviderTest {

    private PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker();

    //@BeforeMethod
    //public void initialize(){
    //    System.out.println("befor method");
    //    primeNumberChecker = new PrimeNumberChecker();
    //}

    @DataProvider(name = "dataArray")
    public static Object[][] primeNumbers(){
        return new Object[][]{{2, true}, {6, false}, {19, true}, {22, false}, {23, true}};
    }

    @Test(dataProvider = "dataArray")
    public void testPrimeNumberChecker(Integer number, Boolean result){
        System.out.println(number + " : " + result);
        Assert.assertEquals(result, primeNumberChecker.validate(number));
    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][] {
                { "Cedric", new Integer(36) },
                { "Anne", new Integer(37)},
        };
    }

    //This test method declares that its data should be supplied by the Data Provider
//named "test1"
    @Test(dataProvider = "test1")
    public void verifyData1(String n1, Integer n2) {
        System.out.println(n1 + " " + n2);
    }


    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod() {
        return new Object[][] { { "data one" }, { "data two" } };
    }

    @Test(dataProvider = "data-provider")
    public void testMethod(String data) {
        System.out.println("Data is: " + data);
    }

}
