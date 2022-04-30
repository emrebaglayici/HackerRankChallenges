package Main.SubstringsComparison;

import java.util.Scanner;

public class Comparison {
    public static String getSmallestAndLargest(String s, int k) {
        String crr=s.substring(0,k);
        String smallest = crr;
        String largest = crr;
        for (int i = k; i <s.length() ; i++) {
            crr=crr.substring(1,k)+s.charAt(i);
            if(largest.compareTo(crr)<0)
                largest=crr;
            if(smallest.compareTo(crr)>0)
                smallest=crr;
        }

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
