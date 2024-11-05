import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        int num1;
        Scanner teclado = new Scanner(System.in);
        System.out.print("INGRESE UN NUMERO ENTRE 2 Y 6: ");
        num1 = teclado.nextInt();

        // Comprueba que el numero este en el rango solicitado
        if (num1 >=2 && num1 <=6) {
            System.out.println("Tabla de multiplicar del " + num1 + ":");

            // Genera la tabla de multiplicar del 1 al 12
           for (int i =1; i <=12; i++) {
               System.out.println(num1 + " x " + i + " = " + (num1 *i));
           }
        } else {
            System.out.println("EL NUMERO INGRESADO NO ESTA EN EL RANGO PERMITIDO");
        }
    }

}