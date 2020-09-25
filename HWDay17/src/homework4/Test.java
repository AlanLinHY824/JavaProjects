package homework4;

import java.util.Scanner;

/**
 * @AlanLin 2020/6/19
 */
public class Test {
    public static void main(String[] args) {
        Student s=new Student("张三", "001");
        Scanner input=new Scanner(System.in);
        System.out.println("请选择要演奏的乐器：");
        System.out.println("1、钢琴；  2、小提琴；  3、萨克斯");
        int choice=input.nextInt();
        Instrument instrument = getInstrument(choice);
        if (instrument!=null){
            s.play(instrument);
        }
    }

    public static Instrument getInstrument(int choice) {
        switch (choice){
            case 1:
                return new Piano();
            case 2:
                return new Violin();
            case 3:
                return new Sachs();
            default:
                System.out.println("对不起，没有您选择的乐器");
                return null;
        }
    }
}
