package Lab5;


public class ModeController
{
    public MainScreenBean construct(ModeBuilder mb) {
        MainScreenBean mainScreenBean;
        mb.buildControlBar();
        mb.buildMainWindow();
        mb.buildMenu();
        mb.buildPlayList();
        mainScreenBean = mb.getMainScreen();
        return mainScreenBean;

    }
}
