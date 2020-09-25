package demo6;

/**
 * @AlanLin 2020/6/20
 */
public class MyClass {//外部类

    public void print(){
        Inner i=new Inner();
    }
    Inner i=new Inner();
    public class Inner{//成员内部类，一般在外部类的实例方法中使用

        public void print(){
            System.out.println("成员内部类方法");
        }
    }

    public static void print2(){
        Inner2 i=new Inner2();
    }

    static class Inner2{//在外部类的静态方法中使用

        static int a;
        int b;
        private int c;

        public static void print(){
            System.out.println("静态内部类静态方法");
        }

        public  void print2(){
            System.out.println("静态内部类实例方法");
        }

    }

    public void prrint(){
        class Inner{

        }

        Inner inner=new Inner();

    }

}
