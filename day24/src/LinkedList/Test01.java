package LinkedList;

import java.util.LinkedList;

/**
 * @AlanLin 2020/6/30
 */
public class Test01 {
    public static void main(String[] args) {
        //LinkedList实现了List接口，重写了List接口所有的抽象方法
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("dd");
        linkedList.add("mm");
        linkedList.add("ff");
        linkedList.add("ss");
        linkedList.add("aa");


        //注意，LinkedList底层数据结构是双向链表，但是LinkedList集合也有索引值
        linkedList.add(0,"aa");
        for (String s : linkedList) {
            System.out.println(s);
        }

        //LinkedList类实现了Deque双端队列结构，而Deque继承了Queue队列接口，队列的特点是先进先出
        //queue接口的三个常用操作
        linkedList.offer("jj");//入队，把元素添加到链表尾部
        System.out.println(linkedList);
        String poll = linkedList.poll();//出队，把链表头部元素删除并返回
        System.out.println(poll);
        String peek = linkedList.peek();//返回第一个元素，不删除，如果链表中没有元素则返回null
        System.out.println(peek);
        System.out.println(linkedList);
        //如果集合为空，poll()和peek()返回结果为null
        LinkedList<String> another=new LinkedList<>();
//        System.out.println(another.poll());
//        System.out.println(another.peek());
//        another.remove(0);//java.lang.IndexOutOfBoundsException
        //remove()删除第一个元素，并返回
        //System.out.println(another.element());//返回第一个元素，如果集合为空，异常
//        another.add("y");
        System.out.println(another);

        //双端队列Deque中常用的操作
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList);
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);
        linkedList.addFirst("hh");
        linkedList.addLast("tt");
        System.out.println(linkedList);

        //在Deque队列中增加了两个方法push()和pop()模拟栈，栈是现金后厨，后进先出
        linkedList.push("a");
        System.out.println(linkedList);
        String pop = linkedList.pop();//模拟出栈，把链表头部元素删除并返回
        System.out.println(pop);
        System.out.println(linkedList);

    }
}
