package Lab11;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by smaug on 2017/5/31.
 */
public class CareTaker
{
    private static final int MAX = 50;
    private int index = 0;

    private MeMento meMento;

    private List<MeMento> mMementoList = new ArrayList<>(MAX);

    public MeMento getMeMento() {
        index = index > 0 ? --index : 0;
        return mMementoList.get(index);
    }

    public void setMeMento(MeMento meMento) {
        if (mMementoList.size() > MAX) {
            mMementoList.remove(0);//存满，从最开头的记录开始删
        }
        mMementoList.add(meMento);
        index = mMementoList.size() - 1;
    }
}
