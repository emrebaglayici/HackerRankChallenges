package Main.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bufferedReader.readLine().trim());
        int result=0;
        for (int i=1;i<=10;i++){
            if((N>=2)&&(N<20)){
                result=N*i;
                System.out.println(N+" "+"x "+i+" = "+result);
            }
        }
        bufferedReader.close();
    }
}
