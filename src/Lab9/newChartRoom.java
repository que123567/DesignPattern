package Lab9;

import java.util.Hashtable;

/**
 * Created by smaug on 2017/5/4.
 */
public class newChartRoom extends AbstractChatroom
{
    private Hashtable memberList = new Hashtable();

    @Override
    public void register(Member member) {
        if (!memberList.contains(member)) {
            memberList.put(member.getName(), member);
            member.setChatroom(this);
        }
    }

    @Override
    public void sendText(String from, String to, String message) {
        Member member = (Member) memberList.get(to);
        String newMessage = message;
        newMessage = message.replace("日", "*");
        newMessage=message.replace("操","*");
        newMessage=message.replace("TMD","*");
        member.receiveText(from, newMessage);
    }

    @Override
    public void sendImage(String from, String to, String image) {
        Member member = (Member) memberList.get(to);
        if (image.length() > 20) {
            System.out.println("图片太大，发送失败");
        } else {
            member.receiveImage(from, image);
        }
    }
}
