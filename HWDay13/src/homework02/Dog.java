package homework02;

/**
 * 2、
 * 编写狗类：
 * 属性：昵称、年龄、性别、体重、品种
 * 方法：显示狗的信息
 * 测试类：
 * 1）创建狗对象同时执行无参构造方法 ，调用方法显示信息
 * 2）创建狗对象同时执行带3个参数构造方法完成对属性赋值，调用方法显示信息
 * 3）创建狗对象同时执行带5个参数构造方法完成对所有属性赋值，调用方法显示信息
 * @AlanLin 2020/6/15
 */
public class Dog {
    String nickname;
    int age;
    char gender;
    double weight;
    String variety;
    public void print(){
        System.out.println("昵称："+nickname+"\n"+"年龄："+age+"\n"+"性别："+gender+"\n"+"体重"+weight+"\n"+"品种："+variety);
    }

    public Dog() {
    }

    public Dog(String nickname, int age, String variety) {
        this.nickname = nickname;
        this.age = age;
        this.variety = variety;
    }

    public Dog(String nickname, int age, char gender, double weight, String variety) {
        this.nickname = nickname;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.variety = variety;
    }
}
