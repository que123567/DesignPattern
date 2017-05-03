package Lab5;


public class Test
{
    public static void main(String[] args) {
        ModeController modeController = new ModeController();
        MainScreenBean memoryMode = modeController.construct(new MemoryBuilder());
        System.out.println("《记忆模式》");
        memoryMode.showMode();
        MainScreenBean fullMode = modeController.construct(new FullBuilder());
        System.out.println("《完全模式》");
        fullMode.showMode();
        MainScreenBean simpleMode = modeController.construct(new SimpleBuilder());
        System.out.println("《精简模式》");
        simpleMode.showMode();
    }

}
