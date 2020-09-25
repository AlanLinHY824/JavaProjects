package homework;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 练习：
 * 	按照实体类的标准定义一个Employee员工类，有姓名、年龄、工资等属性
 * 	定义Company类
 * 		公司中有若干的员工，使用数组来保存这些员工的信息
 * 		定义方法添加员工
 * 		定义方法显示公司中所有员工的信息
 * 		定义方法查找公司中是否存在制定姓名的员工
 * 		定义方法删除公司中指定姓名的员工
 * 		定义方法对公司中的员工根据年龄升序排序
 * 		定义方法对公司中的员工根据工资降序排序
 * 编写测试类
 * @AlanLin 2020/6/24
 */
public class Company {
    String name;
    String addr;
    private Employee[] employees;
    private int size; //记录元素个数，即员工人数

    //修改员工信息
    public void modifyEmployee(int no,Employee employee){
        employees[no-1]=employee;
    }

    //对薪资降序排序
    public void descOrderBySalary(){
        Arrays.sort(employees, 0, size, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getSalary()<o2.getSalary()){
                    return 1;
                }else if (o1.getSalary()==o2.getSalary()){
                    return 0;
                }
                else {
                    return -1;
                }
            }
        });
    }
    //对年龄升序排序
    public void ascOrderByAge(){
        Arrays.sort(employees, 0, size, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getAge()>o2.getAge()){
                    return 1;
                }else if (o1.getAge()==o2.getAge()){
                    return 0;
                }
                else {
                    return -1;
                }
            }
        });
    }
    //添加单个员工
    public void addEmployee(Employee employee){
        //根据身份证号判断该员工是否已存在，避免重名的情况造成误判
        boolean exist=isExistById(employee);
        if (!exist){
            //判断数组是否已经满了，没满直接添加，满了的话就扩容
            if (size==employees.length){
                employees = Arrays.copyOf(employees, employees.length+1);
                employees[size++]=employee;
            }else if (size<employees.length){
                employees[size++]=employee;
            }

        }else {
            System.out.println("对不起，该员工已存在！");
        }
    }
    //批量添加员工，纯属好奇，写着玩
    public void addEmployees(Employee...employee){
        for (int i = 0; i <employee.length ; i++) {
            if (isExistById(employee[i])){
                addEmployee(employee[i]);
            }
            else {
                System.out.println("员工"+employee[i]+"已存在");
            }
        }
    }
    //根据身份证号判断该员工是否存在，主要配合添加方法使用
    public boolean isExistById(Employee employee) {
        boolean exist=false;
        for (int i = 0; i <size; i++) {
            if (employees[i].getId()==employee.getId()){
                exist=true;
                break;
            }
        }
        return exist;
    }

    //显示所有员工的信息
    public void showEmployee(){
        for (int i = 0; i <size ; i++) {
            System.out.println(employees[i]==null?"":employees[i].toString());
        }

    }
    //以下有优化，添加了寻找姓名索引值的方法，判断存在的方法和删除方法都可以使用
    //根据姓名查找员工
    public void isExistByName(String name){
        //要判断形参是否为null
        System.out.println(searchByName(name)>=0?"存在姓名为"+name+"的员工":"不存在姓名为"+name+"的员工");
    }

    //寻找对应姓名的索引值
    public int searchByName(String name){
        //要判断形参是否为null
        if (name==null){
            for (int i = 0; i <size ; i++) {
                if (name==employees[i].getName()){
                    return i;
                }
            }
            return -1;
        }
        else {
            for (int i = 0; i <size ; i++) {
                if (name.equals(employees[i].getName())){
                    return i;
                }
            }
            return -1;
        }
    }

    //根据姓名删除员工
    public void delEmployee(String name){
        int index=searchByName(name);
        if (index<0){
            System.out.println("该员工不存在");
        }
        else {
            System.arraycopy(employees, index+1, employees, index, employees.length-size-1);
            size--;
            employees[size]=null;
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "公司名称：" + name +
                "；公司地址：'" + addr  +
                "；员工人数：" + size +
                '}';
    }
    //根据已存在的员工数组获取员工数
    public int setSize(){
        for (int i = 0; i <employees.length ; i++) {
            if (employees[i]==null){
                return i;
            }
        }
        return employees.length;
    }

    public int getSize() {
        return size;
    }

    //无参数的构造方法，默认提供长度为50的Employee类型数组
    public Company() {
        this.employees = new Employee[50];
    }
    //提供长度值用于创建数组
    public Company(String name, String addr, int length) {
        this.name = name;
        this.addr = addr;
        this.employees = new Employee[length];
        this.size=setSize();
    }

    public Company(String name, int length) {
        this.name = name;
        this.employees = new Employee[length];;
    }


    public Employee[] getEmployees() {
        return employees;
    }

    public Company setEmployees(Employee[] employees) {
        this.employees = employees;
        this.size=setSize();
        return this;
    }
}
