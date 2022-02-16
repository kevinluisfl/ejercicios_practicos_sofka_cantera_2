
package ejercicio1;

/**
 * Reprenseta la clase "PlanetarySystem" usada para crear los astros
 * @version 1.00.00 2022-02-15
 * @author Kevin Luis Flórez Lozada.
 * @since 1.00.00
 */
public class PlanetarySystem {
    /**
     * atributos caracteristicos de los astros a crear
     */
    private double mass;
    private double density;
    private double diameter;
    private double distanceSun;
    private int identifier;
    private String name;

    /**
     * constructor de los astros del sistema
     * @param mass masa tipo double
     * @param density desidad tipo double
     * @param diameter diametro tipo double
     * @param distanceSun distancia al sol tipo double
     * @param identifier identificador tipo int
     * @param name  nombre tipo String
     */
    public PlanetarySystem(double mass, double density, double diameter, double distanceSun, int identifier, String name) {
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distanceSun = distanceSun;
        this.identifier = identifier;
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getDistanceSun() {
        return distanceSun;
    }

    public void setDistanceSun(double distanceSun) {
        this.distanceSun = distanceSun;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
 
}
