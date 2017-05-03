package Lab8_part2;

/**
 * Created by smaug on 2017/5/2.
 */
public class LanguageBookStrategy implements Strategy
{
    @Override
    public double Algorithm(double price) {
        if (price >= 2)
            return price - 2;
        else return 0;
    }
}
