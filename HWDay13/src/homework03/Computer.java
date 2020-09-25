package homework03;

/**
 3、
 编写电脑类：
 属性：品牌、价格、颜色、尺寸
 方法：显示电脑的信息
 测试类：
 1）创建电脑对象同时执行无参构造方法 ，调用方法显示信息
 2）创建电脑对象同时执行带2个参数构造方法完成对属性赋值，调用方法显示信息
 3）创建电脑对象同时执行带4个参数构造方法完成对所有属性赋值，调用方法显示信息
 * @AlanLin 2020/6/15
 */
public class Computer {
    String brand;
    double price;
    String color;
    String size;
    public void print(){
        System.out.println("电脑品牌："+brand+"\n"+"价格："+price+"\n"+"颜色："+color+"\n"+"尺寸："+size);
    }

    public Computer() {
    }

    public Computer(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public Computer(String brand, double price, String color, String size) {
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.size = size;
    }
}
