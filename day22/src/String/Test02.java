package String;

import java.io.UnsupportedEncodingException;
import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

/**
 * @AlanLin 2020/6/28
 */
public class Test02 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String txt="sdasda";
        //1.char charAt(int index)
        //2. int length()
        //String字符串底层是char[]字符数组
        for (int i = 0; i <txt.length() ; i++) {
            System.out.println(txt.charAt(i));
        }
        //txt.compareTo()
        //3. int compareTo(String anotherString)  按字典顺序比较两个字符串，如果当前字符串大返回正数，参数字符串大返回负数，相等返回0
        /*public interface Comparable<T> {
            public int compareTo(T o);
        }
        String实现了Comparable接口的方法，字符串就具有了比较大小的方法，即字符串在比较大小时，调用重写后的compareTo方法
        <T>是泛型，泛型就是把数据类型作为参数传递,String实现Comparable接口时，给T泛型传递了String类型，String重写compareTo时，参数T就是String类型
        一个类实现Comparable接口时，一般给T泛型传递一个相同的类型（指类中的方法）
        int compareToIgnoreCase(String str)
         */

        System.out.println("hehe".compareTo("hello"));//-4 负数表示参数的字符串较大（h-l=104-108=-4）
        System.out.println("hello".compareTo("hello"));//0
        System.out.println("hello".compareTo("Hello"));//32 正数表示第一个字符串较大（h-H=104-72=32）
        System.out.println("hell".compareTo("hello2312"));//-5 长度不一致时，若取长度最小值比较后全部相等，则返回字符串长度的差值
        System.out.println("hello".compareToIgnoreCase("Hello"));//0 忽略了大小写
        //compareTo()比较的是字符的码值
        System.out.println("张三".compareTo("李四"));
        //如果想根据汉字拼音顺序比较大小，需要先获得一个汉字的比较器
        Collator collator=Collator.getInstance(Locale.CHINESE);
        //调用汉字比较器的方法来比较中文
        System.out.println(collator.compare("张三", "李四"));//1 , 正数表示第一个字符串比第二个字符串大，并不能比较出大小的程度，只有1，-1,0返回

        //String concat(String str)
        //boolean contains(CharSequence s)
        //boolean endsWith(String suffix)
        //boolean equals(Object anObject)

        String s=txt.concat("Good");
        System.out.println(s);
        System.out.println(txt.contains("hello"));
        System.out.println(txt.endsWith("Good"));
        System.out.println(txt.startsWith("s"));

        // byte[] getBytes()
        //计算机中CPU、内存、硬盘上所有的数据都是二进制存储的，文本编辑器可以把这一串二进制转换为字符串，也可以把字符串转换为二进制形式，程序员也可以进行转换
        //调用字符串的getbytes()方法可以把字符串转换为默认编码下的字节数组
        txt="hello动力节点";
        byte[] bytes=txt.getBytes();
        System.out.println(Arrays.toString(bytes));//在UTF-8编码下，一个英文占一个字节，一个汉字占三个字节
        //把字符串转换为制定编码下对应的字节数组，调用这个方法，系统会显示语法错误，要对异常做抛出处理
        byte[] gbks=txt.getBytes("GBK");//GBK编码中一个英文占1个字节，一个汉字占2个字节
        s=new String(gbks, "GBK");
        //int indexOf(int ch)
        //int indexOf(String str)
        //int lastIndexOf(int ch)
        //int lastIndexOf(String str)
        //String substring(int beginIndex)
        //String substring(int beginIndex, int endIndex)
        String path="D:\\学习资料\\Java学习\\动力节点\\01-JavaSE\\day17\\作业.txt";
        //需求：把文件路径中的文件夹，文件名，扩展名分别取出来
        int slash=path.lastIndexOf("\\");
        int det=path.indexOf(".");
        String folder=path.substring(0, slash);//[0,slash)
        String filaname=path.substring(slash+1, det);
        String suffix=path.substring(det+1);
        System.out.println(folder);
        System.out.println(filaname);
        System.out.println(suffix);

        // char[] toCharArray()
        char[] chars=txt.toCharArray();
        System.out.println(Arrays.toString(chars));
        s=new String(chars);
        s=String.valueOf(chars);
        s=String.copyValueOf(chars);

        s="      hello    world    ";
        System.out.println(s.trim());//返回一个新的字符串，原来的字符串不变
        System.out.println(s);
        System.out.println(s.toUpperCase());//返回一个新的字符串，原来的字符串不变
        System.out.println(s.toLowerCase());//返回一个新的字符串，原来的字符串不变

        //valueOf(int d),把其他类型的数据转换为字符串

        int num=369;
        s=String.valueOf(num);
        System.out.println(s);
        s="258";
        num=Integer.parseInt(s);//把字符串转换为整数









    }
}
