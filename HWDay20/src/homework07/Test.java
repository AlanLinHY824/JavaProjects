package homework07;

/**
 * 定义方法, 实现int[]数组元素的乱序
 * 乱序就是把数组中元素存储位置随机改变
 * @AlanLin 2020/6/23
 */
public class Test {
    public static void main(String[] args) {
        int[]arr1={12,45,85,62,15,35,72};
        disorder(arr1);
        for (int i = 0; i <arr1.length ; i++) {
            System.out.print(arr1[i]+"\t");
        }
    }

    private static void disorder(int[] arr1) {
        int num=0;
        for (int i = 0; i <arr1.length ; i++) {
            int a=(int)(Math.random()*arr1.length);
            if (a!=i){//其实当a==时也没关系，不用判断也可以
                num=arr1[i];
                arr1[i]=arr1[a];
                arr1[a]=num;
            }
        }
    }
}
