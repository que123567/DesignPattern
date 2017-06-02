package Lab10;

/**
 * Created by smaug on 2017/5/19.
 */
public class Client
{
    public static void main(String[] args) {
        Aggregate list = new StoreAggregate();
        list.add("商品A");
        list.add("商品B");
        list.add("商品C");
        list.add("商品D");
        Iterator i = list.iterator();

        System.out.println("正序遍历");
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());

        System.out.println("逆序遍历");
        System.out.println(i.previous());
       System.out.println(i.previous());
       System.out.println(i.previous());
       System.out.println(i.previous());
    }
}
