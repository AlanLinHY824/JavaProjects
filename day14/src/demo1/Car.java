package demo1;

/**
 * 1、this关键字可以访问当前对象中的实例变量
 *      1.1如果没有局部变量与成员变量同名时，可以省略this.直接使用成员变量，默认前面有this.；
 *      1.2如果局部变量与成员变量同名时，若需要访问成员变量，必须使用this.，不能省略
 *      如：id等价于this.id
 * 2.如果方法没有static修饰，则成为实例方法，需要创建对象后才能使用该方法
 *      在同一个类的内部，实例方法之间是可以直接相互访问的，调用时默认添加this.关键字
 *      如：print等价于this.print
 * 3.this关键字可以调用本类中的其他构造方法，this();表示调用本类中的w无参构造方法
 *     this(id,brand,price);表示调用本类中的其他有参构造方法
 *     使用this()调用本类构造方法时，只能编写在构造方法中的第一行
 *     构造方法不能自己调用自己（递归），会出现死循环
 *
 * @AlanLin 2020/6/16
 */
public class Car {
    String id;
    String brand;
    int price;
    String color;

    public Car() {
    }

    public Car(String id, String brand, int price, String color) {
        this(id,brand,price);
        this.color = color;
    }

    public Car(String id, String brand, int price) {
        this.id = id;
        this.brand = brand;
        this.price = price;
    }

    public void print(){
        System.out.println("车牌号："+id);
        System.out.println("品牌"+brand);
        System.out.println("价格"+price);
        System.out.println("颜色"+color);
    }
}
