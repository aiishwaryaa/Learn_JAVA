
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
       //add
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(10);

        //contains
    
       if( set.contains(10)){
        System.out.println("10 is present in set");
       }
       if(!set.contains(1)){
        System.out.println("1 is not present in set");
       }

       //delete ...removeee
       set.remove(10);
       if(!set.contains(10)){
        System.out.println("10 is removed from set");
        }   

        //size
        System.out.println("size of set is "+set.size());

        //print all elements
        System.out.println(set);

        //iterator <used to traverse set>
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            }

        //iske do function hote h>>>>
        //1>> hasNext function
        //2>> next function

    }
}