/**
 * @AlanLin 2020/6/23
 */
public class ArrayTest02 {
    public static void main(String[] args) {
        //调用时可以传递任意多个数据，也可以传递数组
        sum(1,2,3);
        sum(1,2,3,4,5);
        int[] arr1=new int[]{11,22,33,44};
        sum(arr1);


    }

    public static void sum(int...num){
        //在方法体中，变长参数可以当做数组来用
        for (int i = 0; i <num.length ; i++) {
            System.out.println(num[i]);
        }
    }

}
