package demo7;

import java.util.Objects;

/**
 * @AlanLin 2020/6/19
 */
public class Test {
    public static void main(String[] args) {
        Computer c=new Computer(new String("联想"), "黑色", 6666, 13.6);
        Computer c2=new Computer(new String("联想"), "黑色", 6666, 13.6);
        /*
            当输出对象名c时，输出的是以下结果
            demo7.Computer@10f87f48
            其实输出对象名时，系统默认调用该对象的toString()方法，而toString()方法时Object中的方法：
            return getClass().getName() + "@" + Integer.toHexString(hashCode());

            需求：当输出对象名时，将对象中所有属性的值输出
            需要在子类中重写toString()方法

            快捷键Alt+Insert选择toString()方法

         */
        System.out.println(c.equals(c2));

        String str1=new String("联想");
        String str2=new String("联想");
        System.out.println(Objects.equals(str1, str2));
        System.out.println(str1==str2);



    }
}
