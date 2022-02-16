
package ejercicio3;

import javax.swing.JOptionPane;

/**
 * Reprenseta la clase principal 
 *
 * @version 1.00.00 2022-02-15
 * @author Kevin Luis Flórez Lozada.
 * @since 1.00.00
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        boolean repeat = true;
        
        try{
            /**
             * capturar el numero de numeros que se van a generar aleatoriamente
             * luego el numero máximo posible a generar
             */

            int n = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de elementos para el arreglo"));

            double[] numbers = new double[n];

            int maxNum = Integer.parseInt(JOptionPane.showInputDialog("Número aleatorio máximo a generar"));
            /**
             * Se generan los numeros aleatorios y se van almacenando en numbers.
             */
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = (Math.random() * maxNum);
            }
            /**
             * Imprime por consola los números generados aleatoriamente.
             */
            System.out.println("\nNúmeros generados");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }

            /**
             * bucle while que permite una iteración repetida del menú.
             */
            while (repeat) {

                /**
                 * opciones de ordenamiento para que el usuario seleccione.
                 */
                int selection = JOptionPane.showOptionDialog(null, "¿Que método desea usar?", "Menú",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Ordenar por burbuja", "Ordenar por QuickSort", "Cerrar"}, "opcion 1");

            /**
             * switch case para las distintas opciones del menú.
             */
                switch (selection+1) {

            /**
             * El caso 1 reprenseta el ordenamiento por metodo burbuja.
             */
                    case 1:
                        System.out.println("\nOrdenado por el método burbuja");
                        Bubble bubble = new Bubble();
                        double[] numbersOrderBu = bubble.orderBubble(numbers);
                        for (int i = 0; i < numbersOrderBu.length; i++) {
                            System.out.println(numbersOrderBu[i]);
                        }
                        break;
            /**
             * El caso 2 representa el ordenamiento por metodo quicksort.
             */
                    case 2:
                        System.out.println("\nOrdenado por el método quicksort");
                        QuickSort sort = new QuickSort();
                        double[] numbersOrderQuick = sort.orderQuickSort(numbers);
                        for (int i = 0; i < numbersOrderQuick.length; i++) {
                            System.out.println(numbersOrderQuick[i]);
                        }
                        break;
                    default:
                        repeat = false;
                }
            }
        }catch(NullPointerException | IndexOutOfBoundsException | NumberFormatException exc){
            System.out.println(exc.getMessage());
        }
    }
    
}
