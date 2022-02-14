
package ejercicio1;

/**
 *
 * @author kevinf
 */
public class Calculate {
    
     final double gravity = 6.673E-11;
     /**
     * 
     * @param distance
     * @return 
     */
    public double squareDistance(double distance){
        return Math.pow(distance, 2);
    }
    
    public double attractionGravitatory(double mass1, double mass2, double distance){
        return gravity * ((mass1 * mass2) / squareDistance(distance));
    }
    
}
