import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        //Найти длину окружности L  и площадь круга S заданного радиуса R: L=2*p*R, S= p*R2.
        // В качестве значения p использовать 3.14.
        Scanner in = new Scanner(System.in);
        System.out.print("R=");
        double R = in.nextDouble();
        double L = 2*3.14*R;
        System.out.println("L="+L);

        double S=3.14*R*R;
        System.out.println("S=" +S);
        in.close();
    }
}
