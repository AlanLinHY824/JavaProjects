package homework03;

/**
 * @AlanLin 2020/6/17
 */
public class Person {
    String name;
    char gender;
    int age;

    public void introduce(){
        System.out.println("姓名："+this.name);
        System.out.println("性别："+this.gender);
        System.out.println("年龄："+this.age);
    }

    public Person(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Person() {
    }
}
