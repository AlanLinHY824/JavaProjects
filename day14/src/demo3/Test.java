package demo3;

/**
 * @AlanLin 2020/6/16
 */
public class Test {
    public static void main(String[] args) {
        //当使用到MyClass时，JVM会自动将MyClass字节码文件加载到方法区内存中
        //然后在方法区给静态变量y分配空间，并且默认值为0（若有赋值语句则为赋值）
        //可以使用类名.静态变量使用y变量
        MyClass.y=100;
        System.out.println(MyClass.y);
        //System.out.println(MyClass.x);x是实例变量，只有创建对象时才存在，无法使用类名.的方式访问
        MyClass mc=new MyClass();
        System.out.println(mc.x);
        System.out.println(mc.y);//静态变量不属于某个对象但是对象名.变量的方式可以访问
        //当对象名m的值为null时，也就是说m不再指向该对象时，则该对象就变为垃圾回收了，该对象中的实例变量也随之回收了
        mc=null;
        //System.out.println(mc.x);//运行时出现空指针异常
        System.out.println(mc.y);//只要mc为MyClass类型的数据，即使在为null的情况下，仍可访问静态变量y，因为静态变量的访问与对象无关
    }
}
