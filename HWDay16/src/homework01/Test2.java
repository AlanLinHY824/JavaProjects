package homework01;

import java.util.Scanner;

/**
 * 程序调试
 *      目的：看当前代码的执行过程，检查代码错误的原因
 *      步骤：
 *          第一步：设置断点，在某一行前点击，出现红色圆圈
 *          第二步：启动调试
 *          第三步：单步跳入方法执行按F7，单步跳过方法执行按F8（不进入方法内部，直接执行方法）
 * @AlanLin 2020/6/19
 */
public class Test2 {
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
                Vehicle vehicle=null;
                if (type==1) {
                    System.out.println("请选择车型：");
                    String kind = s.next();
                    vehicle= new Car("丰田", "沪A8888", kind);
                } else if (type==2){
                    System.out.println("请输入座位数：");
                    int seating = s.nextInt();
                    vehicle = new Bus("宇通", "沪A6666", seating);
                }
                else {
                    System.out.println("车辆种类输入错误");
                    continue;
                }
                System.out.println("请输入租赁天数：");
                int days = s.nextInt();
                System.out.println("总租金为：" + vehicle.getSumRent(days) + "元");
                continue;
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
