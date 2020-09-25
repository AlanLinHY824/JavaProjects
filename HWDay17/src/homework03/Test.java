package homework03;

import java.util.Scanner;

/**
 * @AlanLin 2020/6/19
 */
public class Test {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Vehicle v=null;
        while (true) {
            System.out.println("欢迎进入汽车租赁系统");
            System.out.println("请选择以下序号，以实现对应功能：");
            System.out.println("1、租车  2、退出系统");
            int choice=s.nextInt();
            if (choice==1){
                System.out.println("请选择需要租赁的车种：");
                System.out.println("1、小轿车  2、巴士");
                int type=s.nextInt();
                v = getVhicle(type);
                if (v==null){
                    continue;
                }
                break;
            }
            else if (choice==2){
                return;
            }
            else {
                System.out.println("功能选择错误");
            }
        }
        System.out.println("请输入要租赁的天数");
        int days=s.nextInt();
        System.out.println("租金为："+v.getSumRent(days));
    }

    public static Vehicle getVhicle(int type) {
        Scanner s =new Scanner(System.in);
        if (type==1){
            System.out.println("请选择需要租赁的车型：");
            System.out.println("1、两厢  2、三厢  3、越野");
            int kind=s.nextInt();
            return new Car("丰田", "沪A88888", kind==1?"两厢":kind==2?"三厢":kind==3?"越野":null);
        }
        else if (type==2){
            System.out.println("请输入需要租赁的座数：");
            int seating=s.nextInt();
            return new Bus("宇通", "沪A66666", seating);
        }
        else {
            System.out.println("对不起，车种选择错误");
            return null;
        }
    }
}
