package homework01;

/**
 * @AlanLin 2020/6/13
 */
public class Test {
    public static void main(String[] args) {
        Class class1=new Class();
        class1.print();
        class1.no="SH002";
        class1.name="上海第二期Java实验班";
        class1.addr="上海市松江区";
        System.out.println("============");
        class1.print();
    }
}
