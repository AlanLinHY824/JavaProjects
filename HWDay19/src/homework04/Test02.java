package homework04;

/**
 * @AlanLin 2020/6/23
 */
public class Test02 {
    public static void main(String[] args) {
        char[] arr1=new char[100];
        System.out.println("生成的随机字母表如下：");
        for (int i = 0; i <arr1.length ; i++) {
            arr1[i]= (char)('a'+Math.random()*26);
            System.out.print(arr1[i]+"\t");
            if ((i+1)%10==0){
                System.out.println();
            }
        }
        for (char i = 'a'; i <='z' ; i++) {
            int count=0;
            for (int j = 0; j <arr1.length; j++) {
                if (arr1[j]==i){
                    count+=1;
                }
            }
            System.out.println("小写字母"+i+"出现的次数为："+count);
        }
    }
}
