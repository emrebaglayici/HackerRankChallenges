package Main.stringTokens;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();

        s=s.replaceAll("[^a-z A-Z]"," ");
        //replace non character type with space
        s=s.replaceAll("\\s+"," ");
        // replace one or more space with one space
        s=s.trim();
        // remove space from both sides of a string


        String [] arr=s.split(" ");
        if(s.length()>0) {
            System.out.println(arr.length);
            for(String i:arr){
                System.out.println(i);
            }
        }
        else{
            System.out.println(0);
        }
        scanner.close();
    }
}
