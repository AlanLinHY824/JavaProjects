package demo5;

/**
 * @AlanLin 2020/6/17
 */
public class Animal {
    String nickname;
    int age;
    String color;

    public void print(){
        System.out.println("昵称:"+nickname+"\n"+"年龄："+age+"\n"+"颜色："+color);
    }
    public void doSome(){
        print();
    }
}
