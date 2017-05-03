package Lab7;

/**
 * Created by smaug on 2017/4/26.
 */
public class ComplexPhone extends PhoneDecorator
{
    public ComplexPhone(CellPhone cellPhone) {
        super(cellPhone);
    }

    @Override
    public void receiveCall() {
        super.receiveCall();
        System.out.println("灯光闪烁提示");
    }
}
