package src.string;

import java.io.UnsupportedEncodingException;
import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

/**
 * String的常用方法
 */
public class Test02 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String txt = "hello动力节点";

        /*1)
                charAt(index) 返回指定位置的字符
                length()    返回字符串中字符的数量
            String字符串底层是char[]value字符数组
         */
        for (int i = 0; i < txt.length() ; i++) {
            System.out.println( txt.charAt(i) );
        }

        /*2)
            compareTo(String anotherString) 比较当前字符串与参数字符串的大小,如果当前字符串大返回正数,参数字符串大返回负数,相等返回0.
            Java把当前对象与另外一个对象比较大小的功能抽象到Comparable接口中, 查看Comparable接口源码:
            public interface Comparable<T> {
                public int compareTo(T o);
            }
            String类实现了Comparable接口, 重写了接口的抽象方法compareTo(), String对象就具有比较大小的功能, 即字符串再想要比较大小时,调用compareTo()方法即可
            另外: Comparable接口后面的<T>是泛型 , 泛型就是把数据类型作为参数传递, String类实现Comparable接口时给T泛型传递了String类型, String重写compareTo方法时参数T就是String类型. 即一个类实现Comparable接口时,一般给T泛型传递一个相同的类型
            compareToIgnoreCase(String str) 忽略大小写后再比较字符串大小
         */
        System.out.println("hehe".compareTo("hello"));      //-4, 负数表示参数字符串大
        System.out.println("hello".compareTo("hello"));     //0
        System.out.println("hello".compareTo("Hello"));     //32, 正数表示第一个字符串大
        System.out.println("hello".compareToIgnoreCase("Hello"));   //0, 忽略大小写
        //compareTo()比较的字符 的码值
        System.out.println( "张三".compareTo("李四"));  //-2094 负数表示第二个字符串大
        //如果想根据汉字拼音顺序比较大小, 需要先获得一个汉字的比较器
        Collator collator = Collator.getInstance(Locale.CHINESE);
        //调用汉字比较器的方法比较中文
        System.out.println( collator.compare("张三", "李四"));  //1 , 正数表示第一个字符串比第二个字符串大

        /*
            concat(String str) 把当前字符串与参数字符串连接,返回一个新的字符串.
            contains(CharSequence s) 判断当前字符串是否包含参数字符串s
            startsWith(String prefix) 判断当前字符串是否以prefix开始.
            endsWith(String suffix) 判断当前字符串是否以suffix结尾.
            equals(Object anObject) 判断当前字符串与参数字符串中的字符是否都一样
            equalsIgnoreCase(String anotherString) 忽略字符串大小写再比较是否一样
         */
        String s = txt.concat("Good");
        System.out.println( s );        //hello动力节点Good
        System.out.println( txt );      //hello动力节点
        System.out.println( txt.contains("hello"));     //true
        System.out.println( txt.startsWith("hello"));   //true
        System.out.println( txt.endsWith("hello"));     //false
        System.out.println( txt.equalsIgnoreCase("Hello动力节点"));

        /*3
            getBytes() 返回字符串在当前默认编码下对应的字节数组
            getBytes(String charsetName) 返回字符串在指定的charsetName编码下对应的字节数组.
            计算机中CPU,内存,硬盘上所有的数据都是01二进制, 文本编辑器可以把这一串01转换为字符串,也可以把字符串转换为01二进制形式,  程序员也可以进行转换, 调用字符串的getBytes()方法可以把字符串转换为默认编码下的字节数组
         */
        byte[] bytes = txt.getBytes();  //把txt字符串所有的字符以当前默认的编码UTF8转换为01序列
        System.out.println(Arrays.toString(bytes));     //UTF8编码中一个英文占1字节,一个汉字占3字节
        //[104, 101, 108, 108, 111, -27, -118, -88, -27, -118, -101, -24, -118, -126, -25, -126, -71]
        //把字节数组转换为字符串
        s = new String(bytes);
        System.out.println( s );

        //把字符串转换为指定编码下对应的字节数组, 调用getBytes(String charsetname)方法, 系统会显示语法错误Unhandled Exception未处理的异常, 按Alt + Enter 选择Add exception to method signature抛出处理 , 后面再讲异常
        byte[] gbks = txt.getBytes("GBK");  //在GBK编码中,  一个英文占1字节,一个汉字占2字节
        System.out.println( Arrays.toString(gbks ));
        //[104, 101, 108, 108, 111, -74, -81, -63, -90, -67, -38, -75, -29]
        //把gbks字节数组中的字节再以GBK编码转换为字符串
        s = new String(gbks, "GBK");
        System.out.println( s );

        /*4
            indexOf(int ch) 返回字符ch在当前字符串中第一次出现的索引值
            indexOf(String str) 返回字符串str在当前字符串中第一次出现的索引值
            lastIndexOf(int ch) 返回字符ch在当前字符串中最后一次出现的索引值
            lastIndexOf(String str) 返回字符串str在当前字符串中最后一次出现的索引值
            substring(int beginIndex)返回当前字符串从beginIndex开始的子串.
            substring(int beginIndex, int endIndex) 返回[beginIndex, endIndex)范围内的子串.
         */
        String  path = "D:\\20200622\\JavaSE\\Day0625\\src\\string\\Test02.java";
        //需求: 把文件路径中的文件夹, 文件名, 扩展名分别取出来.
        //需要确定反斜杠\\在path字符串中最后一次出现的索引值, 确定小点.在path字符串中的索引值
        int slash = path.lastIndexOf("\\");
        int dot = path.indexOf(".");
        String folder = path.substring(0, slash);   //返回[0,slash)范围内的子串
        String filename = path.substring(slash + 1, dot);
        String suffix = path.substring(dot + 1 );
        System.out.println( folder );
        System.out.println( filename );
        System.out.println( suffix );

        /*5
            toCharArray() 把字符串转换为字符数组.
         */
        char[] chars = txt.toCharArray();
        System.out.println( Arrays.toString(chars));    //[h, e, l, l, o, 动, 力, 节, 点]
        //把字符数组转换 为字符串
        s = new String(chars);
        System.out.println( s );
        s = String.valueOf(chars);
        System.out.println( s );

        /*
            toLowerCase() 把字符串中的大写字母转换为小写字母,返回新串.
            toUpperCase() 把小写转换为大写.
            trim() 去掉字符串前后的空白符,返回新串
         */
        s = "        hello   world       ";
        System.out.println( "**" + s.trim() + "**");
        System.out.println( "**" + s + "**");
        s = "Good Good Study";
        System.out.println( s.toUpperCase());
        System.out.println( s.toLowerCase());
        System.out.println( s );

        /*6
            valueOf(int d) 把其他类型的数据转换为字符串
         */
        int num = 369;
        chars=new char[]{97,98,'a'};
        s = String.valueOf(gbks);    //把int整数转换为字符串
        System.out.println(chars);
        s = "258";
        num = Integer.parseInt(s);  //把字符串转换为为int整数

    }
}
