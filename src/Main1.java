import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        //Дана сторона квадрата a. Найти его площадь S=a*a.

        Scanner in = new Scanner(System.in);
        System.out.print("a=");
        float a = in.nextFloat();
        float S = a*a;
        System.out.println("S="+S);
        in.close();
    }
}
