package testing.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HasmapIterator {

    public static void main(String args[]){

        HashMap<String,String>  map = new HashMap<String,String>();

        map.put("a","1");
        map.put("a","2");

        map.put(null,null);
        map.put(null,"3");


        map.put("b","4");
        map.put("c","5");
        map.put("d","6");


        // Iterator of keyset()
        System.out.println("// Iterator of keyset()");
        Iterator<String> it = map.keySet().iterator();
        while(it.hasNext()){
            String key = it.next();
            String value = map.get(key);
            System.out.println("key ="+key + " value ="+value);
        }

        //Iterator of entryset()
        System.out.println("//Iterator of entryset()");
       Iterator<Map.Entry<String,String>> it1 = map.entrySet().iterator();

        while(it1.hasNext()){
                Map.Entry entry1 = it1.next();
            System.out.println("key = "+entry1.getKey() + " value " + entry1.getValue());
        }

//        while(it1.hasNext()){
//            Map.Entry<String,String > entry1 =  it1.next();
//            System.out.println("key = "+entry1.getKey() + " value " + entry1.getValue());
//        }


        System.out.println("test lambda expression jdk8");
        map.forEach((k,v) -> System.out.println("key = "+k + " value="+v));

    }
}
