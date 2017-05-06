package Lab9;

/**
 * Created by smaug on 2017/5/4.
 */
public abstract class AbstractChatroom
{
    public abstract void register(Member member);

    public abstract void sendText(String from, String to, String message);

    public abstract void sendImage(String from, String to, String image);
}
