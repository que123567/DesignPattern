package Lab5;


public class SimpleBuilder extends ModeBuilder
{
    @Override
    public void buildMenu() {
        //do nothing
    }

    @Override
    public void buildPlayList() {
        //do nothing
    }

    @Override
    public void buildMainWindow() {
        mainScreen.setMainWindow("构建主窗体");
    }

    @Override
    public void buildControlBar() {
        mainScreen.setControlBar("构建控制条");
    }
}
