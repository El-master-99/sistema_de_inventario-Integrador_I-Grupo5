package aplicativo_colegio_claretiano;

/**
 *
 * @author Luis Daniel
 */
public class ColaBaja {

    private Nodo frente;
    private Nodo fin;

    // Clase interna Nodo
    private class Nodo {
        Equipo dato;
        Nodo siguiente;

        public Nodo(Equipo dato) {
            this.dato = dato;
        }
    }

    // Verificar si la cola está vacía
    public boolean estaVacia() {
        return frente == null;
    }

    // insertar al final
    public void encolar(Equipo equipo) {
        Nodo nuevo = new Nodo(equipo);
        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    // sacar del inicio
    public Equipo desencolar() {
        if (estaVacia()) return null;

        Equipo dato = frente.dato;
        frente = frente.siguiente;

        if (frente == null) {
            fin = null; 
        }
        return dato;
    }

    // Ver el primer elemento 
    public Equipo verFrente() {
        return estaVacia() ? null : frente.dato;
    }
}
