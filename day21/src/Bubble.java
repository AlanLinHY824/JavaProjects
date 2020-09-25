/**
 * @AlanLin 2020/6/24
 */
public class Bubble {
    public static void main(String[] args) {
        int arr[]={9,5,8,2,8,8,7,1};
        int num=0;
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[j]>arr[j+1]){
                    num=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=num;
                }
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
}
