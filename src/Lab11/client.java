package Lab11;

/**
 * Created by smaug on 2017/5/25.
 */
public class client
{
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();

        User user = new User();
        user.setAccount("张三");
        user.setPassward("123456");
        user.setTelNo("15005020502");
        user.show();
        careTaker.setMeMento(user.saveMemento());

        System.out.println("---------------------------------------");
        user.setAccount("李四");
        user.show();
        careTaker.setMeMento(user.saveMemento());

        System.out.println("---------------------------------------");
        user.setAccount("王五");
        user.show();
        careTaker.setMeMento(user.saveMemento());

        System.out.println("------------------撤销1---------------------");

        user.restoreMemento(careTaker.getMeMento());
        user.show();

        System.out.println("------------------撤销2---------------------");
        user.restoreMemento(careTaker.getMeMento());
        user.show();

    }
}
