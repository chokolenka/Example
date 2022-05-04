import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        //Дан диаметр окружности d. Найти ее длину L=п*d. В качестве значения п использовать 3.14.

        Scanner in = new Scanner(System.in);
        System.out.print("d=");
        float d = in.nextFloat();
        double L = 3.14*d;
        System.out.println("L="+L);
        in.close();

    }
}
