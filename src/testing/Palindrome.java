package testing;

public class Palindrome {

    public static void main(String args[]){

        String test = "anan";
        System.out.println(Palindrome(test));
    }

    public static Boolean Palindrome(String str){

        int length = str.length()-1;
        int i=0;
        int j=length-1;
        Boolean flag  = true ;
        while(i < j)   {
            if(str.charAt(i) != str.charAt(j)) {
                System.out.println(str.charAt(i) + str.charAt(i));
                return flag = false;
            }
                i++;
                j--;
            }
        return flag;
    }

    }

