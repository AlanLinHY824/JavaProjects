package demo8;

/**
 * @AlanLin 2020/6/20
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(mul(5));
        

    }

    public static int mul(int i){
        if (i==0||i==1){
            return 1;
        }
        else {
        return i*mul(i-1);
        }
    }

}
