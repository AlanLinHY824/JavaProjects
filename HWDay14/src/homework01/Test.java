package homework01;

/**
 * 1.日期类：
 * 属性：年，月，日
 * 封装属性，要求：年份在0以上，月份为12个月，日不能超过31天
 * 测试类：创建对象，通过调用set方法对属性赋值，通过调用get方法完成对属性值的输出
 * @AlanLin 2020/6/16
 */
public class Test {
    public static void main(String[] args) {
        MyDate date=new MyDate();
        date.setYear(2020);
        date.setMonth(6);
        date.setDay(16);
        System.out.println(date.getYear()+"年"+date.getMonth()+"月"+date.getDay()+"日");
    }
}
