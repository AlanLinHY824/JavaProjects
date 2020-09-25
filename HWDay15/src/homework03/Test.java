package homework03;

/**
 * @AlanLin 2020/6/17
 */
public class Test {
    public static void main(String[] args) {
        Student stu1=new Student("张三", '男', 23, "20012");
        Teacher tea1=new Teacher("李四", '男', 35, 10000);
        stu1.introduce();
        stu1.study();
        tea1.introduce();
        tea1.teach();
    }
}
