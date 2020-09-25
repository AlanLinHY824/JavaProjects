package exam;

import java.util.Scanner;

/**
 2.设计一个出租车计价器程序，计价规则：

 1).起步价10元，3公里
 2).3公里之后，行程在10公里以内部分（包含10公里），2元每公里。行程超过10公里的部分，2.5元每公里
 3).无论行程多少均收取1元燃油附加税
 * @AlanLin 2020/7/6
 */
public class Test02 {
    public static void main(String[] args) {
        System.out.println("出租车的价钱为"+getTaxiPrice());
    }

    public static double getTaxiPrice() {
        System.out.println("请输入里程数：");
        Scanner sc=new Scanner(System.in);
        double miles=sc.nextDouble();
        if (miles<0){
            System.out.println("对不起，输入有误，请重新输入");
            return 0;
        }
        else if (miles<=3){
            return 11;
        }
        else if (miles<=10){
            return (miles-3)*2+11;
        }
        else {
            return (miles-10)*2.5+7*2+11;
        }
    }
}
