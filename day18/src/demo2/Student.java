package demo2;

import java.util.Objects;

/**
 *  实体类编写：
 *      属性设置为私有
 *      set和get方法
 *      重写toString和equals方法
 * @AlanLin 2020/6/20
 */
public class Student {
    private String id;
    private String name;
    private int age;
    private char gender;
    private double score;

    public Student() {
    }

    public Student(String id, String name, int age, char gender, double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                gender == student.gender &&
                Double.compare(student.score, score) == 0 &&
                Objects.equals(id, student.id) &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, gender, score);
    }

    public String getId() {
        return id;
    }

    public Student setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public char getGender() {
        return gender;
    }

    public Student setGender(char gender) {
        this.gender = gender;
        return this;
    }

    public double getScore() {
        return score;
    }

    public Student setScore(double score) {
        this.score = score;
        return this;
    }
}
