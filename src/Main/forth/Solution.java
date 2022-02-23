package Main.forth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Arithmetic{
    public Integer sum(Integer[] ints){
        int toplam=0;
        if((ints.length>=1)&&(ints.length<=100)){
            for (int i = 0; i < ints.length; i++) {
                toplam=toplam+ints[i];
            }
        }
        return toplam;
    }

    public String sum(String[] strings){
        String regex = "^(?=.*[a-z])(?=."
                + "*[A-Z])(?=.*\\d)"
                + "(?=.*[-+_!@#$%^&*., ?]).+$";
        Pattern p=Pattern.compile(regex);

        String toplam="";
        toplam=Arrays.toString(strings).replace(",","").
                replace("[","").replace("]","");
        Matcher m = p.matcher(toplam);
        if(m.matches()){
            return toplam.replace(" ","");
        }
        return toplam.replace(" ","");


    }
}
public class Solution {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] values = line.split(" ");

        //check if int array
        try{
            Integer.parseInt(values[0]);

            //System.out.println("Integer array");
            Integer[] ia = new Integer[values.length];
            for (int i=0; i< values.length; i++){
                ia[i] = new Integer(values[i]);
            }
            System.out.println(arithmetic.sum(ia));
        }catch(NumberFormatException nfe){
            //then string array

            //System.out.println("String array");
            System.out.println(arithmetic.sum(values));
        }
    }
}
