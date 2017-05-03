package Lab4;

/**
 * Created by smaug on 2017/3/30.
 */
public class Actor
{
    private String type;
    private String sex;
    private String face;
    private String costume;
    private String hairstyle;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getCostume() {
        return costume;
    }

    public void setCostume(String costume) {
        this.costume = costume;
    }

    public String getHairstyle() {
        return hairstyle;
    }

    public void setHairstyle(String hairstyle) {
        this.hairstyle = hairstyle;
    }

    public void showHero() {
        System.out.println(this.getCostume());
        System.out.println(this.getFace());
        System.out.println(this.getHairstyle());
        System.out.println(this.getSex());
        System.out.println(this.getType());
    }
}
