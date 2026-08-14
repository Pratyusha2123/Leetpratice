import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DaysBetweenDates {

    public static int numOfDays(int d1, int m1, int y1, int d2, int m2, int y2) {
        LocalDate date1 = LocalDate.of(y1, m1, d1);
        LocalDate date2 = LocalDate.of(y2, m2, d2);
        return (int) Math.abs(ChronoUnit.DAYS.between(date1, date2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First date (Date Month Year):");
        int d1 = sc.nextInt();
        int m1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Second date (Date Month Year):");
        int d2 = sc.nextInt();
        int m2 = sc.nextInt();
        int y2 = sc.nextInt();
        int result = numOfDays(d1, m1, y1, d2, m2, y2);

        System.out.println("Total days: " + result);

        sc.close();
    }
}
