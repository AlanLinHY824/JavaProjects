package homework03;

/**
 * 3.编程实现电脑的组装：
 * 编写CPU的类，分析属性
 * 编写主板的类，分析属性
 * 编写电脑类的类，分析属性，方法：显示电脑的配置信息（CPU,主板等 相关信息)
 * 编写测试类，创建电脑对象，显示电脑信息
 * @AlanLin 2020/6/16
 */
public class Computer {
    private CPU cpu;
    private MainBoard mb;
    private String graCard;
    private String hardDisk;
    private String keyboard;

    public void show(){
        if (cpu==null||mb==null){
        System.out.println("显卡型号："+graCard);
        System.out.println("硬盘型号："+hardDisk);
        System.out.println("键盘型号："+keyboard);
        }
        else {
            cpu.show();
            mb.show();
            System.out.println("显卡型号："+graCard);
            System.out.println("硬盘型号："+hardDisk);
            System.out.println("键盘型号："+keyboard);
        }
    }

    public Computer() {
    }

    public Computer(CPU cpu, MainBoard mb, String graCard, String hardDisk, String keyboard) {
        this.cpu = cpu;
        this.mb = mb;
        this.graCard = graCard;
        this.hardDisk = hardDisk;
        this.keyboard = keyboard;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public MainBoard getMb() {
        return mb;
    }

    public void setMb(MainBoard mb) {
        this.mb = mb;
    }

    public String getGraCard() {
        return graCard;
    }

    public void setGraCard(String graCard) {
        this.graCard = graCard;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }
}
