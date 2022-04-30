package Main.palindrome;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String rev="";
        int length=A.length();
        for (int i = length-1; i >=0 ; i--) {
            rev=rev+A.charAt(i);
        }
        if(A.equals(rev))
            System.out.println("Yes");
        else{
            System.out.println("No");
        }
    }
}
