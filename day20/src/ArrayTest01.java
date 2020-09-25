/**
 * @AlanLin 2020/6/23
 */
public class ArrayTest01 {
    public static void main(String[] args) {
        int[] data=getIntArray(10);
        printArray(data);
    }

    public static void printArray(int[] data) {
        for (int x:data) {
            System.out.print(x+"\t");
        }
    }

    public static int[] getIntArray(int capacity) {
        int[] data=new int[capacity];
        for (int i = 0; i <data.length ; i++) {
            data[i]=(int)(Math.random()*100);
        }
        return data;
    }


}
