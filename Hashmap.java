import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//hashmap>>unorderd map hote h 
public class Hashmap {
    public static void main(String[] args) {
        //country(key), population(value)
        HashMap<String, Integer> map = new HashMap<>();



        //insertion
        map.put("India", 120);
        map.put("USA", 300);
        map.put("China", 1400);
        System.out.println(map);
        map.put("China", 1600);//update hojaygi reenter krne par 
        System.out.println(map);

        //search operation>>.lookup
        if(map.containsKey("delhi")){
            System.out.println("keyis present in map");
        }
        else{
            System.out.println("key is not present in map");
            }
            System.out.println(map.get("India"));//.get value return karega
            System.out.println(map.get("delhi"));//.get value return karega

            //forloop
            // int arr[]={10,20,30};
            // for(int i=0;i<arr.length;i++){
            //     System.out.println(arr[i]);
            //     }
             
            //     //for loop for collection
            //     for (int val: arr) {
            //         System.out.println(val);
                    
            //     }

                for(Map.Entry<String,Integer> e : map.entrySet()){
                    System.out.println("********************************************");
                System.out.println(e.getKey());
                System.out.println(e.getValue());
                }

                //only for keysets
               Set<String> keys = map.keySet();
               for(String key:keys){
                System.out.println(key+" "+map.get(key));
                }

                //remove
                map.remove("USA");
                System.out.println(map);
    }
}