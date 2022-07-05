import java.util.ArrayList;

import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(9);
        list.add(8);
        for(int i = 0; i<7;i++)
        {
            list.add(i);
        }
        System.out.println(list);
System.out.println(list.size());
System.out.println(list.get(3));
list.add(4, 7);
System.out.println(list);
System.out.println(list.size());
list.set(1, 2);
System.out.println(list);
System.out.println(list.size());
list.remove(5);
System.out.println(list);
System.out.println(list.size());
Collections.sort(list);
System.out.println(list);
    }
}
