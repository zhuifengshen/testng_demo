package site.zhangchuzhao.samples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Devin     Date: 2017/2/6 17:42
 * More wonderful content please pay attention to -> http://zhangchuzhao.site
 */

public class DataProviderTest2 {
    @DataProvider(name = "mybean")
    public static Object[][] beans(){
        return new Object[][]{{new Bean("devin", 100)}};
    }

    @Test(dataProvider = "mybean")
    public void testBean(Bean bean){
        System.out.println(bean.getName() + " " + bean.getValue());
    }
}
