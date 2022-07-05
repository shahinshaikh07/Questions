import java.util.*;
public class LL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
list.add("Shahin");
list.addFirst("My");


        System.out.println(list);
        System.out.println(list.size());
        list.removeLast();
        list.add("Hi");
        System.out.println(list);
        System.out.println(list.size());
        list.removeFirst();
        System.out.println(list);
        System.out.println(list.size());
list.add("Shahin");
list.addFirst("My");
list.addFirst("Hello");
System.out.println(list.get(1));
    }
}
