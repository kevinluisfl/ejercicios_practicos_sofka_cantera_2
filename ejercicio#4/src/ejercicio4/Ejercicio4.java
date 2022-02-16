/**
 * Ejercicio #4
 * Se quiere implementar el control de un Ferry. Para ello cree una clase Vehículo.
 * Incluya aspectos comunes a todos los vehículos como número de pasajeros,
 * presencia o ausencia de tripulación, número de ruedas, fecha de matriculación,
 * medio por el que se desplaza, etc. Incluya los métodos que considere oportunos.
 * Realice un programa capaz de leer por teclado los datos de 10 vehículos y
 * los liste a continuación por pantalla.
 */
package ejercicio4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Reprenseta la clase principal
 *
 * @version 1.00.00 2022-02-15
 * @author Kevin Luis Flórez Lozada.
 * @since 1.00.00
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        /**
         * ArrayList para almacenar los vehiculos.
         */
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        /**
         * variables para atributos de vehiculo
         */
        int nPassengers, nWheels;
        boolean tripulation;
        String dateRegistration, scrolling, tripulations;

        try {
            boolean repeatMenu = true;

            do {
                /**
                 * Menú inicial de opciones
                 */
                System.out.print("\nMenú \n1. Crear Vehiculo\n2. Listar Vehiculos\n3. Salir\nIngrese opcion: ");
                int optionMenu = scan.nextInt();

                switch (optionMenu) {
                    /**
                     * bucle para capturar los datos de los vehiculos.
                     */
                    case 1:
                        boolean repeatVehicle = true;
                        int quantityVehicle = vehicles.size();
                        String anotherVehicle;

                        while (repeatVehicle && (quantityVehicle < 10)) {
                            System.out.println("\nA continuación ingrese los datos del vehiculo " + (quantityVehicle + 1));

                            System.out.print("Número de pasajeros: ");
                            nPassengers = scan.nextInt();

                            System.out.print("¿Tiene tripulacion?. Escriba S o N: ");
                            tripulations = scan.next().toUpperCase();

                            if (tripulations.equals("S")) {
                                tripulation = true;
                            } else {
                                tripulation = false;
                            }

                            System.out.print("Número de ruedas: ");
                            nWheels = scan.nextInt();

                            System.out.print("Introduzca la fecha con formato DD/MM/YYYY: ");
                            dateRegistration = scan.next();
                            Date date = df.parse(dateRegistration);

                            System.out.print("Medio desplazamiento(Aire, Tierra, Agua): ");
                            scrolling = scan.next();

                            Vehicle vehicle = new Vehicle(nPassengers, tripulation, nWheels,
                                    date, scrolling);
                            vehicles.add(vehicle);

                            quantityVehicle += 1;

                            if(quantityVehicle >= 10){
                                repeatVehicle = false;
                                System.out.println("\n...Cantidad máxima de registros alcanzados (10)...");
                            }else{
                                System.out.print("\n¿Crear otro vehiculo?. Escriba S o N: ");
                                anotherVehicle = scan.next().toUpperCase();

                                if (!anotherVehicle.equals("S")) {
                                    repeatVehicle = false;
                                }
                            }
                        }
                        break;

                    case 2:
                        System.out.println("\nVehiculos registrados...");
                        if(!vehicles.isEmpty()){
                            System.out.println(vehicles);
                        }else{
                            System.out.println("No hay vehiculos registrados");
                        }
                        break;

                    case 3:
                        repeatMenu = false;
                        break;

                    default:
                        System.out.println(":::::Ingrese un valor de menu valido!:::::");
                }
            } while (repeatMenu);

        } catch (ParseException | NullPointerException
                | NumberFormatException | InputMismatchException exc) {
            System.out.println(exc.getMessage());
        }

    }

}
