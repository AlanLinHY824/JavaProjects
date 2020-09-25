package demo2;

/**
 * 封装：
 *      1、在java中，面向对象的三大特征是：封装、继承、多态
 *         如果问第四大特征，就是抽象，抽象是面向对象程序设计的方法
 *      2、什么是封装：
 *          现实生活中的封装，比如：盒子、购物袋。。。。。。
 *          在java中就是，隐藏类的内部信息，不允许外部程序直接访问，而是通过方法来访问（setter和getter方法)
 *          目的：提高数据的安全性
 *      3、封装的操作步骤：
 *          第一步：将类中的属性设置为私有的（private），也就是该属性只能在本类中访问
 *          第二步：编写对应属性的赋值和取值方法
 *                  Alt+Insert,选择Getter，生成对应属性的取值方法，将对应属性的值返回
 *                  Alt+Insert,选择Setter，生成对应属性的赋值方法
 *          第三步：在方法中适当的位置添加判断语句
 *
 * @AlanLin 2020/6/16
 */
public class Student {
    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
