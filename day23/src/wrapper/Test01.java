package wrapper;

/**
 * @AlanLin 2020/6/29
 */
public class Test01 {
    public static void main(String[] args) {
        method(123);//不能直接把整数123传递给形参，但是这里没有出语法错误，因为系统会自动把整数123先转换为Integer包装类对象，再传递给形参x



    }
    //定义方法可以处理任意类型的数据。在没有包装类的时候，可以通过方法重载来实现，需要针对每一种数据类型，定义一个重载方法
    //有了包装类之后，只需要定义一个方法即可，包装类可以使代码更加方便
    public static void method(Object x){}

}
