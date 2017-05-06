package Lab9;

/**
 * Created by smaug on 2017/5/4.
 */
public class DiamondMember extends  Member
{

    public DiamondMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String message) {
        System.out.println("钻石会员发送信息");
        chatroom.sendText(name,to,message);
    }

    @Override
    public void sendImage(String to, String image) {
        System.out.println("钻石会员发送图片");
    chatroom.sendImage(name,to,image);
    }


}
