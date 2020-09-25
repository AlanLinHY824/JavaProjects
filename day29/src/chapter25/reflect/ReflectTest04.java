package chapter25.reflect;

import chapter25.bean.User;

/**
 * Class.forName()方法的执行会导致类加载
 * 如果希望静态代码块执行，其他代码一律不执行，可以使用这个方法
 * 学习JDBC时会用到这个方法
 * @AlanLin 2020/7/14
 */
public class ReflectTest04 {
    public static void main(String[] args) {
        Class c2= MyClass.class;
        try {
            Class c=Class.forName("chapter25.reflect.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        MyClass myClass=new MyClass();

    }
}

class MyClass{
    static {//静态代码块在类加载时执行，而且只执行一次
        System.out.println("类加载");
    }
}
