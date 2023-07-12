import java.util.*;

public class Linked_Java_Collections {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(3);
        list.add(4);

        System.out.println(list);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "-->");
        }
        System.out.println();
        list.removeFirst();
        list.removeFirst();
        System.out.println(list);
    }
}
