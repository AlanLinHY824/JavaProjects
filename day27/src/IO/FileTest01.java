package IO;

import java.io.File;

/**
 * @AlanLin 2020/7/9
 */
public class FileTest01 {
    public static void main(String[] args) {
        File file1=new File("src\\test");//创建一个硬盘中不存在的文件对象，是一个两层的目录
        //file1.mkdirs();
        System.out.println(file1.getParent());//相对路径如果有两层的话，直接取上一层
        System.out.println(file1.getAbsolutePath());//D:\学习资料\Java学习\动力节点\01-JavaSE\JavaProjects\src\test 只要不是从根目录开始的文件名都是相对路径，相对路径都默认在工程目录下，以工程目录作为起点
        System.out.println(file1.getAbsoluteFile().getParent());//D:\学习资料\Java学习\动力节点\01-JavaSE\JavaProjects\src 完整版的父目录
        File file2=file1.getAbsoluteFile();
        //System.out.println(file2.delete());//因为根本不存在，所以删除方法返回false
        System.out.println(file2.isAbsolute());//根据路径对象本身判断路径是否为绝对路径
        System.out.println(file2.isDirectory());//false 根据硬盘中的实际文件判断
        System.out.println(file2.isFile());//false 根据硬盘中的实际文件判断
        System.out.println(file2.exists());//false 根据硬盘中的实际文件判断
        System.out.println(file2.renameTo(new File("D:\\学习资料\\Java学习\\动力节点\\01-JavaSE\\JavaProjects\\src\\asd")));//重新命名此路径指向的硬盘文件，对file2这个文件对象的值不起作用
        System.out.println(file2.toPath());//格式转换为Path类型
        System.out.println(file2);
        File file3=new File("src\\test");
        System.out.println();
        System.out.println(file2.compareTo(file1));




    }
}
