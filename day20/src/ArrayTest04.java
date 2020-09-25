/**
 * @AlanLin 2020/6/23
 */
public class ArrayTest04 {
    public static void main(String[] args) {
        Person[] data=new Person[50];

        //一般情况下，在使用对象数组时，会定义一个变量，记录数组中元素的个数

        int size=0;;

        //每次添加元素时，size变量+1
        data[size++]=new Person("张三", 19);  //size=1
        data[size++]=new Person("李四", 20);  //size=2
        data[size++]=new Person("王五", 21);  //size=3
        data[size++]=new Person("赵六", 22);  //size=4

        for (int i = 0; i <size ; i++) {
            System.out.println(data[i]);
        }

        //不需要打印数组的所有元素
        for (int i = 0; i <size ; i++) {
            System.out.println(data[i].name);
        }

        //判断数组中是否存在有个叫张三的人
        //遍历数组中存储的Person对象，进行判断

        boolean exist=false;
        for (int i = 0; i <size ; i++) {
            if ("张三".equals(data[i].name)){
                exist=true;
            }
        }
        System.out.println(exist?"存在":"不存在");

        //删除赵六
        int index=-1;
        for (int i = 0; i <size ; i++) {
            if ("赵六".equals(data[i].name)){
                index=i;
                break;
            }
        }
        if (index<0){
            System.out.println("无需删除");
        }
        else {
            //删除index位置的元素
            System.arraycopy(data, index+1, data, index, size-index-1);
            size--;
            data[size]=null;
        }
        for (int i = 0; i <size ; i++) {
            System.out.println(data[i]);
        }
    }
}
