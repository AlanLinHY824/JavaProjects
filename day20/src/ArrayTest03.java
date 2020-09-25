/**
 * @AlanLin 2020/6/23
 */
public class ArrayTest03 {
    public static void main(String[] args) {
        int[] data={12,34,45,56,78,89,52};

        int[] bigger=new int[data.length*2];

//        for (int i = 0; i <data.length ; i++) {
//            bigger[i]=data[i];
//        }
//
//        data=bigger;

        System.arraycopy(data, 0, bigger, 0, data.length);

        data=bigger;

        ArrayTest01.printArray(data);


    }
}
