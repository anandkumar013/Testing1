package testing.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratroi {

    public static void main(String args[]){


        ArrayList<String> names = new ArrayList<String>();
        names.add("tom");
        names.add("bob");
        names.add("mary");
        System.out.println("name size()"+names.size());

        System.out.println("typical for loop ");
        for(int i=0 ; i<names.size() ; i++){
            System.out.println(names.get(i));
        }


        System.out.println("foreach for loop ");
        for(String s :names){
            System.out.println(s);
        }

        System.out.println("Lamba  for loop ");
        names.stream().forEach(ele -> System.out.println(ele));

        System.out.println("iterator  for loop ");
        Iterator it = names.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
