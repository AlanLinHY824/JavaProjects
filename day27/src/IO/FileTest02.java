package IO;

import java.io.File;

/**
 * 显示一个文件夹里所有的文件
 * @AlanLin 2020/7/9
 */
public class FileTest02 {
    static int count1=0;
    public static void main(String[] args) {
        File fileInput=new File("D:\\娱乐");
        showAllFiles(fileInput);
    }
    public static int showAllFiles(File directory){
        System.out.println("文件夹："+ directory);
        File[] filesInput= directory.listFiles();
        int count=0;
        int count2=0;
        assert filesInput != null;
        for (int i = 0; i <filesInput.length ; i++) {
            if (filesInput[i].isDirectory()){
                count+=showAllFiles(filesInput[i]);
                count2++;
            }else {
                System.out.print("文件：");
                System.out.println(filesInput[i]);
                count++;
                count1++;
            }
        }
        System.out.println("文件夹\""+ directory +"\"中的文件夹总数："+count2);
        System.out.println("文件夹\""+ directory +"\"中的文件总数："+count);
        //System.out.println("该目录下的文件夹中的累计文件数量："+count1);
        return count;
    }
}
