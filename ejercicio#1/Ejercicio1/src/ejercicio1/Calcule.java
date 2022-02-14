
package ejercicio1;

/**
 *
 * @author kevinf
 */
public class Calcule {
    
     double gravity = 6.673E-11;
     /**
     * 
     * @param distanceSun
     * @return 
     */
    public double squareDistance(double distanceSun){
        return Math.pow(distanceSun, 2);
    }
    
    public double attractionGravitatory(double mass1, double mass2, double distanceSun){
        return gravity * ((mass1 * mass2) / squareDistance(distanceSun));
    }
    
}
