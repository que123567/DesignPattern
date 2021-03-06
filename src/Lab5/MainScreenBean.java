package Lab5;
public class MainScreenBean
{

    private String menu;
    private String playList;
    private String mainWindow;
    private String controlBar;

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getPlayList() {
        return playList;
    }

    public void setPlayList(String playList) {
        this.playList = playList;
    }

    public String getMainWindow() {
        return mainWindow;
    }

    public void setMainWindow(String mainWindow) {
        this.mainWindow = mainWindow;
    }

    public String getControlBar() {
        return controlBar;
    }

    public void setControlBar(String controlBar) {
        this.controlBar = controlBar;
    }

    protected void showMode() {
        if(this.getMenu()!=null)
        System.out.println(this.getMenu());
        if(this.getControlBar()!=null)
        System.out.println(this.getControlBar());
       if(this.getMainWindow()!=null)
        System.out.println(this.getMainWindow());
       if (this.getPlayList()!=null)
        System.out.println(this.getPlayList());
    }
}
