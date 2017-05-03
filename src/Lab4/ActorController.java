package Lab4;

/**
 * Created by smaug on 2017/3/30.
 */
public class ActorController
{
    public Actor construct(ActorBuilder ab) {
        Actor actor;
        ab.buildCostume();
        ab.buildFace();
        ab.buildHairstyle();
        ab.buildSex();
        ab.buildType();
        actor = ab.createActor();
        return actor;
    }
}
