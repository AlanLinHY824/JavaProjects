package homework02;

/**
 * @AlanLin 2020/6/28
 */
public class Test01 {
    public static void main(String[] args) {
        String  s = reverse( "abcd" );
        System.out.println(s);
    }

    //StringBuilder的reverse方法
    //遍历字符串的字符,反向连接为新的字符串

    private static String reverse(String str1) {
        char[] chars=str1.toCharArray();
        char temp='\u0000';
        for (int i = 0; i <chars.length/2 ; i++) {
            temp=chars[i];
            chars[i]=chars[chars.length-1-i];
            chars[chars.length-1-i]=temp;
        }
        return new String(chars);
    }
}
