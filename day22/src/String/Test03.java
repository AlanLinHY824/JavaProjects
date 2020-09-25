package String;

import java.util.Arrays;
import java.util.Scanner;

/**
 * String和正则表达式相关的操作
 * 正则表达式是一个模式串，用于验证字符串是否匹配制定的格式，如：验证用户密码是否包含字母与数字
 * 验证用户输入的邮箱是否符合格式。。。现在正则表达式用的不多了，因为HTML5有专门的用户名密码、电话框，可以直接用
 * 正则表达式中常用的格式
 *      [abc] 表示匹配a，b，c中的一个
 *      \d  数字
 *      \w  英文字符（包含小写字母，大写字母，括号下划线）
 *      X{n}  匹配X正好n次
 *      X{n,m}  匹配X至少m次，至多m次
 * @AlanLin 2020/6/28
 */
public class Test03 {
    public static void main(String[] args) {

        //验证用户输入邮箱是否符合格式，先定义正则表达式
        String pattern="\\w{5,20}@\\w{2,20}\\.(com|cn)";
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入邮箱");
        String email=sc.next();
        System.out.println(email.matches(pattern));

        //split
        String text="Good good study,day day up";
        String[] split=text.split("[ ,]");
        System.out.println(Arrays.toString(split));

    }
}
