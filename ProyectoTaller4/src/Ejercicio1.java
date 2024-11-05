import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        //Declaración de datos o variables
        double base, altura, area;
        Scanner teclado = new Scanner(System.in);
        //Ingresos de datos de entrada
        System.out.print("DAME LA BASE: ");  // Carpinteria Salida
        base = teclado.nextDouble();  //Datos de entrada
        System.out.print("DAME LA ALTURA: ");
        altura = teclado.nextDouble();
        //Procesamiento de datos de entrada
        area = (base * altura) / 2;
        //DPresentación de datos de salida
        System.out.println("Area del triangulo es = " + area);
    }

}