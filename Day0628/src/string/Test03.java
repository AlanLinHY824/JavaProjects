package src.string;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * String字符串与正则表达式相关的操作.
 *  正则表达式就是一个模式串, 用于验证字符串是否匹配指定的模式,如验证用户密码是否包含字母与数字, 验证用户输入的邮箱是否符合格式 , 验证手机号等...
 *      正则表达式中常用的格式
 *          [abc]   表示匹配a,b,c中的一个
 *          \d      数字
 *          \w      英文单词字符[a-zA-Z0-9_]
 *          X{n}    匹配X正好n次
 *          X{n,m}    匹配X至少n次,最多m次
 *
 */
public class Test03 {
    public static void main(String[] args) {

        //验证用户输入邮箱是否符合格式, 先定义正则表达式
        String pattern = "\\w{5,30}@\\w{2,20}\\.(com|cn)";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入邮箱");
        String email = sc.next();
        System.out.println( email.matches(pattern));

        String text = "lisongzhe123456lianghuiqi";
        String newText = text.replaceAll("\\d", "*");
        System.out.println( newText );
        //split()拆分 字符串
        text = "Good good study,day day up";
        //需求把text字符串中的每个单词拆分出来, 发现text字符串中单词之间使用空格或者逗号分隔的, 就可以使用空格或者逗号对字符串拆分
        String[] split = text.split("[ ,]");
        for (String s : split) {
            System.out.println(s);
        }
    }
}
