package Lab4;

/**
 * Created by smaug on 2017/3/30.
 */
public class HeroBuilder extends ActorBuilder
{

    @Override
    public void buildType() {
        actor.setType("英雄");
    }

    @Override
    public void buildFace() {
        actor.setFace("白");
    }

    @Override
    public void buildSex() {
        actor.setSex("女");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("便装");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("长发");
    }


}
