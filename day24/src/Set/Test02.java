package Set;

import java.util.HashSet;
import java.util.Objects;

/**
 * HashSet存储顺序与元素的哈希码有关，即存储对象的hashcode()的返回值有关
 * 一般情况下载Hash集合中存储自定义类型对象，一般需要重写hashcode()和equals方法
 * HashSet底层数据结构是HashMap
 * @AlanLin 2020/6/30
 */
public class Test02 {
    public static void main(String[] args) {
        //创建HashSet对象存储Person对象
        HashSet<Person> hashSet=new HashSet<>();

        Person p=new Person("zhangsan", 26);
        hashSet.add(p);
        hashSet.add(new Person("李四",22));
        hashSet.add(new Person("张三",21));
        hashSet.add(new Person("王五",23));
        hashSet.add(new Person("赵六",25));
        hashSet.add(new Person("陈七",27));

        p.age=27;
        System.out.println(hashSet.contains(p));//false，在15行向集合中添加p对象时，p对象的年龄是26，根据姓名与年龄计算出一个哈希码，根据这个哈希码存储到集合的某个位置上，在26行修改了p的age属性，虽然p对象的哈希码值已经改变，但是它在集合中存放的位置（仍然是原哈希码的位置）并不会改变，在所以调用contain方法时，现在的哈希码与存储p对象的哈希码可能不一样，即可能会去一个新的位置查找p对象，不存在就返回false

        System.out.println(hashSet.contains(p));
        boolean exist=false;
        for (Person person : hashSet) {
            if (person.equals(p)){
                exist=true;
            }
        }

        System.out.println(exist);
        hashSet.add(p);
        System.out.println(hashSet);

    }
}
class Person{
    String name;
    int age;

    public Person() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

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
}
