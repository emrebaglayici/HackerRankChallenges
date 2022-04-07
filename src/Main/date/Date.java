package Main.date;
import java.io.*;
import java.time.LocalDate;

class Result{
    public static String findDay(int month, int day, int year) {
        LocalDate localDate=LocalDate.of(year,month,day);
        java.time.DayOfWeek dayOfWeek=localDate.getDayOfWeek();
        System.out.println(dayOfWeek);
        return dayOfWeek.toString();

    }
}

public class Date {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("C:/Users/EMRE/IdeaProjects/HackerRank/src/data.txt")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
