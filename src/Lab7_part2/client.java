package Lab7_part2;

/**
 * Created by smaug on 2017/4/26.
 */
public class client
{
    public static void main(String[] args){
    MainFrame mainFrame=new MainFrame();
        System.out.println("开机");
        mainFrame.run();
        System.out.println("关机");
        mainFrame.off();
    }
}
