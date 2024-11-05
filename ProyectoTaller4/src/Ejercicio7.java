import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        double cost_kW, num_kW, valorpagar;
        int edad_user;
        Scanner teclado = new Scanner(System.in);
        System.out.print("INGRECE EL COSTO POR KILOVATIO/HORA: ");
        cost_kW = teclado.nextDouble();
        System.out.print("INGRESE EL NUMERO DE KILOVATIOS CONSUMIDOS EN EL MES: ");
        num_kW = teclado.nextDouble();
        System.out.print("INGRESE LA EDAD DEL USUARIO: ");
        edad_user = teclado.nextInt();

        //CALCULAR PRECIO SIN DESCUENTO
        valorpagar = cost_kW * num_kW;

        //APLICAR DESCUENTO
        if (edad_user >65) {
            valorpagar *= 0.90; // APLICA EL 90% DEL VALOR TOTAL (10% DESCUENTO)
        }
        System.out.printf("EL VALOR A CANCELAR DE LA PLANILLA DE LUZ ES = $%.2f\n", valorpagar );
    }
}