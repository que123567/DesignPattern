package Lab4;

/**
 * Created by smaug on 2017/3/30.
 */
abstract class ActorBuilder
{

    protected Actor actor = new Actor();

    public abstract void buildType();

    public abstract void buildFace();

    public abstract void buildSex();

    public abstract void buildCostume();

    public abstract void buildHairstyle();

    public Actor createActor() {
        return actor;
    }
}
