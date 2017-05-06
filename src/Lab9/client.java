package Lab9;

/**
 *
 * * Created by smaug on 2017/5/4.
 */
public class client
{
    public static void main(String[] args) {

        AbstractChatroom happychat = new ChatGroup();
        Member member1, member2, member3, member4;
        member1 = new DiamondMember("张三");
        member2 = new DiamondMember("李四");

        member3 = new CommonMember("小王");
        member4 = new CommonMember("小猪");

        happychat.register(member1);
        happychat.register(member2);
        happychat.register(member3);
        happychat.register(member4);

        member1.sendText("李四", "你好");
        member1.sendImage("李四", "XHT");
        member3.sendImage("小猪", "IMAGE");


        System.out.println("<<<<<创建新的聊天室>>>>>");
        happychat = new newChartRoom();

        member1 = new newMember("小鹿");
        member2 = new newMember("小狗");
        happychat.register(member1);
        happychat.register(member2);

        member1.sendImage("小狗","这是一张AAAANANANANANAD的超级长的图片!!!!!!!");
        member1.sendImage("小狗","这是一张图片");
        member1.sendText("小狗","你好");


    }
}
