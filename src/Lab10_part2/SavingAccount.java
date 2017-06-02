package Lab10_part2;

/**
 * Created by smaug on 2017/5/25.
 */
public class SavingAccount implements AccountTemplate
{
    @Override
    public double interestCalculate(long saveedMoney) {
        System.out.println("计算定期账号利息");
        return 0;
    }

    @Override
    public void showInterest() {
        System.out.println("显示定期账号利息");
    }
}
