import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        // Даны два числа а и b. Найти их среднее арифметическое: (а+b)/2.

        Scanner in = new Scanner(System.in);
        System.out.print("a=");
        float a = in.nextFloat();
        System.out.print("b=");
        float b = in.nextFloat();
        double SA=(a+b)/2;
        System.out.println("SA="+SA);
        in.close();
    }
}
