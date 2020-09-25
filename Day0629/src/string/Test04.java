package string;

/**
 *有一个表示学生信息的字符串, “1001,lisi,90;2002,wangwu,80;3003,chenqi,60;4004,zhaoliu,70;5005,feifei,40”
 * 要求根据学生信息字符串创建Student对象, 存储到数组中
 */
public class Test04 {
    public static void main(String[] args) {
        String text = "1001,lisi,90;2002,wangwu,80;3003,chenqi,60;4004,zhaoliu,70;5005,feifei,40";

        //定义存储Student对象的数组
        Student [] data = new Student[20];  //长度需要估算
        int size = 0 ;  //定义变量记录数组中元素的数量

        //学号,姓名,成绩之间使用逗号或者分号分隔的, 可以使用逗号或者分号对字符串拆分
        String[] split = text.split("[,;]");        //方括弧表示多选一
        //在split数组中,每三个元素是一个学生的信息
        //split[0]是学号, split[1]是姓名, split[2]是成绩
        //split[3]是学号, split[4]是姓名, split[5]是成绩
        //split[6]是学号, split[7]是姓名, split[8]是成绩
        //可以每次从split数组中取三个元素,步长需要设置为3
        for (int i = 0; i < split.length; i+=3 ) {
            //split[i]是学号, split[i+1]是姓名, split[i+2]是成绩, 根据这三个数组元素创建Student对象
            Student stu = new Student(split[i], split[i+1],  Integer.parseInt(split[i+2]));
            data[size++] = stu;
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

