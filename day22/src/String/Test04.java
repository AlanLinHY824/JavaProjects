package String;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @AlanLin 2020/6/28
 */
public class Test04 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // byte[] getBytes()
        //计算机中CPU、内存、硬盘上所有的数据都是二进制存储的，文本编辑器可以把这一串二进制转换为字符串，也可以把字符串转换为二进制形式，程序员也可以进行转换
        //调用字符串的getbytes()方法可以把字符串转换为默认编码下的字节数组
        String txt="hello动力节点";
        byte[] bytes=txt.getBytes();
        System.out.println(Arrays.toString(bytes));//在UTF-8编码下，一个英文占一个字节，一个汉字占三个字节
        //把字符串转换为制定编码下对应的字节数组，调用这个方法，系统会显示语法错误，要对异常做抛出处理
        byte[] gbks=txt.getBytes("unicode");
        System.out.println(new String(gbks,"UTF-8").equals(txt));
        //GBK编码中一个英文占1个字节，一个汉字占2个字节
        System.out.println(Arrays.toString(gbks));
        String s=new String(gbks, "GBK");

    }
}
