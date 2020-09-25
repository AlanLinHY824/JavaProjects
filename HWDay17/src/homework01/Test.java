package homework01;

/**
 * @AlanLin 2020/6/19
 */
public class Test {
    public static void main(String[] args) {
        Publisers p1=new Publisers();
        System.out.println(p1.toString());
        Publisers p2=new Publisers("SDASW-006", "工业出版社", "北京市朝阳门大街1号");
        System.out.println(p2.toString());
    }
}
