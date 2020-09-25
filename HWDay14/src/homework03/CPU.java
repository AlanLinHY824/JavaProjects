package homework03;

/**
 * @AlanLin 2020/6/16
 */
public class CPU {
    private String type;
    private String frequency;
    private int coreQty;

    public void show(){
        System.out.println("CPU型号："+type);
        System.out.println("CPU主频："+frequency);
        System.out.println("CPU核心数："+coreQty);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public int getCoreQty() {
        return coreQty;
    }

    public void setCoreQty(int coreQty) {
        this.coreQty = coreQty;
    }

    public CPU() {
    }

    public CPU(String type, String frequency, int coreQty) {
        this.type = type;
        this.frequency = frequency;
        this.coreQty = coreQty;
    }
}
