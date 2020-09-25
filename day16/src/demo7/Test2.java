package demo7;

/**
 * @AlanLin 2020/6/18
 */
public class Test2 {
    public static void main(String[] args) {
        Person p=new Student();
        //System.out.println(p.stuId);//出现编译错误，只能访问到父类的实例变量
        //当构成多态时，想要访问子类的实例变量和独有的方法时，必须进行向下类型转换，也叫作强制类型转换
        ((Student)p).study();

        /*
            当进行向下类型转换时，可能会存在类型转换异常，属于运行时异常
            原因：当前对象名p中存储的是学生类型的对象，只能转换为学生类，如果非要转换为其他类型的子类则出现类型转换异常
            解决办法：建议在进行向下转型时，先进行判断，如果合法则再进行向下转型，需要使用instanceof关键字完成
         */
        if (p instanceof Teacher){
            Teacher tea=(Teacher)p;
        }
        else {
            System.out.println("p不能转换为Teacher类");
        }




    }
}
