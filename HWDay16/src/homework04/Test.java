package homework04;

import java.util.Scanner;

/**
 * @AlanLin 2020/6/18
 */
public class Test {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请选择要参观的动物：");
        System.out.println("1、狮子  2、老虎  3、大象  4、猴子");
        int choice=s.nextInt();
        visitAnimal(choice);
    }

    public static void visitAnimal(int choice) {
        if (choice==1){
            showAnimal(new Lion("奥列格", 10));
        }
        else if (choice==2){
            showAnimal(new Tiger("大花猫", 5));
        }
        else if (choice==3){
            showAnimal(new Elephant("小象", 6));
        }
        else if (choice==4){
            showAnimal(new Monkey("小圣", 10));
        }
        else {
            System.out.println("序号输入错误");
        }
    }

    private static void showAnimal(Animals animals) {
        animals.show();
        animals.voice();
    }
}
