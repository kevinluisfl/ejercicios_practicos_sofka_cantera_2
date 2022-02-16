package ejercicio5;

import java.util.Date;

/**
 * Reprenseta la clase Motorcycle hereda de Vehicle 
 *
 * @version 1.00.00 2022-02-15
 * @author Kevin Luis Flórez Lozada.
 * @since 1.00.00
 */
public class Motorcycle extends Vehicle {
    private boolean scalapie;

    /**
     * constructor heredado de Vehicle, se agrega scalapie
     * @param nPassengers
     * @param tripulation
     * @param nWheels
     * @param dateRegistration
     * @param scrolling
     * @param scalapie 
     */
    public Motorcycle(int nPassengers, boolean tripulation, int nWheels, Date dateRegistration, String scrolling, boolean scalapie) {
        super(nPassengers, tripulation, nWheels, dateRegistration, scrolling);
        this.scalapie = scalapie;
    }

    public Motorcycle(boolean scalapie) {
        this.scalapie = scalapie;
    }

    public boolean getScalapie() {
        return scalapie;
    }

    public void setScalapie(boolean scalapie) {
        this.scalapie = scalapie;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                ", Número de pasajeros=" + getnPassengers() +
                ", Tripulación=" + getTripulation() +
                ", Número de ruedas=" + getnWheels() +
                ", Fecha de matricula='" + formatDate() + '\'' +
                ", Se desplaza por='" + getScrolling() + '\'' +
                "scalapie=" + getScalapie() +
                "}\n";
    }
}
