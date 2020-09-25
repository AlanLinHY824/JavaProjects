package angrybirdsExtends;

import java.util.Scanner;

/**
 * @AlanLin 2020/6/22
 */
public class Test {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Slingshot slingshot=new Slingshot();
        System.out.println("请选择要弹射的小鸟：");
        System.out.println("1、黄风小鸟  2、蓝冰小鸟  3、红火小鸟");
        int choice=s.nextInt();
        Birds bird = getBird(choice);
        if (bird!=null){
            slingshot.shot(bird);
        }
    }

    public static Birds getBird(int choice) {
        if (choice==1){
            return new YellowBird();
        }
        else if (choice==2){
            return new BlueBird();
        }
        else if (choice==3){
            return new RedBird();
        }
        else {
            System.out.println("对不起，没有您选择的小鸟");
            return null;
        }
    }
}
