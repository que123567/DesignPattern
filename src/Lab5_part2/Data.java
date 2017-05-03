package Lab5_part2;

/**
 * Created by smaug on 2017/4/5.
 */
public class Data
{
    private String DataA;
    private String DataB;
    private String DataC;

    public Data(String a, String b, String c) {
        this.DataA = a;
        this.DataB = b;
        this.DataC = c;
    }

    public String getDataA() {
        return DataA;
    }

    public void setDataA(String dataA) {
        DataA = dataA;
    }

    public String getDataB() {
        return DataB;
    }

    public void setDataB(String dataB) {
        DataB = dataB;
    }

    public String getDataC() {
        return DataC;
    }

    public void setDataC(String dataC) {
        DataC = dataC;
    }

    public void showData() {
        System.out.println("DataA:" + getDataA());
        System.out.println("DataB:" + getDataB());
        System.out.println("DataC:" + getDataC());
    }
}
