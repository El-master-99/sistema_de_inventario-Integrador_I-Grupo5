
package aplicativo_colegio_claretiano;
import java.util.Stack;
/**
 *
 * @author Luis Daniel
 */


public class PilaEquipos {

    private Stack<Equipo> pila = new Stack<>();

    public void apilar(Equipo eq) {
        pila.push(eq);
    }

    public Equipo desapilar() {
        if (pila.isEmpty()) {
            return null;
        }
        return pila.pop();
    }

    public Equipo verTope() {
        if (pila.isEmpty()) {
            return null;
        }
        return pila.peek();
    }

    public boolean estaVacia() {
        return pila.isEmpty();
    }
    public int tamano() {
        return pila.size();
    }
}
