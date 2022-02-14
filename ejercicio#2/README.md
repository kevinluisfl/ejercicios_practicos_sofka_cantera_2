# Cantera 2 Sofka 

## Ejercicios prácticos

### Ejercicio #2
- ¿Es posible ejecutar un programa en java que contenga varias clases con métodos main? En caso positivo, ¿cómo se determina el punto de entrada a un programa?

> Solo si los métodos “main” están sobrecargados. Es decir, que los metodos “main”, tengan distintos parámetros con diferentes tipos de datos. 

> Ejemplo: `public void main(int number), public void main(boolean b)`

> El método que solicita java como principal, punto de entrada, debe ser el que tenga como parámetro (String[] args) porque la ausencia de un metodo main con este parámetro nos salta error ("java no encuentra metodo: `public static void main(String[] args)`")


