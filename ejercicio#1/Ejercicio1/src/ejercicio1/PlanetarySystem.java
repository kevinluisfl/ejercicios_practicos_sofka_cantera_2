
package ejercicio1;

/**
 *
 * @author kevinf
 */
public class PlanetarySystem {
    private double mass;
    private double density;
    private int diameter;
    private double distanceSun;
    private int identifier;
    private String name;

    public PlanetarySystem(double mass, double density, int diameter, double distanceSun, int identifier, String name) {
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

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
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
