/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooejercicio1;

import java.util.Scanner; 
public class POOejercicio1 {

    /**
     * Ejercicio resuelto #4
     * Melany Franco Marin
     */
    public static void main(String[] args) {
        int edadJuan, edadAlberto, edadAna, edadMama;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la edad de Juan: ");
        edadJuan = teclado.nextInt();
        edadAlberto = 2*(edadJuan/3);
        edadAna = 4*(edadJuan/3);
        edadMama = edadAlberto + edadJuan + edadAna;
        System.out.println("Las edades son: ");
        System.out.println(" Edad de Juan: " + edadJuan);
        System.out.println(" Edad de Alberto: " + edadAlberto);
        System.out.println(" Edad de Ana: " + edadAna);
        System.out.println(" Edad de la Mama: " + edadMama);
    }
    
    
}

