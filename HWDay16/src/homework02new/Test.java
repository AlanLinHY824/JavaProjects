package homework02new;

/**
 * @AlanLin 2020/6/18
 */
public class Test {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee1=new SalariedEmployee("张三", 6, 10000);
        HourlyEmployee hourlyEmployee1=new HourlyEmployee("李四", 5, 22, 264);
        SalesEmployee salesEmployee1=new SalesEmployee("王五", 11, 50000, 0.2);
        Employee basePlusSalesEmployee1=new BasePlusSalesEmployee("赵六", 10, 50000, 0.15, 5000);

        showSalary(salariedEmployee1,6);
        showSalary(hourlyEmployee1, 6);
        showSalary(salesEmployee1, 6);
        showSalary(basePlusSalesEmployee1, 6);
    }

    private static void showSalary(Employee employee, int month) {
        if (employee instanceof SalariedEmployee){
            System.out.println("固定薪酬雇员"+employee.name+month+"月份的薪资为"+employee.getSalary(month)+"元");
        }
        else if(employee instanceof HourlyEmployee){
            System.out.println("小时工雇员"+employee.name+month+"月份的薪资为"+employee.getSalary(month)+"元");
        }
        else if (employee instanceof BasePlusSalesEmployee){
            System.out.println("有底薪销售雇员"+employee.name+month+"月份的薪资为"+employee.getSalary(month)+"元");
        }
        else if (employee instanceof SalesEmployee){
            System.out.println("无底薪销售雇员"+employee.name+month+"月份的薪资为"+employee.getSalary(month)+"元");
        }
    }


}
