package src.wrapper;

/**
 * 装箱与拆箱
 */
public class Test04 {
    public static void main(String[] args) {
        //自动装箱
        Integer i1 = 456;   //系统会根据整数456创建一个Integer对象,把该对象的引用赋值给i1
        //自动拆箱
        int num = i1;   //系统会自动的把i1对象的value属性赋值给num

        //面试
        Integer i2 = 150;
        Integer i3 = 150;
        System.out.println( i2 == i3 );     //true
        /*
            Java认为-128~127范围内的整数使用最频繁, 为了减少对象的创建次数, 这个范围内整数自动装箱后保存到共享池中, 采用享元模式
            即执行 i2 = 69时, 系统会根据69创建Integer对象,把该对象保存到共享池中, 把该对象的引用赋值给i2;
            再执行i3 = 69时, 系统就直接把共享池中 Integer对象的引用赋值给i3. 现在i2与i3两个变量都引用了共享池中同一个Integer对象
         */

        System.out.println( i2 == 69 ); //隐含自动拆箱

        Integer i4 = new Integer(69);
        System.out.println( i3 == i4 );     //false
        Integer i5 = Integer.valueOf(50);
        Integer i6= Integer.valueOf(50);
        System.out.println(i5==i6);
        i5 =new Integer(69);
        System.out.println(i5.hashCode());
        i6=new Integer(69);
        System.out.println(i5==i6);
    }
}
