
package aplicativo_colegio_claretiano;
import java.util.Stack;
/**
 *
 * @author Luis Daniel
 */


public class PilaEquipos {

    private Stack<Equipo> pila = new Stack<>();

    // Agregar equipo a la pila
    public void apilar(Equipo eq) {
        pila.push(eq);
    }

    // Sacar último equipo agregado
    public Equipo desapilar() {
        if (pila.isEmpty()) {
            return null;
        }
        return pila.pop();
    }

    // Ver el último de la pila
    public Equipo verTope() {
        if (pila.isEmpty()) {
            return null;
        }
        return pila.peek();
    }

    // Saber si está vacía
    public boolean estaVacia() {
        return pila.isEmpty();
    }

    // Tamaño
    public int tamano() {
        return pila.size();
    }
}
