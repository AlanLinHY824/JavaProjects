package homework02;

import java.util.Scanner;

/**
 * @AlanLin 2020/6/20
 */
public class Test {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请选择要参观的动物");
        System.out.println("1、狮子  2、老虎  3、鸟类");
        int choice=s.nextInt();
        visitAnimals(choice);

    }

    public static void visitAnimals(int choice) {
        Animals animals=null;
        switch (choice){
            case 1:
                animals=new Lion();
                break;
            case 2:
                animals=new Tiger();
                break;
            case 3:
                animals=new Birds();
                break;
            default:
                System.out.println("对不起，序号选择错误");
                return;
        }
        animals.voice();
    }
}
