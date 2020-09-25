package src.date;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @AlanLin 2020/6/29
 */
public class Test02 {
    public static void main(String[] args) throws ParseException {
        Date date=new Date();
        System.out.println(date);

        long timeMillis=System.currentTimeMillis();
        System.out.println(timeMillis);//距离格林威治时间1970 00:00:00的毫秒数

        Date date1=new Date(timeMillis);
        System.out.println(date1);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String ss=sdf.format(date);
        System.out.println(ss);

        ss="2020年6月1日";
        sdf=new SimpleDateFormat("yyyy年M月dd日");
        ParsePosition pos = new ParsePosition(8);
        System.out.println(sdf.parse(ss));

    }
}
