import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //Даны стороны прямоугольника a и b. Найти его площадь S=a*b и периметр P=2*(a+b)

        Scanner in = new Scanner(System.in);
        System.out.print("a=");
        double a = in.nextDouble();
        System.out.print("b=");
        double b = in.nextDouble();
        double S = a*b;
        System.out.println("S="+S);

        double P = 2*(a+b);
        System.out.println("P:" +P);
        in.close();
    }
}
