/**
Ejercicio #6
Una interesante clase predefinida en el lenguaje java es la clase Vector, 
* que implemente la abstracción "array dinámico". Revise la clase y úsela 
* (en ficheros diferentes) para realizar un programa que lea números del 
* teclado hasta que se introduce dos veces seguidas el mismo número. 
* Entonces el programa muestra todos los números introducidos y termina.
 */
package ejercicio6;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

/**
 * Reprenseta la clase principal 
 *
 * @version 1.00.00 2022-02-15
 * @author Kevin Luis Flórez Lozada.
 * @since 1.00.00
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vector vector = new Vector();
        Scanner scan = new Scanner(System.in);
        float beforeNumber = 0;
        boolean repeat = true;
        
        try{
         
            System.out.println("El programa pide números para almacenar en un vector\n"
                    + "Cuando escriba un mismo número seguido, el programa se detiene\n"
                    + "Luego muestra todos los numeros que se ingresaron.\n");
            while(repeat){
                System.out.print("Ingrese número: ");
                float currentNumber = scan.nextFloat();
                vector.add(currentNumber);
                if((vector.size() > 1) && (currentNumber == beforeNumber)){
                    System.out.println("Números consecutivos repetidos...\n");
                    repeat = false;
                }else{
                    beforeNumber = currentNumber;
                }
            }

            System.out.println("Números ingresados: ");
            for(int i = 0; i < vector.size(); i++){
                System.out.print(vector.get(i) + "   "); 
            }
        }catch(IndexOutOfBoundsException | NumberFormatException 
                | InputMismatchException exc){
            System.out.println(exc.getMessage());
        }   
    }
    
}
