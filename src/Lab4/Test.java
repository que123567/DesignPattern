package Lab4;

/**
 * Created by smaug on 2017/3/30.
 */
public class Test
{
    public static void main(String[] args) {


        ActorController actorController = new ActorController();
        Actor actor = actorController.construct(new HeroBuilder());
        actor.showHero();
    }

}
