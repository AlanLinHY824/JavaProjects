package homework03;

/**
 * @AlanLin 2020/6/16
 */
public class MainBoard {
    private String type;
    private String chipset;
    private String size;

    public void show(){
        System.out.println("主板型号："+type);
        System.out.println("主板芯片组："+chipset);
        System.out.println("主板大小："+size);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public MainBoard() {
    }

    public MainBoard(String type, String chipset, String size) {
        this.type = type;
        this.chipset = chipset;
        this.size = size;
    }
}
