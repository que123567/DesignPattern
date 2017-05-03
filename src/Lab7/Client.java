package Lab7;

/**
 * Created by smaug on 2017/4/26.
 */
public class Client
{
    public static void main(String[] args) {
        System.out.println("SimplePhone");
        CellPhone phoneOne = new SimplePhone();
        phoneOne.receiveCall();

        System.out.println("JarPhone");
        CellPhone phoneTwo=new JarPhone(phoneOne);
        phoneTwo.receiveCall();

        System.out.println("ComplexPhone");
        CellPhone phoneThree=new ComplexPhone(phoneTwo);
        phoneThree.receiveCall();

    }
}
