package angrybirdsInterface;

import java.util.Scanner;

/**
 * @AlanLin 2020/6/22
 */
public class Test {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请选择要弹射的小鸟：");
        System.out.println("1、黄风小鸟  2、蓝冰小鸟  3、红火小鸟");
        int choice=s.nextInt();
        shot(choice);
    }

    public static void shot(int choice) {
        Slingshot slingshot=new Slingshot();
        Flyable bird = null;
        if (choice==1){
            bird =  new YellowBird();
        } else if (choice==2){
            bird =  new BlueBird();
        } else if (choice==3){
            bird =  new RedBird();
        } else {
            System.out.println("对不起，没有您选择的小鸟");
            return;
        }
        slingshot.shot(bird);
    }
}
