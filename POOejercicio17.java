package pooejercicio17;
import java.util.Scanner;
/**
 * Dado el radio de un círculo. Haga un algoritmo que obtenga el área del círculo y la longitud
de la circunferencia.
 */
public class POOejercicio17 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Ingrese el valor del radio: ");
        float radio = tec.nextFloat();
        double area = Math.PI * Math.pow(radio, 2);
        double longitud = Math.PI * 2 * radio;
        System.out.print("El circulo de radio " + radio ); 
        System.out.print(" tiene area " + (float)area);
        System.out.println(" y longitud de circunferencia de " + (float)longitud);
    
    }
}
