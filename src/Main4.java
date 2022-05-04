import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        //Дана длина куба ребра а. Найти объем куба V= a*3 и площадь его поверности S= 6*a2.

        Scanner in = new Scanner(System.in);
        System.out.print("a=");
        double a = in.nextDouble();
        double V= a*a*a;
        System.out.println("V="+V);
        double S = 6*a*a;
        System.out.println("S=" +S);
        in.close();
    }
}
