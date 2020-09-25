package Day0623.src.array;

/**
 * 数组扩容
 */
public class Test03 {
    public static void main(String[] args) {
        int [] data = {12,34,54,56,76,87,90};

        //需求向data数组再存储2个数据, 需要对data扩容
        //1) 定义更大的数组
//        int [] bigger = new int[data.length + 2 ];  //根据实际需求扩容
//        int [] bigger = new int[data.length * 2];   //按2倍大小扩容
        int [] bigger = new int[data.length + data.length / 2];     //按1.5倍大小扩容

        //2) 把原来数组的内容复制到新数组中
      /*  for (int i = 0; i < data.length; i++) {
            bigger[i] = data[i];
        }*/
//      System.arraycopy(src源数组, srcPos起始位置, dest目标数组, destPos起始位置, length个数);  可以把src源数组从srcpos开始的length个元素复制到dest目标数组从destPos开始的位置上
        System.arraycopy(data, 0, bigger, 0, data.length);  //把data数组从0开始的data.length个元素复制到bigger数组中从0开始的位置上
        //System类的静态方法arraycopy使用native修饰,只有方法的声明没有方法体,该方法的方法体是由C/C++实现的, 即在Java代码中可以调用其他语言编写的代码 ,

        //3) 让原来的数组名指向新的数组
        data = bigger;

        //打印data数组
        Test01.printIntArray(data);
    }
}
