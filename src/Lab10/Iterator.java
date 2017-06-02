package Lab10;

/**
 * Created by smaug on 2017/5/21.
 */
public interface Iterator
{
    boolean hasNext();

    Object next();

    Object previous();

    boolean isLast();
    boolean isEmpty();
}
