package string;

/**
 * 定义方法实现字符串逆序
 *  编写程序实现一句话中每个单词的逆序
 *      Good good study --> dooG doog yduts
 */
public class Test02 {
    public static void main(String[] args) {
        String str = reverse("abcd");
        System.out.println( str );      //dcba
    }

    private static String reverse(String text) {
        //可以根据 String创建StringBuilder
        StringBuilder sb = new StringBuilder(text);
        //调用StringBuilder对象的reverse()方法实现逆序
        sb.reverse();
        return sb.toString();
    }

    private static String reverse3(String text) {
        //从后向前遍历text字符串的每个字符, 进行连接
       StringBuilder sb = new StringBuilder();
        for(int i = text.length() - 1; i >= 0 ; i-- ){
            sb.append( text.charAt(i) );
        }

        return sb.toString();
    }
    private static String reverse2(String text) {
        //从后向前遍历text字符串的每个字符, 进行连接
        String tmp = "";    //保存连接后的字符串
        for(int i = text.length() - 1; i >= 0 ; i-- ){
            tmp += text.charAt(i);
        }

        return tmp;
    }

    private static String reverse1(String text) {    //text="abcd"
        //把字符串转换为字符数组
        char[] chars = text.toCharArray();
        //把数组逆序
        for (int i = 0; i < chars.length / 2; i++) {
            char cc = chars[i];
            chars[i] = chars[chars.length-1-i];
            chars[chars.length-1-i] = cc;
        }
        //再根据 数组创建字符串
        String tmp = String.valueOf(chars);
        return tmp;
    }
}
