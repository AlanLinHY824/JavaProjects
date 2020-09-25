package Day0623.src.array;


/**
 * 对象数组
 *  数组元素其实存储的是对象的引用
 */
public class Test06 {
    public static void main(String[] args) {
        //定义数组存储50个Person对象
        Person [] data = new Person[50];
        //一般情况下, 在使用对象数组时, 会定义一个变量记录数组中元素的数量
        int size = 0 ;

        //给数组元素赋值,把Person对象存储到数组中, 在使用数组时,一般采用顺序存储
        //每次向数组中添加元素, size变量的值就加1
        data[size] = new Person("lisi", 25);           size++;     //1
        data[size] = new Person("wangwu", 22);         size++;     //2
        data[size] = new Person("zhaoliu", 27);        size++;     //3
        data[size] = new Person("chenqi", 25);         size++;     //4
        data[size++] = new Person("zhuba", 23);
        data[size++] = new Person("feifei", 26);
        data[size++] = new Person("feifei", 26);

        //遍历数组中所有的元素
        for (int i = 0; i < data.length; i++) {
            System.out.println( data[i] );
        }

        //打印数组中存储Person对象的人名
        //不需要遍历整个数组, 存储了多少个Person对象就打印多少个元素
        for (int i = 0; i < size ; i++) {
            System.out.println( data[i].name );
        }

        //判断数组中是否存在姓名为zhangsan的人员
        String name = "zhangsan";
        //遍历数组中存储的Person对象, 如果有某个Person对象的姓名与name一样就表示存在, 如果所有的Person对象的姓名与name都不匹配,则表示不存在
        boolean exist = false;      //定义存在标志,先假设不存在
        for (int i = 0; i < size; i++) {
            if ( name.equals( data[i].name )  ){
                //如果数组中有某个元素的姓名与name一样就表示存在
                exist = true;
                break;
            }
        }
        //根据存在标志判断是否存在
        if ( exist ){
            System.out.println("存在");
        }else {
            System.out.println("不存在");
        }

        //删除zhaoliu
        name = "zhaoliu";
        //先确定要删除元素的索引值
        int index = -1;         //保存name姓名在数组中的索引值
        for (int i = 0; i < size; i++) {
            if (name.equals(data[i].name)){
                index = i;
                break;
            }
        }
        //把数组中index索引值的元素删除
        if ( index < 0 ){
            System.out.println("数组中不存在" + name + "的人,无需删除");
        }else {
            //删除index位置的元素, 可以从index+1开始, 把每个元素逐个前移
            System.arraycopy(data, index + 1 , data, index, size - index - 1);
            //元素个数减1
            size--;
            //最后元素置null
            data[size] = null;
        }

        System.out.println("-------------删除zhaoliu后---------------");
        for (int i = 0; i < size; i++) {
            System.out.println(data[i]);
        }
    }
}
