package exam;

/**
 * 1.计算并输出1到100之间所有的偶数的和
 * @AlanLin 2020/7/6
 */
public class Test01 {
    public static void main(String[] args) {
        int result=0;
        //1到100之间，理解为[1,100)
        for (int i = 2; i <100 ; i++) {
            if (i%2==0){
                result+=i;
            }
        }
        System.out.println("0到100之间所有偶数的和为："+result);
    }
}
