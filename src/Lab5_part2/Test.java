package Lab5_part2;

/**
 * Created by smaug on 2017/4/5.
 */
public class Test
{
    public static void main(String[] args) {
        Data data = new Data("数据1", "数据2", "数据3");
        Chart chartOne = new Chart("01", "红色", data);
        Chart chartTwo = (Chart) chartOne.clone();
        chartTwo.setColor("金色");
        chartTwo.setID("02");
        chartOne.show();
        chartTwo.show();
    }
}
