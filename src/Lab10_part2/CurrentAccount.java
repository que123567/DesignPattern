package Lab10_part2;

/**
 * Created by smaug on 2017/5/25.
 */
public class CurrentAccount implements AccountTemplate
{
    @Override
    public double interestCalculate(long saveedMoney) {
        System.out.println("计算活期账号利息");
        return 0;
    }

    @Override
    public void showInterest() {
        System.out.println("活期账号显示利息");
    }
}
