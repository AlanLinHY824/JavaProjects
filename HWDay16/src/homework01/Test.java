package homework01;

import java.util.Scanner;

/**
 * @AlanLin 2020/6/17
 */
public class Test {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while (true) {
            System.out.println("欢迎来到汽车租赁系统，请选择需要操作的功能：");
            System.out.println("1、租赁汽车；     2、退出系统");
            int choice = s.nextInt();
            if (choice==1){
                System.out.println("请选择车辆种类：");
                System.out.println("1、小轿车   2、大巴车");
                int type = s.nextInt();
                if (type==1) {
                    System.out.println("请输入车型：");
                    String kind = s.next();
                    System.out.println("请输入租赁天数：");
                    int days = s.nextInt();
                    Car car1 = new Car("丰田", "沪A8888", kind);
                    System.out.println("总租金为：" + car1.getSumRent(days) + "元");
                    continue;
                } else if (type==2){
                    System.out.println("请输入座位数：");
                    int seating = s.nextInt();
                    System.out.println("请输入租赁天数：");
                    int days = s.nextInt();
                    Bus bus1 = new Bus("宇通", "沪A6666", seating);
                    System.out.println("总租金为：" + bus1.getSumRent(days) + "元");
                    continue;
                }
                else {
                    System.out.println("车辆种类输入错误");
                    continue;
                }
            }
            else if (choice==2){
                return;
            }
            else {
                System.out.println("输入错误，请重新输入");
                continue;
            }
        }
    }
}
