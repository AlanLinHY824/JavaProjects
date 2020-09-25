package homework03;

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
        int[] count=new int[26];
        //count[0]存储a的次数，count[1]存储b的次数,coount[2]存储c的次数......
        for (char cc:arr1) {
            count[cc-'a']++;
        }
        for (char i = 'a'; i <'z' ; i++) {
            System.out.println("小写字母"+i+"出现的次数为："+count[i-'a']);
        }
    }
}
