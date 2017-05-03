package Lab8_part2;


/**
 * Created by smaug on 2017/4/27.
 */
public class Client
{
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new LanguageBookStrategy());
        System.out.println("语言类书籍原价100，折后："+context.calculatePrice(100));

        context.setStrategy(new ComputerBookStrategy());
        System.out.println("计算机类书籍原价100，折后："+context.calculatePrice(100));

        context.setStrategy(new NovelBookStrategy());
        System.out.println("小说类书籍原价200，折后："+context.calculatePrice(200));
    }
}
