package Exception.IOS;

import java.io.Closeable;
import java.io.IOException;

/**
 * @AlanLin 2020/7/9
 */
public class IOSUpdate implements Closeable {
    public void update() throws MyException{
        System.out.println("开始更新");
        throw new MyException();
    }

    public void rollback(){
        System.out.println("回退更新");
    }

//    public void clear(){
//        System.out.println("释放所有资源");
//    }

    @Override
    public void close() throws IOException {
        System.out.println("释放所有资源");
    }
}
