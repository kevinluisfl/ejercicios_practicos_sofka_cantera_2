/**
 * Ejercicio #1
 * Desarrolle una clase en Java que realice la abstracción de un sistema planetario,
 * debiendo tener en cuenta para cada cuerpo del sistema aspectos como: 
 * masa,densidad, diámetro, distancia al sol (suponga órbitas circulares), 
 * un número de identificador único y un nombre textual. 
 * Incluya métodos que calculen la atracción gravitatoria entre dos cuerpos cualesquiera del sistema.
 */
package ejercicio1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author kevinf
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String selection = null;
        boolean limit = false;
        
        Calcule calcule = new Calcule();

        ArrayList<PlanetarySystem> system = new ArrayList<>();
        PlanetarySystem sun = new PlanetarySystem(1.989 * 10E30, 1.41, 1390000, 0, 1, "Sol");
        PlanetarySystem mercury = new PlanetarySystem(3.285 * 10E23, 5.43, 4879, 5.79*10E10, 2, "Mercurio");
        PlanetarySystem venus = new PlanetarySystem(4.867 * 10E24, 5.24, 12104, 1.08*10E11, 3, "Venus");
        PlanetarySystem earth = new PlanetarySystem(5.972 * 10E24, 5.51, 12742, 1.49*10E11, 4, "Tierra");
        PlanetarySystem mars = new PlanetarySystem(6.39 * 10E23, 3.93, 6779, 2.27*10E11, 5, "Marte");
        PlanetarySystem jupiter = new PlanetarySystem(1.898 * 10E27, 1.33, 139820, 7.78*10E11, 6, "Júpiter");
        PlanetarySystem saturn = new PlanetarySystem(5.683 * 10E26, 0.7, 116460, 1.42*10E12, 7, "Saturno");
        PlanetarySystem uranus = new PlanetarySystem(8.681 * 10E25, 1.27, 50724, 2.78*10E12, 8, "Urano");
        PlanetarySystem neptune = new PlanetarySystem(1.024 * 10E26, 1.64, 49244, 4.30*10E12, 9, "Neptuno");
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

            int selectionMenu = JOptionPane.showOptionDialog(null, "Calcular atracción gravitatoria", "Menú",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"De dos astros", "Respecto al sol", "Cerrar"}, "opcion 1");

            switch (selectionMenu + 1) {
                case 1:
                String[] options = new String[system.size()];

                for (int i = 0; i < system.size(); i++) {
                    options[i] = system.get(i).getIdentifier() + ". " + system.get(i).getName();
                }

                String planet1 = (String) JOptionPane.showInputDialog(null, "Selecciona el primer planeta",
                        selection, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

                    int indexPlanet1 = Integer.parseInt(planet1.split(". ")[0]) - 1;

                String planet2 = (String) JOptionPane.showInputDialog(null, "Selecciona el segundo planeta",
                        selection, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

                    int indexPlanet2 = Integer.parseInt(planet2.split(". ")[0]) - 1;
                    
                    double attraction = calcule.attractionGravitatory(system.get(indexPlanet1).getMass(), system.get(indexPlanet2).getMass(), system.get(indexPlanet2).getDistanceSun());
                    System.out.println("La atraccion gravitatoria de "+system.get(indexPlanet1).getName()+
                            " y "+system.get(indexPlanet2).getName()+" es de: " + attraction + " N");
                break;

                case 2:
                    String[] option = new String[system.size()];

                    for (int i = 0; i < system.size(); i++) {
                        option[i] = system.get(i).getIdentifier() + ". " + system.get(i).getName();
                    }

                    double sunMass = 1.989 * 10E30;

                    String planet = (String) JOptionPane.showInputDialog(null, "Selecciona un planeta",
                            selection, JOptionPane.QUESTION_MESSAGE, null, option, option[1]);

                    int indexPlanet = Integer.parseInt(planet.split(". ")[0]) - 1;
                    double attractions = calcule.attractionGravitatory(system.get(indexPlanet).getMass(), sunMass, system.get(indexPlanet).getDistanceSun());
                    System.out.println("La atraccion gravitatoria de "+system.get(indexPlanet).getName()+
                            " y el Sol es de: " + attractions + " N");
                break;
                default:
                limit = true;
            }
        }

    }
    
}
