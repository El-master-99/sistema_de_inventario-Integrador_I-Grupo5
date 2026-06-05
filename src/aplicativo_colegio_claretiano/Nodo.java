/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicativo_colegio_claretiano;

/**
 *
 * @author Luis Daniel
 */
public class Nodo {
    public Equipo dato;
    public Nodo siguiente;

    public Nodo(Equipo equipo) {
        this.dato = equipo;
        this.siguiente = null;
    }
}

