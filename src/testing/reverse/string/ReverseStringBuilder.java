package testing.reverse.string;

public class ReverseStringBuilder {

    public static void main(String args[] ){
        String str = "anand";
        System.out.println(reverseStringBuilder(str));


        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }

    public static String reverseStringBuilder(String str) {

        StringBuilder stringBuilder = new StringBuilder(str);
        String reverse = stringBuilder.reverse().toString();
        return reverse;
    }



}
