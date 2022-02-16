package ejercicio5;

import java.util.Date;

/**
 * Reprenseta la clase Bike hereda de Vehicle 
 *
 * @version 1.00.00 2022-02-15
 * @author Kevin Luis Flórez Lozada.
 * @since 1.00.00
 */
public class Bike extends Vehicle {
    private boolean pedal;

    /**
     * constructor heredado de Vehicle, se agrega pedal
     * @param nPassengers
     * @param tripulation
     * @param nWheels
     * @param dateRegistration
     * @param scrolling
     * @param pedal 
     */
    public Bike(int nPassengers, boolean tripulation, int nWheels, Date dateRegistration, String scrolling, boolean pedal) {
        super(nPassengers, tripulation, nWheels, dateRegistration, scrolling);
        this.pedal = pedal;
    }

    public Bike( boolean pedal) {
        this.pedal = pedal;
    }

    public boolean getPedal() {
        return pedal;
    }

    public void setPedal(boolean pedal) {
        this.pedal = pedal;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                ", Número de pasajeros=" + getnPassengers() +
                ", Tripulación=" + getTripulation() +
                ", Número de ruedas=" + getnWheels() +
                ", Fecha de matricula='" + formatDate() + '\'' +
                ", Se desplaza por='" + getScrolling() + '\'' +
                "pedal=" + getPedal() +
                "}\n";
    }
}
