package Lab9;

/**
 * Created by smaug on 2017/5/4.
 */
public class CommonMember extends Member
{

    public CommonMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String message) {
        System.out.println("普通会员发送信息");
        chatroom.sendText(name,to,message);
    }

    @Override
    public void sendImage(String from, String message) {
        System.out.println("普通会员不能发送图片");
    }
}
