package aplicativo_colegio_claretiano;
import java.util.HashMap;
import javax.swing.JFrame;

/**
 *
 * @author Luis Daniel
 */

public class grafos {

    private static HashMap<String, Class<? extends JFrame>> grafo = new HashMap<>();

    public static void registrar(String nombre, Class<? extends JFrame> clase) {
        grafo.put(nombre, clase);
    }

    public static void ir(String destino, JFrame actual) {
        try {
            // crear nueva instancia de la ventana
            JFrame nuevaVentana = grafo.get(destino).newInstance();
            nuevaVentana.setVisible(true);
            actual.dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

