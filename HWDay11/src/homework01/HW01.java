package homework01;

import java.util.Scanner;

/**
 *1.输入某个学生的信息(姓名、年龄、性别、住址、身高、体重),并输出所有信息
 * @author Alan Lin
 */
public class HW01 {
    public static void main(String[] args) {
        info();
    }

    public static void info(){
        Scanner input=new Scanner(System.in);
        System.out.println("请输入姓名");
        String name=input.next();
        System.out.println("请输入年龄");
        int age=input.nextInt();
        System.out.println("请输入性别");
        String gender=input.next();
        System.out.println("请输入住址");
        String add=input.next();
        System.out.println("请输入身高");
        double height=input.nextDouble();
        System.out.println("请输入体重");
        double weight=input.nextDouble();

        System.out.println("该学生的信息为：");
        System.out.print("姓名："+name+"\t");
        System.out.print("年龄："+age+"\t");
        System.out.print("性别："+gender+"\t");
        System.out.print("住址："+add+"\t");
        System.out.print("身高："+height+"\t");
        System.out.print("体重："+weight+"\t");



    }
}
