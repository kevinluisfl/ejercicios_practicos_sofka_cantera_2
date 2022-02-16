package ejercicio3;

/**
 * Reprenseta la clase "QuickSort" para desarrollar el método de ordenamiento
 * QuickSort
 *
 * @version 1.00.00 2022-02-15
 * @author Kevin Luis Flórez Lozada.
 * @since 1.00.00
 */
public class QuickSort {

    /**
     * Representa el método para utilizar quicksort.
     *
     * @param numbers
     * @return numeros ordenados mediante método quicksort.
     */
    public double[] orderQuickSort(double[] numbers) {
        return quicksort(numbers, 0, numbers.length - 1);
    }

    /**
     * método que realiza el ordenamiento recibiendo un listado y dos posiciones
     * para realizar las comparaciones
     *
     * @param numbers
     * @param left
     * @param right
     * @return
     */
    public double[] quicksort(double[] numbers, int left, int right) {
        if (left >= right) {
            return numbers;
        }
        int i = left, j = right;
        if (left != right) {
            int pivot;
            double aux;
            pivot = left;
            while (left != right) {
                while (numbers[right] >= numbers[pivot] && left < right) {
                    right--;
                }
                while (numbers[left] < numbers[pivot] && left < right) {
                    left++;
                }
                if (right != left) {
                    aux = numbers[right];
                    numbers[right] = numbers[left];
                    numbers[left] = aux;
                }
            }
            if (left == right) {
                quicksort(numbers, i, left - 1);
                quicksort(numbers, left + 1, j);
            }
        } else {
            return numbers;
        }
        return numbers;
    }

}
