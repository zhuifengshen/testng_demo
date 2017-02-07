package site.zhangchuzhao.samples;

/**
 * Created with IntelliJ IDEA.
 * User: Devin     Date: 2017/2/6 15:33
 * More wonderful content please pay attention to -> http://zhangchuzhao.site
 */

public class MessageUtil {
    private String message;

    public MessageUtil(String message){
        this.message = message;
    }

    public String printMessage(){
        System.out.println(message);
        return message;
    }

    public String salutationMessage(){
        System.out.println("Hey," + message);
        return "Hey," + message;
    }

    public String exitMessage(){
        return message + "+" + message;
    }
}
