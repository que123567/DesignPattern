package Lab5_part2;

/**
 * Created by smaug on 2017/4/5.
 */
public class Chart implements Clonable
{
    private String ID;
    private String Color;
    private Data data;

    public Chart(String id, String colour, Data data) {
        this.setID(id);
        this.setColor(colour);
        this.setData(data);
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void show() {
        System.out.println("id:" + getID());
        System.out.println("color" + getColor());
        System.out.println("dataA:" + getData().getDataA() + " dataB:" + getData().getDataB() +" "+ "dataC:" +" "+ getData().getDataC());

    }


    public Object clone() {
        Object chart = null;
        try {
            chart =  super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } finally {
            return chart;
        }

    }
}
