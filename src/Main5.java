import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        // Даны длины ребер a,b,c с прямоугольного параллелепипеда. Найти его объем V=a*b*c
        // и площадь поверхности S=2*(a*b+b*c+a*c)/

        Scanner in = new Scanner(System.in);
        System.out.print("a=");
        double a = in.nextDouble();
        System.out.print("b=");
        double b = in.nextDouble();
        System.out.print("c=");
        double c = in.nextDouble();
        double V = a*b*c;
        System.out.println("V="+V);

        double S=2*(a*b+b*c+a*c);
        System.out.println("S:" +S);
        in.close();
    }
}
