import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        double p_netflix, p_youtube, p_dropbox, p_spotify, valor_pagar;
        int edad_user;
        Scanner teclado = new Scanner(System.in);
        System.out.print("INGRESE EL PRECIO DE SU PLAN DE NETFLIX: ");
        p_netflix = teclado.nextDouble();
        System.out.print("INGRESE EL PRECIO DE SU SUSCRIPCION DE YOUTUBE: ");
        p_youtube = teclado.nextDouble();
        System.out.print("INGRESE EL PRECIO DE SU PLAN DE DROPBOX: ");
        p_dropbox = teclado.nextDouble();
        System.out.print("UNGRESE EL PRECIO DE SU PLAN DE SPOTIFY: ");
        p_spotify = teclado.nextDouble();
        System.out.print("INGRESE LA EDAD DEL USUARIO: ");
        edad_user = teclado.nextInt();

        // PRECIO SIN DESCUENTO
        valor_pagar = p_netflix + p_youtube + p_dropbox + p_spotify;

        // APLICAR DESCUENTO SI LA PERSONA ES MENOR A 30 AÑOS
        if (edad_user <30) {
            valor_pagar *= 0.80; // APLICA EL 80% DEL VALOR TOTAL (20% DE DESCUENTO)    
        }
        System.out.printf("EL TOTAL A PAGAR DE POR SUS SERVIVIOS DIGITALES ES = $%.2f\n", valor_pagar);

        teclado.close();

    }
}