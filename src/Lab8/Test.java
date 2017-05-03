package Lab8;

/**
 * Created by smaug on 2017/4/27.
 */
public class Test
{

    public static void main(String[] args) {
        Observable observable = new Department();

        Student student = new Student("同学");
        Teacher teacher = new Teacher("老师");
//两者同时订阅
        System.out.println("两者同时订阅");
        observable.attach(student);
        observable.attach(teacher);
        observable.notifyObserver();
//同学取消订阅
        System.out.println("同学取消订阅");
        observable.detach(student);
        observable.notifyObserver();
    }
}
