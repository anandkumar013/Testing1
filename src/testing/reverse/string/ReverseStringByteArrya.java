package testing.reverse.string;

public class ReverseStringByteArrya {

    public static  void main (String args[]){

        String String = "anand";
        System.out.println( reverseStringBytesArray(String));

    }
    public static String reverseStringBytesArray(String str){
        byte[] strByteArray = str.getBytes();
        byte[] result = new byte[strByteArray.length];

        for(int i=0 ; i < strByteArray.length ; i++){
            result[i] = strByteArray[strByteArray.length-1-i];
        }

        return new String(result);
    }
}
