package Lab5;


public class MemoryBuilder extends ModeBuilder
{
    @Override
    public void buildMenu() {
        //do nothing
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
        mainScreen.setControlBar("构建控制条");
    }
}
