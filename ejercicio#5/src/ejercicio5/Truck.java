package ejercicio5;

import java.util.Date;

/**
 * Reprenseta la clase Truck hereda de Vehicle 
 *
 * @version 1.00.00 2022-02-15
 * @author Kevin Luis Flórez Lozada.
 * @since 1.00.00
 */
public class Truck extends Vehicle{
    private boolean trailer;

    /**
     * constructor heredado de Vehicle, se agrega trailer
     * @param nPassengers
     * @param tripulation
     * @param nWheels
     * @param dateRegistration
     * @param scrolling
     * @param trailer 
     */
    public Truck(int nPassengers, boolean tripulation, int nWheels, Date dateRegistration, String scrolling, boolean trailer) {
        super(nPassengers, tripulation, nWheels, dateRegistration, scrolling);
        this.trailer = trailer;
    }

    public Truck(boolean trailer) {
        this.trailer = trailer;
    }

    public boolean getTrailer() {
        return trailer;
    }

    public void setTrailer(boolean trailer) {
        this.trailer = trailer;
    }

    @Override
    public String toString() {
        return "Truck{" +
                ", Número de pasajeros=" + getnPassengers() +
                ", Tripulación=" + getTripulation() +
                ", Número de ruedas=" + getnWheels() +
                ", Fecha de matricula='" + formatDate() + '\'' +
                ", Se desplaza por='" + getScrolling() + '\'' +
                "trailer=" + getTrailer() +
                "}\n";
    }
}
