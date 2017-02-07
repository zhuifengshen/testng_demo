package site.zhangchuzhao.samples;

/**
 * Created with IntelliJ IDEA.
 * User: Devin     Date: 2017/2/6 17:39
 * More wonderful content please pay attention to -> http://zhangchuzhao.site
 */

public class Bean {
    private String name;
    private Integer value;

    public Bean(String name, Integer value){
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
