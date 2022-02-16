
package ejercicio3;

/**
 * Reprenseta la clase "Bubble" para desarrollar el método de ordenamiento
 * burbuja
 *
 * @version 1.00.00 2022-02-15
 * @author Kevin Luis Flórez Lozada.
 * @since 1.00.00
 */
public class Bubble {

    /**
     * Representa el método para ordenar por burbuja.
     * @param numbers
     * @return un listado de numeros ordenados.
     */
    public double[] orderBubble(double[] numbers){
        double aux;
        for(int i = 0; i < numbers.length -1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[i] > numbers[j]){
                    aux = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = aux;
                }
            }
        }
        return numbers;
    }
}
