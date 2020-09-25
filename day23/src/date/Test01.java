package date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 开发多线程程序时，需要使用java.time包中的方法
 * @AlanLin 2020/6/29
 */
public class Test01 {
    public static void main(String[] args) {
        //获得当前日期，构造方法是私有的，有静态方法now()返回当前日期
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDateTime localDateTime1=LocalDateTime.of(2068, 5, 8, 6, 28);
        System.out.println(localDateTime1);

        //使用DateTimeFormater对日期进行格式化
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        //LocalDateTime类的实例方法进行格式转换
        String ss=localDateTime.format(dtf);
        System.out.println(ss);

        //使用DateTimeFormater把字符串转换为日期对象
        String text="2022年10月1日 5:29:30";
        //根据字符串创建DateTimeFormatter对象
        DateTimeFormatter another=DateTimeFormatter.ofPattern("yyyy年MM月d日 H:mm:ss");
        //将字符串转换为日期对象
        LocalDateTime dateTime=LocalDateTime.parse(text, another);



    }
}
