package Lab8_part2;

/**
 * Created by smaug on 2017/5/2.
 */
public class Context
{
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public double calculatePrice(double price) {
        return strategy.Algorithm(price);
    }
}
