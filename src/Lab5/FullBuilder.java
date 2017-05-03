package Lab5;


public class FullBuilder extends ModeBuilder
{
    @Override
    public void buildMenu() {
        mainScreen.setMenu("构建菜单");
    }

    @Override
    public void buildPlayList() {
        mainScreen.setPlayList("构建播放列表");
    }

    @Override
    public void buildMainWindow() {
        mainScreen.setMainWindow("构建主窗体");
    }

    @Override
    public void buildControlBar() {
        mainScreen.setControlBar("构建控制条 ");
    }

}
