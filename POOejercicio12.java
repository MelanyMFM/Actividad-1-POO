package ejercicio.pkg12;

/**
 * Un empleado trabaja 48 horas en la semana a razón de $5.000 hora. El porcentaje de
retención en la fuente es del 12,5% del salario bruto. Se desea saber cuál es el salario bruto,
la retención en la fuente y el salario neto del trabajador.
 */
public class POOejercicio12 {
    public static void main(String[] args) {
        int horas_trabajadas = 48;
        int salarioxhora = 5000;
        int salario_bruto = horas_trabajadas * salarioxhora;
        double retencion = salario_bruto * 0.125;
        double salario_neto = salario_bruto - retencion;
        System.out.println("Salario bruto: " + salario_bruto + "$");
        System.out.println("Retencion en la fuente: " +(int)retencion+ "$");
        System.out.println("Salario neto: " + (int)salario_neto + "$");
    }
    
}
