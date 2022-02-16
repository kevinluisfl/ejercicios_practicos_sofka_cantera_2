/**
 * Ejercicio #1
 * Desarrolle una clase en Java que realice la abstracción de un sistema 
 * planetario,teniendo en cuenta para cada cuerpo del sistema aspectos como:
 * masa,densidad, diámetro, distancia al sol (suponga órbitas circulares),
 * un número de identificador único y un nombre textual.
 * Incluya métodos que calculen la atracción gravitatoria entre dos cuerpos 
 * cualesquiera del sistema.
 */
package ejercicio1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Reprenseta la clase principal "Main"
 *
 * @version 1.00.00 2022-02-15
 * @author Kevin Luis Flórez Lozada.
 * @since 1.00.00
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String title = "Cálculo atracción gravitatoria";
        boolean limit = false;

        Calculate calculate = new Calculate();

        ArrayList<PlanetarySystem> system = new ArrayList<>();

        try {

            /**
             * creacion de astros del sistema solar para usar en los cálculos
             */
            PlanetarySystem sun = new PlanetarySystem(1.989 * 10E30, 1.41, 1390000, 0, 1, "Sol");
            PlanetarySystem mercury = new PlanetarySystem(3.285 * 10E23, 5.43, 4879, 5.79 * 10E10, 2, "Mercurio");
            PlanetarySystem venus = new PlanetarySystem(4.867 * 10E24, 5.24, 12104, 1.08 * 10E11, 3, "Venus");
            PlanetarySystem earth = new PlanetarySystem(5.972 * 10E24, 5.51, 12742, 1.49 * 10E11, 4, "Tierra");
            PlanetarySystem mars = new PlanetarySystem(6.39 * 10E23, 3.93, 6779, 2.27 * 10E11, 5, "Marte");
            PlanetarySystem jupiter = new PlanetarySystem(1.898 * 10E27, 1.33, 139820, 7.78 * 10E11, 6, "Júpiter");
            PlanetarySystem saturn = new PlanetarySystem(5.683 * 10E26, 0.7, 116460, 1.42 * 10E12, 7, "Saturno");
            PlanetarySystem uranus = new PlanetarySystem(8.681 * 10E25, 1.27, 50724, 2.78 * 10E12, 8, "Urano");
            PlanetarySystem neptune = new PlanetarySystem(1.024 * 10E26, 1.64, 49244, 4.30 * 10E12, 9, "Neptuno");

            system.add(sun);
            system.add(mercury);
            system.add(venus);
            system.add(earth);
            system.add(mars);
            system.add(jupiter);
            system.add(saturn);
            system.add(uranus);
            system.add(neptune);

            while (!limit) {
                /**
                 * menú para los cálculos
                 */
                int selectionMenu = JOptionPane.showOptionDialog(null, "Calcular atracción gravitatoria", "Menú",
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"De dos astros", "Respecto al sol", "Cerrar"}, "opcion 1");

                switch (selectionMenu + 1) {
                    case 1:
                        /**
                         * opcion para calcular atraccion entre 2 astros
                         * cualesquiera
                         */
                        String[] options = new String[system.size()];

                        for (int i = 0; i < system.size(); i++) {
                            options[i] = (i + 1) + ". " + system.get(i).getName();
                        }

                        /**
                         * planeta o astro 1
                         */
                        String selectPlanet1 = (String) JOptionPane.showInputDialog(null, "Selecciona el primer planeta",
                                title, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

                        int indexPlanet1 = Integer.parseInt(selectPlanet1.split(". ")[0]) - 1;

                        PlanetarySystem planet1 = system.get(indexPlanet1);

                        /**
                         * planeta o astro 2
                         */
                        String selectPlanet2 = (String) JOptionPane.showInputDialog(null, "Selecciona el segundo planeta",
                                title, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

                        int indexPlanet2 = Integer.parseInt(selectPlanet2.split(". ")[0]) - 1;

                        PlanetarySystem planet2 = system.get(indexPlanet2);

                        /**
                         * operaciones para obtener el cálculo de atracción
                         */
                        double distancePlanets = Math.abs(planet1.getDistanceSun() - planet2.getDistanceSun());

                        double attraction = calculate.attractionGravitatory(planet1.getMass(), planet2.getMass(), distancePlanets);

                        System.out.println("La atraccion gravitatoria de " + system.get(indexPlanet1).getName()
                                + " y " + system.get(indexPlanet2).getName() + " es de: " + attraction + " N");
                        JOptionPane.showMessageDialog(null, "La atraccion gravitatoria de " + system.get(indexPlanet1).getName()
                                + " y " + system.get(indexPlanet2).getName() + " es de: " + attraction + " N",
                                title, JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 2:
                        /**
                         * opcion para calcular atraccion respecto al sol
                         */
                        String[] option = new String[system.size()];

                        for (int i = 1; i < system.size(); i++) {
                            option[i - 1] = (i) + ". " + system.get(i).getName();
                        }

                        /**
                         * planeta a seleccionar
                         */
                        String selectPlanet = (String) JOptionPane.showInputDialog(null, "Selecciona un planeta",
                                title, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);

                        int indexPlanet = Integer.parseInt(selectPlanet.split(". ")[0]);

                        PlanetarySystem planet = system.get(indexPlanet);

                        /**
                         * cálculo atracción del planeta respecto al sol
                         */
                        double attractions = calculate.attractionGravitatory(planet.getMass(), planet.getDistanceSun());

                        System.out.println("La atraccion gravitatoria de " + planet.getName()
                                + " y el Sol es de: " + attractions + " N");
                        JOptionPane.showMessageDialog(null, "La atraccion gravitatoria de " + planet.getName()
                                + " y el Sol es de: " + attractions + " N",
                                title, JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        limit = true;
                }
            }
        } catch (NullPointerException | IndexOutOfBoundsException exc) {
            System.out.println(exc.getMessage());
        }

    }

}
