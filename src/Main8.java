import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        //Даны два неотрицательных числа a и b. Найти их среднее геометрическое,
        // то есть квадратный корень из их произведения: \/ a*b

        Scanner in = new Scanner(System.in);
        System.out.print("a=");
        double a = in.nextDouble();
        System.out.print("b=");
        double b = in.nextDouble();
        double sum= Math. sqrt(a*b) ;
        System.out.println("sum=" +sum);
        in.close();

    }
}
