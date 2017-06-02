package Lab11;

/**
 * Created by smaug on 2017/5/31.
 */
public class User
{
    private String account;
    private String passward;
    private String telNo;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public void show() {
        System.out.println("account:" + this.account);
        System.out.println("passward:" + this.passward);
        System.out.println("telNo:" + this.telNo);
    }

    public MeMento saveMemento() {
        return new MeMento(account, passward, telNo);
    }

    public void restoreMemento(MeMento meMento) {
        this.account = meMento.getAccount();
        this.passward = meMento.getPassward();
        this.telNo = meMento.getTelNo();
    }
}
