import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        System.out.println("for converting into days and year ");
        Scanner minute = new Scanner(System.in);
        System.err.println("please Input minute for converting");
        int min = minute.nextInt();
        double days = min / (24 * 60);
        double year = days / 365;
        System.out.println(days);
        System.err.println(year);
    }
}
