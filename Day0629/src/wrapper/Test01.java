package src.wrapper;

/**
 * 包装类可以使代码更方便
 */
public class Test01 {
    public static void main(String[] args) {

        sm(123);    //不能直接把整数123传递给形参x, 这儿没有语法错误 , 系统会自动的把整数123先转换为Integer包装类对象, 再把该Integer包装类对象的引用传递给形参x

        sm(3.14);   //系统会根据小数3.14创建Double包装类对象, 把该对象的引用传递给形参x

        sm("hello");

    }

    //定义方法可以处理任意类型的数据, 在没有包装类时,可以通过方法的重载来实现, 需要针对每一种数据类型定义一个方法重载
    /*public static void sm(int x){}
    public static void sm(double x){}
    public static void sm(char x){}
    public static void sm(boolean x){}
    public static void sm(Object x){}*/

    //有了包装类后, 只需要定义一个方法即可
    public static void sm(Object x){}
}
