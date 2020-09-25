package demo3;

/**
 * final关键字修饰属性
 * 1.变量：存放的数据可以发生改变的；
 *   常量：存放的数据不可以改变。
 *   2、final关键字修饰属性称为常量；
 *   3、常量有两种不同的赋值方式：
 *      1、声明的同时完成赋值
 *      2、在构造方法中完成赋值
 *  4、final 关键字一般与static关键字配合使用  因为final关键字无法修改，最好设置为静态的。只在方法区开辟一块空间让所有对象都可以使用
 *  5、建议常量名全部大写，若有多个单词则单词之间使用下划线隔开
 *      比如PI表示π
 *      系统提供Math类，数学操作相关的，其中有一个常量PI
 *
 * @AlanLin 2020/6/19
 */
public class Person {
    int x;
    final int y=100;
    final int z;

    public Person(int x, int z) {
        this.x = x;
        this.z = z;
    }

    public void print(){
        System.out.println(Math.PI);
    }

}
