package demo8;

import java.util.Objects;

/**
 * @AlanLin 2020/6/19
 */
public class Person {
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    /*@Override
    public boolean equals(Object o) {
        //第一种情况：比较当前对象与形参的内存地址
        if (this == o) return true;
        //第二种情况：形参为null或当前对象和形参对象的类型不一样，返回false
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                gender == person.gender &&
                name.equals(person.name);
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                gender == person.gender &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }
}
