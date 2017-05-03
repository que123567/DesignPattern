package Lab7_part2;

/**
 * Created by smaug on 2017/4/26.
 */
public class MainFrame
{
    private HardDisk hardDisk;
    private CPU cpu;
    private OS os;
    private Memory memory;

    public MainFrame() {
        hardDisk = new HardDisk();
        cpu = new CPU();
        memory = new Memory();
        os = new OS();
    }
    public  void run(){
        memory.check();
        cpu.run();
        hardDisk.read();
        os.load();
    }
    public void off(){
        memory.off();
        cpu.off();
        hardDisk.off();
        os.off();
    }
}
