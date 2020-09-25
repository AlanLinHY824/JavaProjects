package homework02;

/**
 * @AlanLin 2020/6/17
 */
public class Test {
    public static void main(String[] args) {
        MyTime mt=new MyTime();
        mt.setHour(18).setMin(25).setSec(50);
        System.out.println(mt.getHour()+"时"+mt.getMin()+"分"+mt.getSec()+"秒");
    }
}
