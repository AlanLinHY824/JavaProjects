package demo7;

/**
 * @AlanLin 2020/6/20
 */
public class Test {
    public static void main(String[] args) {
        //Pet p=new Pet()//接口无法实例化

        Pet p=new Dog();//多态
        p.eat();

        /*
            如果实现类只创建一次对象，可以使用匿名内部类完成
            匿名内部类：没有名字的实现类
         */

        Pet p1=new Pet() {//没有名字的宠物对象
            @Override
            public void eat() {
                System.out.println("正在吃东西");
            }
        };

        p1.eat();

    }
}
