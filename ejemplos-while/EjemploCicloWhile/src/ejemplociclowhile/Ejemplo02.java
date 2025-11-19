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
public class Ejemplo02 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite;
        int contador = 1;
        System.out.println("Ingrese el Límite");
        limite = entrada.nextInt(); 
        while (contador <= limite){
            
            if (contador%2!=0) {
                System.out.printf("Contador %d\n", 
                    contador);
            }
            
            contador = contador + 1;
        }
        
    }
}

/*
El codigo primeramente nos pide un limite por pantalla, con ese limite la 
varible crezera hasta ese punto, pero tenemos un if, que hace el trabajo de que 
todo número par que sea con residuo cero, lo omite pues tiene que ser diferente
de cero y va hacia la linea 32 a agregarle +1 a contador,
mientras que con los números impares al tener residuo 1, los imprime y se guardan
en la variable hasta llegar al límite.
*/