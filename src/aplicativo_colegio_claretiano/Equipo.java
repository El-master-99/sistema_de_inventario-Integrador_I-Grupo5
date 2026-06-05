
package aplicativo_colegio_claretiano;

/**
 *
 * @author Luis Daniel
 */
public class Equipo {

    private int id;
    private String numeroSerie;
    private String tipo;       
    private String marca;
    private String modelo;
    private String estado;     
    private String ubicacion;  

    public Equipo(int id, String numeroSerie, String tipo, String marca,
                  String modelo, String estado, String ubicacion) {

        this.id = id;
        this.numeroSerie = numeroSerie;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;
        this.ubicacion = ubicacion;
    }

    public int getId() { 
        return id; 
    }

    public String getNumeroSerie() { 
        return numeroSerie; 
    }

    public String getTipo() { 
        return tipo; 
    }

    public String getMarca() { 
        return marca; 
    }

    public String getModelo() { 
        return modelo; 
    }

    public String getEstado() { 
        return estado; 
    }

    public String getUbicacion() { 
        return ubicacion; 
    }

    public void setNumeroSerie(String numeroSerie) {
    this.numeroSerie = numeroSerie;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

}

