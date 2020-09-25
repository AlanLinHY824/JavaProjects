package Day0623.src.array;

/**
 * 变长参数
 */
public class Test02 {
    public static void main(String[] args) {
        //在调用方法时,可以传递任意个数据
        sum();
        sum(1);
        sum(1,2,3,4,5);
        sum(1,2,3,4,5,6,7,8,9,10);

        int [] array = {10,20,30};
        sum(array);
    }

    //定义方法,可以计算任意个整数的和, 定义变长参数来接收任意个整数
    public static void sum(  int ... num ){
        //在方法体中, 变长参数可以当作数组来使用
        int sum = 0 ;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println("sum=" + sum);
    }
}
