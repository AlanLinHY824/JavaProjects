package homework03;

/**
 * @AlanLin 2020/6/15
 */
public class Test {
    public static void main(String[] args) {
        Computer pc=new Computer();
        pc.print();
        System.out.println("==========================");
        Computer pc2=new Computer("联想", 4099);
        Computer pc3=new Computer("Apple", 8699, "白色", "15.6");
        pc2.print();
        System.out.println("==========================");
        pc3.print();
    }
}
