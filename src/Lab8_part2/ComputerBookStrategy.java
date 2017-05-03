package Lab8_part2;

/**
 * Created by smaug on 2017/5/2.
 */
public class ComputerBookStrategy implements Strategy
{
    @Override
    public double Algorithm(double price) {
        return price*0.9;
    }
}
