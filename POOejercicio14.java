package pooejercicio14;
import java.util.Scanner;
/**
 *Elabore un algoritmo que lea un número y obtenga su cuadrado y su cubo.
 */
public class POOejercicio14 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        int numero = teclado.nextInt();
        double cuadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);
        System.out.println("El numero es " + numero + ", su cuadrado es " + (int)cuadrado + " y su cubo es " + (int)cubo);
    }
    
}
