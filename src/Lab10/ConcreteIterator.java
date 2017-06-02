package Lab10;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by smaug on 2017/5/21.
 */
public class ConcreteIterator implements Iterator
{
    private List list = new ArrayList();
    private int cusor = 0;

    public ConcreteIterator(List list) {
        this.list = list;
    }


    @Override
    public boolean hasNext() {
        return cusor != list.size();
    }

    @Override
    public Object next()
    {
        return list.get(cusor++);
    }

    @Override
    public Object previous() {
        if (cusor > 0)
            return list.get(--cusor);
        return list.get(0);
    }

    @Override
    public boolean isLast() {
        return (list.size() - 1) == cusor;
    }

    @Override
    public boolean isEmpty() {
        return list.size() == 0;
    }
}
