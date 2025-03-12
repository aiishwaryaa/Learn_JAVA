

import java.util.LinkedList;

class list{
public class linklst {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("this");
        list.addLast("is");
        list.addLast("a");
        list.addLast("test");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
    }
}
}