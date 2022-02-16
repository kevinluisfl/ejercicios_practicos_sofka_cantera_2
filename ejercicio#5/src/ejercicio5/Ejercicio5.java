/**
Ejercicio #5
A partir de la clase anterior, y mediante herencia cree nuevas clases que 
* permitan diferenciar si el objeto es un coche, una moto, un camión, 
* una bicicleta, una lancha.Incluya en cada clase algún atributo específico 
* que la diferencie de las demás. Por ejemplo, para el coche un booleano que 
* determine si es de tres o cinco puertas, para el camión la altura 
* (indiferente en los otros vehículos), etc. Realice un programa como el del 
* ejercicio anterior capaz de trabajar con los distintos tipos de vehículos.
 */
package ejercicio5;

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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        /**
         * ArrayList para almacenar los diferentes vehiculos.
         */
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        ArrayList<Boat> boats = new ArrayList<>();
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Bike> bikes = new ArrayList<>();
        ArrayList<Motorcycle> motorcycles = new ArrayList<>();
        ArrayList<Truck> trucks = new ArrayList<>();

        /**
         * variables para atributos de vehiculo
         */
        int nPassengers, nWheels;
        String dateRegistration, scrolling;
        char tripulations;

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
                        boolean repeatVehicle = true, tripulation = false;
                        int quantityVehicle = vehicles.size();
                        char anotherVehicle;

                        while (repeatVehicle && (quantityVehicle < 10)) {
                            
                            System.out.print("\n:::Tipo Vehiculo a crear:::\n1. "
                                    + "Bicicleta\n2. Lancha\n3. Carro\n4. Moto\n"
                                    + "5. Camion\n6. Otro\nEscriba el tipo vehiculo a crear: ");
                            int decisionType = scan.nextInt();
                            
                            System.out.println("\nA continuación ingrese los datos del vehiculo " + (quantityVehicle + 1));

                            System.out.print("Número de pasajeros: ");
                            nPassengers = scan.nextInt();

                            System.out.print("¿Tiene tripulacion?. Escriba S o N: ");
                            tripulations = scan.next().toUpperCase().charAt(0);

                            if (tripulations == 'S') {
                                tripulation = true;
                            } 

                            System.out.print("Número de ruedas: ");
                            nWheels = scan.nextInt();

                            System.out.print("Introduzca la fecha con formato DD/MM/YYYY: ");
                            dateRegistration = scan.next();
                            Date date = df.parse(dateRegistration);

                            System.out.print("Medio desplazamiento(Aire, Tierra, Agua): ");
                            scrolling = scan.next();
                            
                            switch(decisionType){
                                case 1:
                                    /**
                                     * caso bicicleta
                                     */
                                    boolean pedals = false;
                                    System.out.print("¿Tiene pedales? Escriba S o N: ");
                                    char pedal = scan.next().toUpperCase().charAt(0);

                                    if (pedal == 'S') {
                                        pedals = true;
                                    }
                                    Bike bike = new Bike(nPassengers, tripulation, nWheels, 
                                            date, scrolling, pedals);
                                    bikes.add(bike);
                                    break;
                                case 2:
                                    /**
                                     * caso lancha
                                     */
                                    boolean anchors = false;
                                    System.out.print("¿Tiene ancla? Escriba S o N: ");
                                    char anchor = scan.next().toUpperCase().charAt(0);

                                    if (anchor == 'S') {
                                        anchors = true;
                                    }
                                    Boat boat = new Boat(nPassengers, tripulation, nWheels, 
                                            date, scrolling, anchors);
                                    boats.add(boat);
                                    break;
                                case 3:
                                    /**
                                     * caso carro
                                     */
                                    boolean doors = false;
                                    System.out.print("¿Tiene cuatro puertas? Escriba S o N: ");
                                    char door = scan.next().toUpperCase().charAt(0);

                                    if (door == 'S') {
                                        doors = true;
                                    }
                                    Car car = new Car(nPassengers, tripulation, nWheels, 
                                            date, scrolling, doors);
                                    cars.add(car);
                                    break;
                                case 4:
                                    /**
                                     * caso moto
                                     */
                                    boolean scalapies = false;
                                    System.out.print("¿Tiene escalapie? Escriba S o N: ");
                                    char scalapie = scan.next().toUpperCase().charAt(0);

                                    if (scalapie == 'S') {
                                        scalapies = true;
                                    }
                                    Motorcycle motorcycle = new Motorcycle(nPassengers, 
                                            tripulation, nWheels, date, scrolling, scalapies);
                                    motorcycles.add(motorcycle);
                                    break;
                                case 5:
                                    /**
                                     * caso camion
                                     */
                                    boolean trailers = false;
                                    System.out.print("¿Tiene trailer? Escriba S o N: ");
                                    char trailer = scan.next().toUpperCase().charAt(0);

                                    if (trailer == 'S') {
                                        trailers = true;
                                    }
                                    Truck truck = new Truck(nPassengers, tripulation, nWheels, 
                                            date, scrolling, trailers);
                                    trucks.add(truck);
                                    break;
                                default:
                                    /**
                                     * caso default vehiculo general
                                     */
                                    Vehicle vehicle = new Vehicle(nPassengers, tripulation, nWheels,
                                    date, scrolling);
                                    vehicles.add(vehicle);
                            }

                            quantityVehicle += 1;

                            if(quantityVehicle >= 10){
                                repeatVehicle = false;
                                System.out.println("\n...Cantidad máxima de registros alcanzados (10)...");
                            }else{
                                System.out.print("\n¿Crear otro vehiculo?. Escriba S o N: ");
                                anotherVehicle = scan.next().toUpperCase().charAt(0);

                                if (anotherVehicle != 'S') {
                                    repeatVehicle = false;
                                }
                            }
                        }
                        break;

                    case 2:
                        System.out.println("\n:::::::Vehiculos registrados:::::::");
                        boolean repeatList = true;
                        while(repeatList){
                            System.out.println("\n:::Tipo Vehiculo a Listar:::\n1. Bicicletas\n2. Lanchas\n"
                                    + "3. Carros\n4. Motos\n5. Camiones\n6. Otros\n7. Todos\n8. Salir\n"
                                    + "Escriba opcion a visualizar: ");
                            int decisionList = scan.nextInt();
                        
                            switch(decisionList){
                                case 1:
                                    System.out.println("\nBicicletas:");
                                    System.out.print(!bikes.isEmpty() 
                                    ? bikes : "No hay bicicletas registradas\n");
                                    break;
                                case 2:
                                    System.out.println("\nLanchas:");
                                    System.out.print(!boats.isEmpty() 
                                    ? boats : "No hay lanchas registradas\n");
                                    break;
                                case 3:
                                    System.out.println("\nCarros:");
                                    System.out.print(!cars.isEmpty() 
                                    ? cars : "No hay carros registrados\n");
                                    break;
                                case 4:
                                    System.out.println("\nMotos:");
                                    System.out.print(!motorcycles.isEmpty() 
                                    ? motorcycles : "No hay motos registradas\n");
                                    break;
                                case 5:
                                    System.out.println("\nCamiones:");
                                    System.out.print(!trucks.isEmpty() 
                                    ? trucks : "No hay camiones registrados\n");
                                    break;
                                case 6:
                                    System.out.println("\nVehiculos general:");
                                    System.out.print(!vehicles.isEmpty() 
                                    ? vehicles : "No hay vehiculos default registrados\n");
                                    break;
                                case 7:
                                    System.out.print(!bikes.isEmpty() ? bikes : "");
                                    System.out.print(!boats.isEmpty() ? boats : "");
                                    System.out.print(!cars.isEmpty() ? cars : "");
                                    System.out.print(!motorcycles.isEmpty() ? motorcycles : "");
                                    System.out.print(!trucks.isEmpty() ? trucks : "");
                                    System.out.print(!vehicles.isEmpty() ? vehicles : "");
                                    break;
                                default:
                                    repeatList = false;
                            }
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
