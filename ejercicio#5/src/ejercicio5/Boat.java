package ejercicio5;

import java.util.Date;

/**
 * Reprenseta la clase Boat hereda de Vehicle  
 *
 * @version 1.00.00 2022-02-15
 * @author Kevin Luis Flórez Lozada.
 * @since 1.00.00
 */
public class Boat extends Vehicle{
    private boolean anchors;

    /**
     * constructor heredado de Vehicle, se agrega anchors
     * @param nPassengers
     * @param tripulation
     * @param nWheels
     * @param dateRegistration
     * @param scrolling
     * @param anchors 
     */
    public Boat( int nPassengers, boolean tripulation, int nWheels, Date dateRegistration, String scrolling, boolean anchors) {
        super( nPassengers, tripulation, nWheels, dateRegistration, scrolling);
        this.anchors = anchors;
    }

    public Boat(boolean anchors) {
        this.anchors = anchors;
    }

    public boolean getAnchors() {
        return anchors;
    }

    public void setAnchors(boolean anchors) {
        this.anchors = anchors;
    }

    @Override
    public String toString() {
        return "Lancha{" +
                ", Número de pasajeros = " + getnPassengers() +
                ", Tripulación = " + getTripulation() +
                ", Número de ruedas = " + getnWheels() +
                ", Fecha de matricula = '" + formatDate() + '\'' +
                ", Se desplaza por = '" + getScrolling() + '\'' +
                "anchors = " + getAnchors() +
                "}\n";
    }
}
