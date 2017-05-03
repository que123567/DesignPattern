package Lab5;


abstract class ModeBuilder
{
    protected MainScreenBean mainScreen = new MainScreenBean();

    public abstract void buildMenu();

    public abstract void buildPlayList();

    public abstract void buildMainWindow();

    public abstract void buildControlBar();

    public MainScreenBean getMainScreen() {
        return mainScreen;
    }


}
