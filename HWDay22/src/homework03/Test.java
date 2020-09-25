package homework03;

/**
 * 有一个表示学生信息的字符串, “1001,lisi,90;2002,wangwu,80;3003,chenqi,60;4004,zhaoliu,70;5005,feifei,40”
 * 要求根据学生信息字符串创建Student对象, 存储到数组中
 * @AlanLin 2020/6/28
 */
public class Test {
    public static void main(String[] args) {
        String text="1001,lisi,90;2002,wangwu,80;3003,chenqi,60;4004,zhaoliu,70;5005,feifei,40";
        String[] split=text.split("[;]");
        Student[] student=new Student[split.length];
        for (int i = 0; i <student.length ; i++) {
            student[i]=new Student(split[i].split(",")[0], split[i].split(",")[1], Integer.parseInt(split[i].split(",")[2]));
            System.out.println(student[i]);
        }
    }
}
