/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double suma_total = 0;
        double promedio_final;
        double calificacion;
        boolean bandera = true;

        int contador = 0;

        System.out.println("Ingrese las notas de los estudiantes de su materia");
        // while (bandera == true);
        while (bandera) {
            System.out.println("Ingrese calificación");
            calificacion = entrada.nextDouble();
            suma_total = suma_total + calificacion;
            contador = contador + 1;
            // proceso para salir del ciclo.
            System.out.println("Ingrese el valor de -1 para salir del ciclo");
            int temporal = entrada.nextInt();
            if (temporal == -1) {
                bandera = false;
            }

        }

        promedio_final = suma_total / contador;
        System.out.printf("El promedio final es %.2f\n", promedio_final);
        
        // Este es un código en el cual pedimos las notas de los estudiantes 
        // por teclado, las guarda en una variable y las va sumando hasta que se
        // decida por teclado con el "-1" cuando salir del ciclo. Al salir del
        // ciclo, divide el total de la suma de las notas ingresadas por la 
        // cantidad de veces que ingresamos y las imprime
    }
}
