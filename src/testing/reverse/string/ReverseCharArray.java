package testing.reverse.string;

import java.sql.SQLOutput;

public class ReverseCharArray {

    public static void main(String args[]){

       String reverseCharArray = "anand";
        reverseCharArray(reverseCharArray);
    }

    public static void reverseCharArray(String str) {
        char[] charArryay = str.toCharArray();

        char[] reverseArray = new char[charArryay.length];
        int j=0;

        for(int i=str.length()-1 ; i >= 0  ; i--) {
            reverseArray[j++]=charArryay[i];
            //System.out.print(charArryay[i]);
        }

        for(char a : reverseArray){
            System.out.print(a);
        }
    }
}
