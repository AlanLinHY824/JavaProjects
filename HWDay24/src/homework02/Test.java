package homework02;

/**
 * @AlanLin 2020/6/24
 */
public class Test {
    public static void main(String[] args) {
        Company company=new Company();
        company.showEmployee();
        company.addEmployee(new Employee("001", "张三", 24, 10000));
        company.addEmployee(new Employee("002", "李四", 30, 20000));
        company.addEmployee(new Employee("003", "王五", 45, 30000));
        company.addEmployee(new Employee("004", "赵六", 35, 15000));
        company.addEmployee(new Employee("005", "朱八", 26, 10000));
        company.addEmployee(new Employee("006", "孙七", 25, 12000));
        System.out.println("==========添加后的员工==========");
        company.showEmployee();
        //按年龄排序
        System.out.println("==========按年龄排序==========");
        company.ascOrderByAge();
        company.showEmployee();
        //按薪资排序
        System.out.println("==========按薪资排序==========");
        company.descOrderBySalary();
        company.showEmployee();
        //按名字查询
        company.isExistByName("张三");
        company.isExistByName("马云");
        //删除操作
        company.delEmployee("孙七");
        System.out.println("==========删除后的员工==========");
        company.showEmployee();
    }
}
