package Exception;

import java.util.ArrayList;

/**
 * 栈内存溢出示例
 * @AlanLin 2020/7/9
 */
public class Test {
    public static void main(String[] args) {
        m1();
    }

    public static void m1(){
        ArrayList list=new ArrayList();
        while (true){
            list.add(new Test());
        }
    }
}
