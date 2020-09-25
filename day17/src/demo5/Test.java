package demo5;

/**
 * @AlanLin 2020/6/19
 */
public class Test {
    public static void main(String[] args) {
        /*
            当创建Pet对象时并没有明确得到的是哪个宠物，因为创建的对象为父类，没有意义，就将该类编写为抽象类，让其无法实例化
            抽象类特点：
                1、抽象类使用abstract关键字
                2、抽象类不能实例化，也就是不能实例化，其实抽象类也就是多态的一种形式

         */

        //Pet p=new Pet();无法实例化
        Pet p=new Dog();//构成多态，也就是向上转型




    }
}
