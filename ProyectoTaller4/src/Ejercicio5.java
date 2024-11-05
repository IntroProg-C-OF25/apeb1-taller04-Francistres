import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        double costCPU, costTeclado, costPantalla, costMouse, costPC;
        Scanner teclado = new Scanner(System.in);
        System.out.print("INGRESE PRECIO DEL CPU: ");
        costCPU = teclado.nextDouble();
        System.out.print("INGRESE PRECIO DEL TECLADO: ");
        costTeclado = teclado.nextDouble();
        System.out.print("INGRESE PRECIO DE LA PANTALLA: ");
        costPantalla = teclado.nextDouble();
        System.out.print("INGRESE PRECIO DEL MOUSE: ");
        costMouse = teclado.nextDouble();
        costPC = costCPU + costTeclado + costPantalla + costMouse;
        System.out.println("EL COSTO DE LA COMPUTADORA ES = " + costPC);
    }

}