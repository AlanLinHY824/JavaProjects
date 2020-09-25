package src.set;

import java.util.HashSet;

/**
 * HashSet存储顺序与 元素的哈希码有关, 即存储对象的hashCode()方法返回值有关
 * 在HashSet集合中存储自定义类型对象, 一般需要重写equals()/hashCode()
 * HashSet底层数据结构是HashMap
 *
 */
public class Test02 {
    public static void main(String[] args) {
        //创建HashSet集合存储Person对象
        HashSet<Person> hashSet = new HashSet<>();
        Person p = new Person("zhangsan", 26);
        hashSet.add(p);
        hashSet.add( new Person("lisi", 22));
        hashSet.add( new Person("wangwu", 27));
        hashSet.add( new Person("zhaoliu", 21));
        hashSet.add( new Person("chenqi", 20));
        hashSet.add( new Person("zhuba", 25));

        for (Person person : hashSet) {
            System.out.println(person);
        }
        //Person{name='wangwu', age=27}
        //Person{name='zhaoliu', age=21}
        //Person{name='lisi', age=22}
        //Person{name='zhuba', age=25}
        //Person{name='chenqi', age=20}
        //Person{name='zhangsan', age=26}
        String a=new String("上海");
        System.out.println(a.hashCode());

        System.out.println(a.hashCode());

        p.age = 27;
        System.out.println( hashSet.contains(p) );  //false , 在第15行向集合中添加p对象时, p对象的年龄是26,
        // 根据姓名与年龄计算得出一个哈希码, 根据这个哈希码存储到集合的某个位置上;  在26行修改了p对象的age属性,
        // 在调用contains(p)时, 现在重新计算p对象的哈希码, 现在的哈希码与存储p对象的哈希码可能不一样,
        // 即可能会去一个新的位置查找p对象, 不存在返回false
        hashSet.add(p);//添加成功
        for (Person person : hashSet) {
            System.out.println(person);
        }
        System.out.println("===========");
        hashSet.add( new Person("wangwu1", 27));
        hashSet.add( new Person("zhaoliu2", 21));
        hashSet.add( new Person("chenq3i", 20));
        hashSet.add( new Person("zhuba3", 25));
        hashSet.add( new Person("wangwu7", 27));
        hashSet.add( new Person("zhaoliu7", 21));
        hashSet.add( new Person("chenqi8", 20));
        hashSet.add( new Person("zhuba9", 25));
        for (Person person : hashSet) {
            System.out.println(person);
        }
        System.out.println( hashSet.contains(p) );
        //Person{name='wangwu', age=27}
        //Person{name='zhangsan', age=27}
        //Person{name='zhaoliu', age=21}
        //Person{name='lisi', age=22}
        //Person{name='zhuba', age=25}
        //Person{name='chenqi', age=20}
        //Person{name='zhangsan', age=27}
        System.out.println("=======");
        HashSet<Person> hashSet2 = new HashSet<>(hashSet);
        for (Person person : hashSet2) {
            System.out.println(person);
        }

    }
}
