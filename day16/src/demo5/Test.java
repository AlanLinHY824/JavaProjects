package demo5;

/**
 * @AlanLin 2020/6/18
 */
public class Test {
    public static void main(String[] args) {
        /*
            多态的语法格式：
            父类型引用=子类型对象；
            注意：当构成多态时，对象名只能访问父类中的实例变量，对象与实例变量为静态绑定，根据左边的变量类型调用；与方法是动态绑定的，调用方法时根据右侧的对象类型调用
         */
        Vehicle v=new Car();//构成多态
        System.out.println(v.brand);
        System.out.println(v.id);
        //System.out.println(v.type);   出现编译错误，原因：当前type实例变量是子类独有的，因此使用父类型引用不能使用

        v.print();
        System.out.println(v.getSumRent(10));

    }
}
