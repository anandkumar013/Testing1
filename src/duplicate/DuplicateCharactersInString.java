package duplicate;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactersInString {
    public static void main(String args[]){
        printDuplicateCharacter("anand");
    }

    public static void printDuplicateCharacter(String str){

        HashMap<Character,Integer> map = new HashMap<>();
        char[] charArray  = str.toCharArray();

        for(char c :charArray){
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }else{
                map.put(c,1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey()
                        + " : "
                        + entry.getValue());
            }
        }
    }
}












