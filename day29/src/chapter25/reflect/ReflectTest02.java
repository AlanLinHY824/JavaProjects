package chapter25.reflect;

/**
 * 通过Class的newInstance()方法实例化对象
 *
 * @AlanLin 2020/7/14
 */
public class ReflectTest02 {
    public static void main(String[] args) {
        //通过反射机制，获取Class，通过Class来实例化对象
        try {
            Class c=Class.forName("HelloWorld.src.chapter25.bean.User");
            try {
                Object obj=c.newInstance();//调用User类的无参构造方法，完成对象的创建，无法调用有参数的构造方法，如果没有无参构造，就会出运行时异常
                System.out.println(obj);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
