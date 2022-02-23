package Main.first;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int array[]=new int[3];
        for (int i = 0; i < 3; i++) {
            int num=scanner.nextInt();
            array[i]=num;
        }
        for (int a:array
             ) {
            System.out.println(a);
        }
        scanner.close();


    }
}
