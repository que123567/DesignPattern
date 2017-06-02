package Lab10_part2;

/**
 * Created by smaug on 2017/5/25.
 */
public class client
{
    public static void main(String[] args) {
        AccountTemplate a = new CurrentAccount();
        AccountTemplate b = new SavingAccount();
        a.interestCalculate(1);
        a.showInterest();
        b.interestCalculate(1);
        b.showInterest();
    }
}
