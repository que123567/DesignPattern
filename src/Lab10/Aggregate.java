package Lab10;

/**
 * Created by smaug on 2017/5/25.
 */
public interface Aggregate
{
    void add(Object obj);

    void remove(Object obj);

    Iterator iterator();
}
