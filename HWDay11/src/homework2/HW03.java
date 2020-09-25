package homework2;

import java.util.Scanner;

/**
 * 3.判断一个年龄是老年、中年、青年还是少年
 * @AlanLin 2020/6/12
 */
public class HW03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入需要判断的年龄：");
        int age=input.nextInt();
        isStage(age);

    }

    public static String isStage(int age){
        if (age<=20&&age>=0){
            return "少年";
        }
        else if (age<=40&&age>=20){
            return "青年";
        }
        else if (age<=60&&age>=40){
            return "中年";
        }
        else if (age>=60){
            return "老年";
        }
        else {
            return "年龄输入错误";
        }
    }

}
