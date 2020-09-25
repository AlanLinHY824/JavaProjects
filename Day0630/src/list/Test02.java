package src.list;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * LinkedList
 */
public class Test02 {
    public static void main(String[] args) {
        //1 LinkedList实现了List接口, 重写了List接口所有的抽象方法
        LinkedList<String > linkedList = new LinkedList<>();
        linkedList.add("xx");
        linkedList.add("yy");
        linkedList.add("zz");
        //注意: LinkedList底层数据结构是双向链表, 但是LinkedList集合也有索引值
        linkedList.add(0, "aa");
        System.out.println(linkedList);     //[aa, xx, yy, zz]

        //2 LinkedList类实现了Deque双端队列接口, 而Deque继承了Queue队列接口, 队列的特点是:先进先出,
        //Queue队列接口中的三个常用操作
        linkedList.offer("tt");         //入队, 把元素添加到链表尾部
        System.out.println(linkedList);     //[aa, xx, yy, zz, tt]
        String polled = linkedList.poll();  //出队, 把链表头部元素删除并返回
        System.out.println( polled );       //aa
        System.out.println(linkedList);     //[xx, yy, zz, tt]
        String peeked = linkedList.peek();  //返回第一个元素,不删除, 如果链表中没有元素则返回null
        System.out.println( peeked );       //xx
        System.out.println( linkedList );   //[xx, yy, zz, tt]

        //如果集合为空, poll()删除, peek()返回第一个元素, 返回null
        LinkedList<String> another = new LinkedList();
        System.out.println( another.poll() );       //null
        System.out.println( another.peek() );       //null
//        System.out.println( another.remove() );    //删除第一个元素，没有元素的话报错java.lang.IndexOutOfBoundsException
//        System.out.println( another.element() )  ;  //返回第一个元素,不删除, 如果集合为空则 java.util.NoSuchElementException异常

        //Deque双端队列中的常用方法
        System.out.println( linkedList.getFirst() );    //返回第一个     xx
        System.out.println( linkedList.getLast() );     //返回最后一个    tt
        System.out.println( linkedList );   //[xx, yy, zz, tt]
        System.out.println( linkedList.removeFirst() );     //删除第一个 xx
        System.out.println( linkedList.removeLast() );  //删除最后一个 tt
        System.out.println( linkedList );   //[yy, zz]
        linkedList.addFirst("hh");
        linkedList.addLast("tt");
        System.out.println(linkedList);     //[hh, yy, zz, tt]

        //在Deque双端队列中还增加了一组方法push(),pop()模拟栈, 栈特点是先进后出, 后进先出
        linkedList.push("ww");  //模拟入栈, 会把元素添加到链表的头部
        System.out.println( linkedList );   //[ww, hh, yy, zz, tt]
        String poped = linkedList.pop();    //模拟出栈, 会把链表头部元素删除,并返回
        System.out.println( poped );        //ww
        System.out.println( linkedList );   //[hh, yy, zz, tt]
        System.out.println( linkedList.pop() ); //hh
        System.out.println(linkedList);     //[yy, zz, tt]

        
    }
}
