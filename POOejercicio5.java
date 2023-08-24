package pooejercicio5;

/**
 *
 * @author Melany
 */
public class POOejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double suma = 0;
        int x = 20;
        suma = suma + x;
        int y = 40;
        x = x + (y*y);
        suma = suma + (double)x/y;
        System.out.println("EL VALOR DE LA SUMA ES: " + suma);
    }
    
}




