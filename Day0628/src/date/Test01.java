package src.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date
 */
public class Test01 {
    public static void main(String[] args) throws ParseException {
        //1) 创建Date对象获得当前日期
        Date date = new Date();
        System.out.println( date );     //Sun Jun 28 14:42:23 CST 2020,  CST表示中国标准时间

        //2) 调用Sytem.currentTimeMillis()方法,可以返回当前日期距离1970-1-1 00:00:00 经过的毫秒数
        long timeMillis = System.currentTimeMillis();
        System.out.println( timeMillis );   //1593326656083

        //3) 调用Date( 毫秒数) 创建日期对象
        Date  date2 = new Date(timeMillis + 1000*60 * 10 );
        System.out.println( date2 );
        date2 = new Date(1000);
        System.out.println( date2 );    //Thu Jan 01 08:00:01 CST 1970
        //当前CST表示中国标准时间,距离世界协调时有8小时的时差

        //4) 把Date以指定的格式转换为字符串,
        //使用SimpleDateFormat对日期格式化, 通过构造方法指定格式串,常用格式符有: y年, M月, d日, H小时, m分钟, s秒
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //调用SimpleDateFormat对象的foramt(Date)可以把日期转换为字符串
        String ss = sdf.format(date);
        System.out.println( ss );   //2020-06-28 14:52:15

        //5) 把表示日期的字符串转换为Date对象
        String text = "2088年5月6日 7:28:58";
        //需要根据字符串的格式创建SimpleDateFormat对象
        SimpleDateFormat another = new SimpleDateFormat("yyyy年M月d日 H:mm:ss");
        //调用SimpleDateFormat对象的parse()方法可以把字符串转换为Date对象, parse(String)有异常需要处理, Alt + Enter选择Add Exception to method signature抛出处理, 如果运行后产生了异常,说明 格式串与字符串不匹配
        date2 = another.parse(text);
        System.out.println( date2 );
    }
}
