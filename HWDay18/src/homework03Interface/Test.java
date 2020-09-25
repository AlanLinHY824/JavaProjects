package homework03Interface;

import java.util.Scanner;

/**
 * @AlanLin 2020/6/20
 */
public class Test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Student s=new Student("张三", "001");
        System.out.println("请选择要演奏的乐器：");
        System.out.println("1、钢琴  2、小提琴  3、萨克斯");
        int choice=input.nextInt();
        Instrument instrument=playInstrument(choice);
        if (instrument!=null){
            s.play(instrument);
        }
    }

    public static Instrument playInstrument(int choice) {
        switch (choice){
            case 1:
                return new Piano();
            case 2:
                return new Violin();
            case 3:
                return new Sachs();
            default:
                System.out.println("对不起，乐器输入错误");
                return null;
        }

    }
}
