package homework02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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
    private List<Employee> employees = new ArrayList<>();

    //对薪资降序排序
    public void descOrderBySalary(){
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o2.getSalary()>o1.getSalary()){
                    return 1;
                }
                else if (o1.getSalary()==o2.getSalary()){
                    return 0;
                }
                return -1;
            }
        });
    }
    //对年龄升序排序
    public void ascOrderByAge(){
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge()-o2.getAge();
            }
        });
    }
    //添加单个员工
    public void addEmployee(Employee employee){
        if (employees.contains(employee)){
            System.out.println("该员工已经存在");
            return;
        }
        employees.add(employee);
    }

    //显示所有员工的信息
    public void showEmployee(){
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    //以下有优化，添加了寻找姓名索引值的方法，判断存在的方法和删除方法都可以使用
    //根据姓名查找员工
    public void isExistByName(String name){
        System.out.println(searchByName(name)>=0?"存在姓名为"+name+"的员工":"不存在姓名为"+name+"的员工");
    }

    //寻找对应姓名的索引值
    public int searchByName(String name){
        //要判断形参是否为null
        if (name==null){
            for (int i = 0; i <employees.size() ; i++) {
                if (name==employees.get(i).getName()){
                    return i;
                }
            }
            return -1;
        }
        else {
            for (int i = 0; i <employees.size() ; i++) {
                if (name.equals(employees.get(i).getName())){
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
            employees.remove(index);
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "公司名称：" + name +
                "；公司地址：'" + addr  +
                "；员工人数：" + employees.size() +
                '}';
    }

    public Company() {
    }

    public Company(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Company setEmployees(List<Employee> employeeList) {
        return this;
    }
}
