package homework2;

/**
 * @AlanLin 2020/6/12
 */
public class HW05 {
    public static void main(String[] args) {
        min(1,2);
        System.out.println(min(1, 2));
    }

    public static double min(int a,int b){
        if (a>b){
            return b;
        }
        return a;
    }
    public static double min(int a,double b){
        if (a>b){
            return b;
        }
        return a;
    }
    public static double min(double a,int b){
        if (a>b){
            return b;
        }
        return a;
    }
    public static double min(double a,double b){
        if (a>b){
            return b;
        }
        return a;
    }
}
