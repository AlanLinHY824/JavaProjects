package demo8;

/**
 * @AlanLin 2020/6/19
 */
public class Test {
    public static void main(String[] args) {
        Person p1=new Person("张三", 19, '男');

        Person p2=new Person("张三", 19, '男');
        //java中的==比较的是左右两边变量中存放的值，也就是说引用数据类型比较的是内存地址
        System.out.println(p1==p2);
        //将p1中的地址赋值给p3
        Person p3=p1;
        System.out.println(p1==p3);
        /*
            需求：比较两个对象中各个属性值是否一致
            解决办法：使用equals方法，但是Object中的equals方法默认是用“==”进行比较，所以需要在子类中重写equals方法
            快捷键Alt+Insert选择equals方法
         */
        System.out.println(p1.equals(p2));

        System.out.println(p1.name==p2.name);
        System.out.println(p1.name.equals(p2.name));

    }
}
