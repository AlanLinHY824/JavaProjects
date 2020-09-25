package demo1;

/**
 * @AlanLin 2020/6/20
 */
public class Student extends Person {
    int id;

    public Student() {
    }

    public Student(String name, int age, char gender, int id) {
        super(name, age, gender);
        this.id = id;
    }

    public void study(){
        System.out.println("正在学习......");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
