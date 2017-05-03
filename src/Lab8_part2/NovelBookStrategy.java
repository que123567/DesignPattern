package Lab8_part2;

/**
 * Created by smaug on 2017/5/2.
 */
public class NovelBookStrategy implements Strategy
{
    @Override
    public double Algorithm(double price) {
        int cnt = (int) (price / 100);
        return price - cnt * 10;
    }
}
