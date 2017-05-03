package Lab7;

/**
 * Created by smaug on 2017/4/26.
 */
public class JarPhone extends PhoneDecorator
{

    public JarPhone(CellPhone cellPhone) {
        super(cellPhone);
    }

    @Override
    public void receiveCall() {
        super.receiveCall();
        System.out.println("震动提示");
    }
}
