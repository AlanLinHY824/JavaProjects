package homework04;

import java.util.Scanner;

/**
 * @AlanLin 2020/6/20
 */
public class Test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Employee s=new Employee();
        System.out.println("请选择乘坐的交通工具：");
        System.out.println("1、地铁  2、小轿车  3、自行车");
        int choice=input.nextInt();
        TrafficTool trafficTool=getTrafficTool(choice);
        if (trafficTool!=null){
            s.goHome(trafficTool);
        }

    }

    private static TrafficTool getTrafficTool(int choice) {
        switch (choice){
            case 1:
                return new Tube();
            case 2:
                return new Car();
            case 3:
                return new Bicycle();
            default:
                System.out.println("输入交通工具有误");
                return null;
        }
    }
}
