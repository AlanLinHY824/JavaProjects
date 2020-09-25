package homework01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @AlanLin 2020/6/28
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入身份证号码：");
        String id=sc.next();
        //验证输入身份证的格式是否正确，使用正则表达式
        String pattern="[1-9]\\d{16}[0-9X]";
        

        //截取字符串
        String str1=id.substring(6, 14);
        String str2=id.substring(17, 18);
        //将字符串转换为日期格式
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMdd");
        Date date=simpleDateFormat.parse(str1);
        //将日期转换为想要显示的格式
        simpleDateFormat=new SimpleDateFormat("yyyy年M月d日");
        String birthDate=simpleDateFormat.format(date);
        //输出结果
        System.out.println(birthDate);
        System.out.println(Integer.valueOf(str2)%2==1?"性别为男":"性别为女");
    }
}
