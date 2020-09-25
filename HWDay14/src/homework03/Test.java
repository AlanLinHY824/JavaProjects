package homework03;

/**
 * @AlanLin 2020/6/16
 */
public class Test {
    public static void main(String[] args) {
        Computer pc=new Computer(new CPU("Inter Core i5-8250U", "1.60GHz", 8), new MainBoard("Intel(R) 6th Generation Core Processor Family Platform", "P43", "50*70"), "Intel UHD Graphics","SSD","ikbc");
        pc.show();

    }
}
