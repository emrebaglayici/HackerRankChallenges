package Main.regex;

import java.util.Arrays;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        String str="He is a very very good boy, isn't he?";
        str=str.replaceAll("[^a-z A-Z]"," ");
        System.out.println(str);
        str=str.replaceAll("\\s+"," ");
        System.out.println(str);
        str=str.trim();
        System.out.println(str);

        String [] arr=str.split(" ");

        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
        for(String a:arr)
        {
            System.out.println(a);
        }

    }
}
