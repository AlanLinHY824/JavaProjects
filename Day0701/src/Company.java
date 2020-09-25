package src;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * 2)定义Company公司类
 */
public class Company {

    //  公司中有若干的员工, 使用List集合来保存这些员工的信息
   private List<Employee> list = new ArrayList<>();

//    定义方法添加员工,通过参数来接收一个员工对象
    public void add( Employee e){
        //把参数e接收的员工对象添加到list集合中
        list.add(e);
    }

//            定义方法显示公司中所有员工的信息
    public void showAll(){
        System.out.println("---------------所有员工信息------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println( list.get(i) );
        }
    }
//    定义方法查找公司中是否存在指定姓名的员工
    public boolean containsName(String name){
        //当方法的形参是引用类型时, 如果在方法体中需要访问形参的属性或者调用形参的方法,经常在方法体中对形参进行判断是否为null
        if (name == null){
            //遍历List集合时,如果List集合中元素非常多, 如果是ArrayList集合,通过for循环索引值访问集合元素效率高; 如果是LinkedList集合,通过foreach或者迭代效率高
            for (Employee employee : list) {
                if ( employee.getName() == null){
                    return true;
                }
            }
        }else {
            for (Employee employee : list) {
                if ( name.equals(employee.getName())){
                    return true;
                }
            }
        }
        return false;
    }

//   定义方法删除公司中指定姓名的员工
    public void deleteByName(String name){
        if ( name == null ){
            for (Iterator<Employee> iterator = list.iterator(); iterator.hasNext(); ) {
                Employee next = iterator.next();
                if ( next.getName() == null ){
                    iterator.remove();
                }
            }
        }else {
            for (Iterator<Employee> iterator = list.iterator(); iterator.hasNext(); ) {
                Employee next = iterator.next();
                if ( name.equals(next.getName())){
                    iterator.remove();
                }
            }
        }
    }


//    定义方法对公司中的员工根据年龄升序排序
    public void sortByAge(){
        list.sort( new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
//                return o1.getAge() - o2.getAge();   //o1年龄大返回正数对应升序排序
                return  Integer.compare(o1.getAge(), o2.getAge() );
            }
        });
    }
//            定义方法对公司中的员工根据工资降序排序
    public void sortBySalaryDesc(){
        list.sort( new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                //如果o2工资高返回正数对应降序
//                return (int)( o2.getSalary() - o1.getSalary());   //9.3 与 8.6一样大
//                return (int)o2.getSalary() - (int)o1.getSa|lary();   //9.1与9.9一样大
               /* if (o2.getSalary() > o1.getSalary() ){
                    return  1;
                }else if (o2.getSalary() == o1.getSalary() ){
                    return 0;
                }else {
                    return -1;
                }*/
               return Double.compare(o2.getSalary(), o1.getSalary() );
            }
        });
    }

    //根据姓名升序排序
    public void sortByName(){
        list.sort( new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                //o1的姓名大返回正数, 对应升序
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}
