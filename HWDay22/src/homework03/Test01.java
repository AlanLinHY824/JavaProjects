package homework03;

/**
 * 有一个表示学生信息的字符串, “1001,lisi,90;2002,wangwu,80;3003,chenqi,60;4004,zhaoliu,70;5005,feifei,40”
 * 要求根据学生信息字符串创建Student对象, 存储到数组中
 * @AlanLin 2020/6/28
 */
public class Test01 {
    public static void main(String[] args) {
        String text="1001,lisi,90;2002,wangwu,80;3003,chenqi,60;4004,zhaoliu,70;5005,feifei,40";
        //使用逗号或分号进行拆分[]表示多选1
        String[] split=text.split("[,;]");
        Student[] student=new Student[20];
        int size=0;
        for (int i = 0; i <split.length ; i+=3) {
            student[size++]=new Student(split[i],split[i+1],Integer.parseInt(split[i+2]));

        }


    }
}
