import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please Enter data in forenhieght");
        int num1 = in.nextInt();
        float c = (num1 - 32) * 5 / 9;
        System.out.println(c + "which is is degree celcious ");
    }

}
