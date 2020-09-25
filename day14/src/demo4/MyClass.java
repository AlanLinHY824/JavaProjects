package demo4;

/**
 * static关键字修饰方法
 * 1、如果方法使用static关键字修饰为静态方法
 *      如果没有static修饰为实例（对象）方法，或者非静态方法
 * 2、静态方法访问形式：
 *      类名.静态方法([参数列表])
 *      对象名.静态方法([参数列表])
 *      注意：当对象为null时，仍可以访问静态方法；
 * 3、当类加载到内存时，静态变量和静态方法就存在，所以静态方法中只能使用静态方法和静态变量
 *      当创建对象时，类和实例变量与对象都存在，所以实例方法可以访问静态方法/变量，也可以访问实例方法/变量
 * 4、main方法也属于静态方法，在main方法中可以直接访问本类中的其他静态方法
 * 5、静态方法使用场景
 *      1.方法中没有实例方法和实例变量时，可以编写为静态方法
 *      2.工具类中的方法一般编写为静态方法，可以使用类名.方法名调用，比较方便
 *
 * @AlanLin 2020/6/16
 */
public class MyClass {
    int x;
    static int y;
    public void pront(){

    }
    public static void show(){
        y=11;
        //x=22;

    }
}
