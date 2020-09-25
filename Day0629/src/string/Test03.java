package string;

/**
 *有一个表示学生信息的字符串, “1001,lisi,90;2002,wangwu,80;3003,chenqi,60;4004,zhaoliu,70;5005,feifei,40”
 * 要求根据学生信息字符串创建Student对象, 存储到数组中
 */
public class Test03 {
    public static void main(String[] args) {
        String text = "1001,lisi,90;2002,wangwu,80;3003,chenqi,60;4004,zhaoliu,70;5005,feifei,40";

        //定义存储Student对象的数组
        Student [] data = new Student[20];  //长度需要估算
        int size = 0 ;  //定义变量记录数组中元素的数量

        //学生信息之间使用分号分隔的, 可以使用分号对字符串拆分
        String[] split = text.split(";");
        for (String sutInfo : split) {
//            System.out.println(sutInfo);    //1001,lisi,90, 某个学生学号,姓名,成绩之间使用逗号分隔, 可以继续使用逗号对stuInfo字符串拆分
            String[] strings = sutInfo.split(",");
           /* for (int i = 0; i < strings.length; i++) {
                System.out.print( strings[i] + "  ");
            }*/
           // 根据strings数组中的三个数据创建Student对象
            Student stu = new Student(strings[0], strings[1], Integer.parseInt(strings[2] ));
            data[size++] = stu;     //把Student对象保存到数组中
        }

        //遍历data数组
        for (int i = 0; i < size; i++) {
            System.out.println( data[i]);
        }
    }

    static class Student{
        String stuId;
        String name;
        int score;

        public Student(String stuId, String name, int score) {
            this.stuId = stuId;
            this.name = name;
            this.score = score;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "stuId='" + stuId + '\'' +
                    ", name='" + name + '\'' +
                    ", score=" + score +
                    '}';
        }
    }
}

