import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        double ladoCuadrado, alturaTriangulo, acuadra, arectan, atrian, atotal;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese Valor de un lado del cuadrado: ");
        ladoCuadrado = teclado.nextDouble();
        System.out.print("Ingrese Valor de la altura del Triangulo: ");
        alturaTriangulo = teclado.nextDouble();
        acuadra = Math.pow(ladoCuadrado, 2);
        arectan = acuadra * alturaTriangulo;
        atrian = (ladoCuadrado * alturaTriangulo) / 2;
        atotal = acuadra + arectan + atrian;
        System.out.println("El area total del poligono es = " + atotal);
    }

}