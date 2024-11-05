import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        double montoprestamo, intermes, pagomes, pagomes_sininter, valorinteresmes;
        Scanner teclado = new Scanner(System.in);
        System.out.print("INGRESE MONTO DEL PRESTAMO: ");
        montoprestamo = teclado.nextDouble();
        System.out.print("INGRESE EL PORCENTAJE DE INTERES: ");
        intermes = teclado.nextDouble();
        pagomes_sininter = montoprestamo / 12;
        valorinteresmes = pagomes_sininter * (intermes / 100);        
        pagomes = pagomes_sininter + valorinteresmes;
        System.out.println("EL VALOR A PAGAR MENSUALMENTE ES = " + pagomes);
    }
}