import java.util.stream.*;
import java.util.*;

public class StreamExample {

    public static void main (String[] args){
        String str = "mounaaa";
        String str1 = "dolly";
        StreamExample.normal(str);
        StreamExample.usingStringBuilderMethod(str1);
    }

    public static void normal(String b){
        StringBuilder sb = new StringBuilder();
       char[] c = b.toCharArray();
       for(int i=c.length-1; i>=0; i--){
           System.out.println(c[i]);
           sb.append(c[i]);
       }
        System.out.println(sb.toString());
    }

    public static void usingStringBuilderMethod(String m){
        String st = new StringBuilder(m).reverse().toString();
        System.out.println(st);

    }

}
