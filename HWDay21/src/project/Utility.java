package project;

import java.util.Scanner;

/**
 * @AlanLin 2020/6/27
 */
public class Utility {
    public static void main(String[] args) {
        int key=menuSelect();

    }


    public static int menuSelect() {
        Scanner s=new Scanner(System.in);
        char selection=(char)s.nextInt();
        return selection;
    }

}
