package demo5;

/**
 * @AlanLin 2020/6/18
 */
public class Test2 {
    public static void main(String[] args) {
        /*
            多态：多种不同形态（结果）
            多个对象调用相同一个方法得到不同结果

            满足多态的条件：
                1、子类继承父类
                2、子类必须重写父类方法
                3、父类类型 变量名=new 子类()；

         */
        Vehicle v=new Car();
        System.out.println(v.getSumRent(1));
        v=new Bus();
        System.out.println(v.getSumRent(20));
    }
}
