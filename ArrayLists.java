import java.util.Collections;
import java.util.ArrayList;
//non contiguous memory
//al size variiable k according hota
//sirf objects store hote hai
//arraylist heap k anadar store hoti hai
//functions>>add,get,modify(add in bw),delete,iterate

public class ArrayLists {
    public static void main(String args[]){
ArrayList<Integer> list =  new ArrayList<Integer>();
//same as string , int , boolean 

//add elements 
list.add(10);
list.add(20);
list.add(30);
list.add(40);
list.add(50);
System.err.println(list);


//get elements
list.get(2);
System.err.println(list.get(2));//30

//add element in between
list.add(2, 25);
System.err.println(list);


//set elements
list.set(1, 35);
System.err.println(list);

//delete element
list.remove(3);
System.err.println(list);

//size
System.err.println(list.size());

//iterator
for(int i = 0; i<list.size(); i++){
    System.err.println(list.get(i));
    }


//sort 
Collections.sort(list);
System.err.println(list);
    }
}
