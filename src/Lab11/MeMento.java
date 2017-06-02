package Lab11;

/**
 * Created by smaug on 2017/5/31.
 */
public class MeMento
{
    private String account;
    private String passward;
    private String telNo;

    public MeMento(String account, String passward, String telNo) {
        this.account = account;
        this.passward = passward;
        this.telNo = telNo;
    }

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
}
