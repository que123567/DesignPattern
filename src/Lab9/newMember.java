package Lab9;

import java.util.Date;

/**
 * Created by smaug on 2017/5/4.
 */
public class newMember extends Member
{


    public newMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String message) {
        System.out.println("新会员发送文本," + "发送时间" + new Date());
        chatroom.sendText(name, to, message);
    }

    @Override
    public void sendImage(String to, String image) {
        System.out.println("新会员发送图片");
        chatroom.sendImage(name, to, image);
    }
}
