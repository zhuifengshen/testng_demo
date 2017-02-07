package site.zhangchuzhao.samples;

/**
 * Created with IntelliJ IDEA.
 * User: Devin     Date: 2017/2/6 17:18
 * More wonderful content please pay attention to -> http://zhangchuzhao.site
 */

public class PrimeNumberChecker {
    public Boolean validate(final Integer number){
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
