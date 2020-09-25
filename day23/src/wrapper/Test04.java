package wrapper;

/**
 * @AlanLin 2020/6/29
 */
public class Test04 {
    public static void main(String[] args) {
        Integer i1=456;//系统会根据整数创建一个Integer对象
        int num=i1;//系统自动把i1对象的value属性赋值给num

        //面试
        Integer i2=69;
        Integer i3=69;

        System.out.println(i2==i3);//true

        /*
            java认为-128~127范围内的整数使用最频繁，为了减少对象的创建次数，
            这个范围内整数自动装箱后保存到共享池中，采用享元模式
         */

        System.out.println(i2==69);//自动拆箱

        Integer i4=new Integer(69);
        System.out.println(i3==i4);//false


    }
}
