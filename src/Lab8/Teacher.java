package Lab8;

/**
 * Created by smaug on 2017/4/27.
 */
public class Teacher implements Observer
{
    String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("系名更改<<" + name + ">>更新");
    }
}
