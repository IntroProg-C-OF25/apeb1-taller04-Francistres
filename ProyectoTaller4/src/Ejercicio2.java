import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        double gast1, gast2, gast3, gasttotal;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese gastos hijo 1: ");
        gast1 = teclado.nextDouble();
        System.out.print("Ingrese gastos hijo 2: ");
        gast2 = teclado.nextDouble();
        System.out.println("Ingrese gastos hijo 3");
        gast3 = teclado.nextDouble();
        gasttotal = gast1 + gast2 + gast3;
        System.out.println("Los Gastos totales son = " + gasttotal);
    }

}