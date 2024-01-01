import java.util.Scanner;

public class DataQuest2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter data in inches ");
        float num1 = in.nextInt();
        double c = 0.0254;
        double d = c * num1;
        System.out.println(d + "meter");
    }
}