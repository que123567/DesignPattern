package Lab7;

/**
 * Created by smaug on 2017/4/26.
 */


public class PhoneDecorator extends CellPhone
{
    private CellPhone cellPhone;

    public PhoneDecorator(CellPhone cellPhone) {
        this.cellPhone = cellPhone;
    }

    @Override
    public void receiveCall() {
        cellPhone.receiveCall();
    }
}
