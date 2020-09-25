package demo7;

/**
 * @AlanLin 2020/6/17
 */
public class Student extends Person{
    String stuId;
    String name;
    char gender;
    int age;

    @Override
    public void introduce() {
        System.out.println("学号："+stuId);
        System.out.println("姓名："+this.name);
        System.out.println("性别："+this.gender);
        System.out.println("年龄："+this.age);
    }

    public void doSome(){
        super.introduce();
    }

    public void study(){
        System.out.println("学生"+name+"正在学习");
    }

    public Student(String name, char gender, int age, String stuId) {
        super(name, gender, age);
        this.stuId = stuId;
    }

    public Student() {
    }
}
