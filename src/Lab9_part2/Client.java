package Lab9_part2;

/**
 * Created by smaug on 2017/5/4.
 */
abstract class Officer //军官
{
    protected String name;
    protected Officer successor;

    public Officer(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSuccessor(Officer successor) {
        this.successor = successor;
    }

    public abstract void handleMission(Mission mission);
}

class Mission //任务
{
    private String soldierName;
    private int enemyNumber;

    public Mission(String soldierName, int enemyNumber) {
        this.soldierName = soldierName;
        this.enemyNumber = enemyNumber;
    }

    public String getSoldierName() {
        return soldierName;
    }

    public void setSoldierName(String soldierName) {
        this.soldierName = soldierName;
    }

    public int getEnemyNumber() {
        return enemyNumber;
    }

    public void setEnemyNumber(int enemyNumber) {
        this.enemyNumber = enemyNumber;
    }
}

class Monitor extends Officer //班长
{

    public Monitor(String name) {
        super(name);
    }

    @Override
    public void handleMission(Mission mission) {
        if (mission.getEnemyNumber() > 0 && mission.getEnemyNumber() < 10) {
            System.out.println("班长:" + name + "接到:" + mission.getSoldierName() + "的军情," + "敌人数量为" + mission.getEnemyNumber()+ ",可以下达作战指令");
        } else {
            if (this.successor != null) {
                this.successor.handleMission(mission);
            }
        }
    }
}


class Platoon extends Officer//排(长)
{

    public Platoon(String name) {
        super(name);
    }

    @Override
    public void handleMission(Mission mission) {
        if (mission.getEnemyNumber() >= 10 && mission.getEnemyNumber() < 50) {
            System.out.println("排长:" + name + "接到:" + mission.getSoldierName() + "的军情" + ",敌人数量为" + mission.getEnemyNumber() + ",可以下达作战指令");
        } else {
            if (this.successor != null) {
                this.successor.handleMission(mission);
            }
        }
    }
}


class Battalion extends Officer //营(长)
{
    public Battalion(String name) {
        super(name);
    }

    @Override
    public void handleMission(Mission mission) {
        if (mission.getEnemyNumber() >= 50 && mission.getEnemyNumber() < 200) {
            System.out.println("营长:" + name + "接到:" + mission.getSoldierName() + "的军情" + ",敌人数量为" + mission.getEnemyNumber() + ",可以下达作战指令");
        } else {
            System.out.println("接到:" + mission.getSoldierName() + "的军情" + ",敌人数量为" + mission.getEnemyNumber() + ",敌人太多了，我们开会讨论一下吧！");
        }
    }
}


public class Client
{


    public static void main(String[] args) {
        Officer monitor = new Monitor("赵班长");
        Officer platoon = new Platoon("王排长");
        Officer battalion = new Battalion("朱营长");

        monitor.setSuccessor(platoon);
        platoon.setSuccessor(battalion);

        Mission mission1=new Mission("敌人1",9);
        Mission mission2=new Mission("敌人2",36);
        Mission mission3=new Mission("敌人3",70);
        Mission mission4=new Mission("敌人4",240);
        monitor.handleMission(mission1);
        monitor.handleMission(mission2);
        monitor.handleMission(mission3);
        monitor.handleMission(mission4);

    }
}
