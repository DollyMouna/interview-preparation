import java.util.stream.*;
import java.util.*;

public class StreamExample {

    public static void main (String[] args){
        String str = "mounaaa";
        String str1 = "dolly";
        List<String> a = Arrays.asList("mounaaa","dolly","mounaaa","mounaaa","dolly","smiley","simplesmileymouna","sareebeauty");
            int count = 0;
            int count1 = 0;
            for(String h : a) {
                if (h.equals(str)) {
                    count++;
                }
            if(h.equals(str1)){
                    count1++;
                }
            }
        System.out.println(count);
        System.out.println(count1);


        List<String> r = a.stream().filter(s ->!s.equals(str) && !s.equals(str1)).collect(Collectors.toList());
        System.out.println(r);
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
