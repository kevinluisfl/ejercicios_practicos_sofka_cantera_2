package ejercicio1;

/**
 * Reprenseta la clase "Calculate" usada para las operaciones
 *
 * @version 1.00.00 2022-02-15
 * @author Kevin Luis Flórez Lozada.
 * @since 1.00.00
 */
public class Calculate {

    /**
     * valores finales hasta nuevo aviso científico
     */
    private final double gravity = 6.673E-11;
    private final double sunMass = 1.989 * 10E30;

    /**
     *
     * @param distance representa distancia entre los astros
     * @return la distancia al cuadrado tipo double
     */
    public double squareDistance(double distance) {
        return Math.pow(distance, 2);
    }

    /**
     * método para calculo de atracción gravitatoria de dos astros
     *
     * @param mass1 representa la masa del primer astro seleccionado
     * @param mass2 representa la masa del segundo astro seleccionado
     * @param distance representa la distancia entre ambos astros
     * @return cálculo resultante tipo double
     */
    public double attractionGravitatory(double mass1, double mass2, double distance) {
        return gravity * ((mass1 * mass2) / squareDistance(distance));
    }

    /**
     * método para calculo de atracción gravitatoria de un planeta respecto al
     * sol
     *
     * @param mass1 masa del planeta seleccionado
     * @param distance distancia al sol del planeta
     * @return cálculo resultante tipo double
     */
    public double attractionGravitatory(double mass1, double distance) {
        return gravity * ((mass1 * sunMass) / squareDistance(distance));
    }

}
