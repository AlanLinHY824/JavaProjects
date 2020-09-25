/**
 * @AlanLin 2020/6/23
 */
public class Person {
    String name;
    int age;
    Person p;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person() {

    }

    public void setPerson(){
        p=new Person();
    }

}
