
package ejercicio1;

/**
 * Reprenseta la clase "PlanetarySystem" para crear los astros
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

    /**
     * getter mass
     * @return mass tipo double
     */
    public double getMass() {
        return mass;
    }

    /**
     * setter mass
     * @param mass tipo double 
     */
    public void setMass(double mass) {
        this.mass = mass;
    }

    /**
     * getter density
     * @return density tipo double
     */
    public double getDensity() {
        return density;
    }

    /**
     * setter density
     * @param density tipo double
     */
    public void setDensity(double density) {
        this.density = density;
    }

    /**
     * getter diameter
     * @return diameter tipo double
     */
    public double getDiameter() {
        return diameter;
    }

    /**
     * setter diameter
     * @param diameter tipo double 
     */
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    /**
     * getter distanceSun
     * @return distanceSun tipo double 
     */
    public double getDistanceSun() {
        return distanceSun;
    }

    /**
     * setter distanceSun
     * @param distanceSun tipo double 
     */
    public void setDistanceSun(double distanceSun) {
        this.distanceSun = distanceSun;
    }

    /**
     * getter identifier
     * @return identifier tipo int
     */
    public int getIdentifier() {
        return identifier;
    }

    /**
     * setter identifier
     * @param identifier tipo int
     */
    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    /**
     * getter name
     * @return name tipo String
     */
    public String getName() {
        return name;
    }

    /**
     * setter name
     * @param name tipo String 
     */
    public void setName(String name) {
        this.name = name;
    }
    
 
}
