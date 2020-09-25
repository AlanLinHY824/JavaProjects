package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @AlanLin 2020/6/28
 */
public class Test01 {
    public static void main(String[] args) throws ParseException {
        //无参构造
        Date date=new Date();
        System.out.println(date);

        //System.currentTimeMillis()方法返回 当前日期距离1970-1-1 00:00：00（Unix操作系统的基准时间）经过的毫秒数
        long timeMillis=System.currentTimeMillis();
        System.out.println(timeMillis);

        //调用Date(毫秒数)创建日期对象

        Date date1=new Date(timeMillis+1000*60*10);
        System.out.println(date1);

        System.out.println(new Date(1000));//Thu Jan 01 08:00:01 GMT+08:00 1970
        //当前CST表示中国标准时间，与世界协调时有8小时的时差

        //把Date以指定的格式转换为字符串
        //使用SimpleDateFormat对日期进行格式化，通过构造方法指定格式串，常用格式符有：y年，M月，d日，H小时，m分钟，s秒
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //用format方法转换为指定格式的字符串
        String ss=simpleDateFormat.format(date);
        System.out.println(ss);

        //把表示日期的字符串转换为Date对象
        String text="2008年5月6日 7:28:58";
        //根据字符串格式创建simpleDateFormat对象
        SimpleDateFormat another=new SimpleDateFormat("yyyy年M月d日 H:mm:ss");
        //使用SimpleDateFormat对象的parse方法把字符串转换为Date对象，有异常需要处理进行抛出
        date1=another.parse(text);
        System.out.println(date1);

    }
}
