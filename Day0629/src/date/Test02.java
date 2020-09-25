package date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * java.time.LocalDateTim类是线程安全的日期类
 */
public class Test02 {
    public static void main(String[] args) {
        //获得当前日期,LocalDateTime类的构造方法是私有的, LocalDateTime类有静态方法now()返回当前日期
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println( localDateTime );    //2020-06-29T10:19:39.023832100

        LocalDateTime localDateTime2 = LocalDateTime.of(2068, 5, 8, 6, 28, 59);
        System.out.println( localDateTime2 );   //2068-05-08T06:28:59

        //使用DateTimeFormatter可以对日期格式化
        DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //调用LocalDateTime实例方法format可以把日期转换为指定格式的字符串
        String ss = localDateTime.format(dtf);
        System.out.println(ss);         //2020-06-29 10:22:38

        //使用DateTimeFormatter把字符串转换日期对象
        String text = "2022年10月1日 5:25:30";
        //根据字符串创建DateTimeFormatter对象
        DateTimeFormatter another = DateTimeFormatter.ofPattern("yyyy年MM月d日 H:mm:ss");
        //调LocalDateTime静态方法parse可以把字符串转换为日期对象
        LocalDateTime dateTime = LocalDateTime.parse(text, another);
        System.out.println( dateTime );
    }
}
