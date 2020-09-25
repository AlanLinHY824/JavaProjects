package project;

import java.util.Scanner;

/**
 * @AlanLin 2020/6/27
 */
public class CompanyView {
    private Company company=new Company("幻羽软件科技公司",new Employee[30]);
    public static void main(String[] args) {
        CompanyView companyView=new CompanyView();
        companyView.mainMenu();


    }

    public void mainMenu(){
        boolean loopFlag=true;
        do {
            System.out.println("======员工信息管理系统======");
            System.out.println("1、添加员工；");
            System.out.println("2、修改员工信息；");
            System.out.println("3、删除员工；");
            System.out.println("4、员工列表；");
            System.out.println("5、退出系统；");
            System.out.print("请根据要实现的功能选择对应的序号：");
            int key= Utility.menuSelect();
            System.out.println();
            switch (key){
                case 1:
                    addEmployee();
                    break;
                case 2:
                    modifyEmployee();
                    break;
                case 3:
                    delEmployee();
                    break;
                case 4:
                    company.showEmployee();
                    break;
                case 5:
                    loopFlag=false;
                    break;
                default:
                    System.out.println("对不起，序号选择，错误请重新输入：");
                    break;
            }

        }while (loopFlag);

    }

    private void delEmployee() {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入要删除的员工序号");
        int selection= Utility.menuSelect();
        if (company.getSize()<selection){
            System.out.println("对不起，序号输入错误");
        }
        else {
            company.delEmployee(selection-1);
        }
    }

    public void modifyEmployee() {
        Scanner s=new Scanner(System.in);
        Employee employee=new Employee(null, null, 0, 0);
        System.out.println("请输入要修改的员工序号");
        int selection= Utility.menuSelect();
        if (company.getSize()<selection){
            System.out.println("对不起，序号输入错误");
        }else {
            System.out.print("身份证号：");
            employee.setId(s.next());
            System.out.print("姓名：");
            employee.setName(s.next());
            System.out.print("年龄：");
            employee.setAge(s.nextInt());
            System.out.print("薪资：");
            employee.setSalary(s.nextDouble());
            company.modifyEmployee(selection, employee);
        }

    }

    public void addEmployee() {
        Scanner s=new Scanner(System.in);
        Employee employee=new Employee(null, null, 0, 0);
        System.out.println("请输入员工信息");
        System.out.print("身份证号：");
        employee.setId(s.next());
        System.out.print("姓名：");
        employee.setName(s.next());
        System.out.print("年龄：");
        employee.setAge(s.nextInt());
        System.out.print("薪资：");
        employee.setSalary(s.nextDouble());
        company.addEmployee(employee);
    }


}
