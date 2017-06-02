package Lab10;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by smaug on 2017/5/25.
 */
public class StoreAggregate implements Aggregate
{
    private List list = new ArrayList();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(list);
    }
}
