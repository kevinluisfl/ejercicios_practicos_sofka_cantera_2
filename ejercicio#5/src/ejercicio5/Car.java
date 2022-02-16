package ejercicio5;

import java.util.Date;

/**
 * Reprenseta la clase Car hereda de Vehicle 
 *
 * @version 1.00.00 2022-02-15
 * @author Kevin Luis Flórez Lozada.
 * @since 1.00.00
 */
public class Car extends Vehicle {
    private boolean doors;

    /**
     * constructor heredado de Vehicle, se agrega doors
     * @param nPassengers
     * @param tripulation
     * @param nWheels
     * @param dateRegistration
     * @param scrolling
     * @param doors 
     */
    public Car(int nPassengers, boolean tripulation, int nWheels, Date dateRegistration, String scrolling, boolean doors) {
        super(nPassengers, tripulation, nWheels, dateRegistration, scrolling);
        this.doors = doors;
    }

    public Car(boolean doors) {
        this.doors = doors;
    }

    public boolean getDoors() {
        return doors;
    }

    public void setDoors(boolean doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Car{" +
                ", Número de pasajeros=" + getnPassengers() +
                ", Tripulación=" + getTripulation() +
                ", Número de ruedas=" + getnWheels() +
                ", Fecha de matricula='" + formatDate() + '\'' +
                ", Se desplaza por='" + getScrolling() + '\'' +
                "doors=" + getDoors() +
                "}\n";
    }
}
