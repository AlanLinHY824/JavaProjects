package src.company;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 2)定义Company公司类
 */
public class Company {

    //  公司中有若干的员工, 使用数组来保存这些员工的信息
    private company.Employee[] data;
    //一般情况下, 在使用对象数组时, 会定义一个变量记录数组中元素的数量
    private int size;

    //一般情况下,会在无参构造方法中给数组默认初始化
    public Company(){
        data = new company.Employee[100];       //数组大小需要估算
    }
    //有时也可以通过构造方法来接收数组的大小(容量)
    public Company(int capacity){
        if ( capacity > 0) {
            data = new company.Employee[capacity];
        }else {
            data = new company.Employee[100];
        }
    }

//    定义方法添加员工,通过参数来接收一个员工对象
    public void add( company.Employee e){
        //把参数e接收的员工对象添加到data数组中
        //一般情况下,向数组中添加元素前,会判断数组是否还有足够容量,或者判断数组是否需要扩容
        if ( size == data.length ){
            //size当前数组中元素的数量等于 数组的长度,说明 数组已满 , 需要扩容'
            data = Arrays.copyOf(data, data.length * 2);
        }
        data[size++] = e;
    }

//            定义方法显示公司中所有员工的信息
    public void showAll(){
        System.out.println("---------------所有员工信息------------------");
        for (int i = 0; i < size; i++) {
            System.out.println( data[i]);
        }
    }
//    定义方法查找公司中是否存在指定姓名的员工
    public boolean containsName(String name){
        //当方法的形参是引用类型时, 如果在方法体中需要访问形参的属性或者调用形参的方法,经常在方法体中对形参进行判断是否为null
       /* if ( name !=  null) {
            //遍历数组中前size个元素,如果有某个元素的姓名与参数name一样就返回true, 遍历完所有的员工,如果没有找到姓名一样的,就返回false
            for (int i = 0; i < size; i++) {
                if (name.equals(data[i].getName())) {
                    return true;
                }
            }
        }else {
            //参数为null的情况, 判断数组中前size个员工对象,是否有某个员工的姓名也为null
            for (int i = 0; i < size; i++) {
                if ( data[i].getName() == null ){
                    return true;
                }
            }
        }
        return false;*/

       return  indexOf(name) >= 0 ;
    }

//   定义方法删除公司中指定姓名的员工
    public void deleteByName(String name){
        int index = indexOf(name);
        if ( index < 0 ){
            System.out.println(name + "姓名的员工不存在,无需删除");
            return;
        }

        //index索引值大于等于0, 表示姓名存在, 删除index索引值的元素,就是把后面的元素逐个前移
        System.arraycopy(data, index+1, data, index, size - index - 1);
        size--;
        data[size] = null;
    }

    //定义方法返回指定姓名在数组中的索引值,如果数组中员工对象不包含指定的姓名则返回-1
    private int indexOf(String name) {
        if ( name !=  null) {
            //遍历数组中前size个元素,如果有某个元素的姓名与参数name一样就返回元素的下标
            for (int i = 0; i < size; i++) {
                if (name.equals(data[i].getName())) {
                    return i;
                }
            }
        }else {
            //参数为null的情况, 判断数组中前size个员工对象,是否有某个员工的姓名也为null
            for (int i = 0; i < size; i++) {
                if ( data[i].getName() == null ){
                    return i;
                }
            }
        }
        return -1;
    }

//    定义方法对公司中的员工根据年龄升序排序
    public void sortByAge(){
        Arrays.sort(data, 0, size, new Comparator<company.Employee>() {
            @Override
            public int compare(company.Employee o1, company.Employee o2) {
                return o1.getAge() - o2.getAge();   //o1年龄大返回正数对应升序排序
            }
        });
    }
//            定义方法对公司中的员工根据工资降序排序
    public void sortBySalaryDesc(){
        Arrays.sort(data, 0, size, new Comparator<company.Employee>() {
            @Override
            public int compare(company.Employee o1, company.Employee o2) {
                //如果o2工资高返回正数对应降序
//                return (int)( o2.getSalary() - o1.getSalary());   //9.3 与 8.6一样大
//                return (int)o2.getSalary() - (int)o1.getSa|lary();   //9.1与9.9一样大
                if (o2.getSalary() > o1.getSalary() ){
                    return  1;
                }else if (o2.getSalary() == o1.getSalary() ){
                    return 0;
                }else {
                    return -1;
                }
            }
        });
    }

    //根据姓名升序排序
    public void sortByName(){
        Arrays.sort(data, 0, size, new Comparator<company.Employee>() {
            @Override
            public int compare(company.Employee o1, company.Employee o2) {
                //o1的姓名大返回正数, 对应升序
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}
