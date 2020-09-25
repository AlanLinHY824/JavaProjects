package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @AlanLin 2020/7/6
 */
public class MyTest {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("dd");
        linkedList.add("mm");
        linkedList.add("ff");
        linkedList.add("ss");
        linkedList.add("aa");
        linkedList.offer("hh");
        linkedList.offer("nn");

        System.out.println(linkedList.poll());
        System.out.println(linkedList);
        System.out.println(linkedList.remove());

        System.out.println(linkedList.element());
        System.out.println(linkedList.peek());

        linkedList.push("oo");
        System.out.println(linkedList);
        System.out.println(linkedList.pop());
        System.out.println(linkedList);

        ListIterator iterator=linkedList.listIterator(2);
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        while (iterator.hasNext()){
            System.out.println(iterator.nextIndex());
            System.out.println(iterator.next());
            System.out.println(iterator.nextIndex());
        }
        System.out.println("=====");
        while (iterator.hasPrevious()){

            System.out.println(iterator.previous());
            System.out.println(iterator.previousIndex());
            System.out.println(iterator.nextIndex());
        }

        linkedList.clear();
        //linkedList.remove();
        System.out.println(linkedList.poll());
        //linkedList.element();
        System.out.println(linkedList.peek());




    }
}
