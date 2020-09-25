package String;

/**
 * @AlanLin 2020/6/28
 */
public class Test07 {
    public static void main(String[] args) {
        String a="ab";
        String b="cd";
        String str0="abcd";
        String str1=a+b;
        String str2=a+b;
        String str3="ab"+b;
        String str4="ab"+"cd";
        String str5="ab"+"cd";

        System.out.println(str0==str1);//false
        System.out.println(str1==str2);//false
        System.out.println(str1==str3);//false
        System.out.println(str1==str4);//false
        System.out.println(str2==str3);//false
        System.out.println(str2==str4);//false
        System.out.println(str3==str4);//false
        System.out.println(str4==str5);//true


    }
}
