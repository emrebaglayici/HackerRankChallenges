package Main.anagrams;

import java.util.*;

public class Anagram {
    static boolean isAnagram(String a,String b){
        char[] temp1 =a.toLowerCase().toCharArray();
        char[] temp2 =b.toLowerCase().toCharArray();
        int x=a.length();
        int y=b.length();
        if(x!=y){
            return false;
        }
        Arrays.sort(temp1);
        System.out.println(temp1);
        Arrays.sort(temp2);
        System.out.println(temp2);
        for (int i = 0; i <x ; i++) {
            if(temp1[i]!=temp2[i])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
