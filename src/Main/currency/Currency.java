package Main.currency;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat a=NumberFormat.getCurrencyInstance(Locale.US);
        String us=a.format(payment);

        NumberFormat b =NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        String india=b.format(payment);

        NumberFormat c=NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china=c.format(payment);

        NumberFormat d=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france=d.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
