package homework03;

/**
 * @AlanLin 2020/6/18
 */
public class Test {
    public static void main(String[] args) {
        Master master=new Master();
        master.feed(new Dog("二哈"));
        master.feed(new Cat("喵喵"));
        master.feed(new Tiger("小虎"));
    }
}
