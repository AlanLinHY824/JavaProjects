package demo1;

/**
 * @AlanLin 2020/6/20
 */
public abstract class Person {
    String name;
    int age;
    char gender;

    public Person() {
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


}
