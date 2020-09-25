package homework04;

/**
 * @AlanLin 2020/6/22
 */
public class Test {
    public static void main(String[] args) {
        char[] arr1=new char[100];
        int count=0;
        for (int i = 0; i <arr1.length ; i++) {
            arr1[i]= (char)('a'+Math.random()*26);
            System.out.print(arr1[i]+"\t");
            if ((i+1)%10==0){
                System.out.println();
            }
            if (arr1[i]=='a'){
                count+=1;
            }

        }
        System.out.println("小写字母a出现的次数为："+count);

    }
}
