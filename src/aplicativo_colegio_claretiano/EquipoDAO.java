package aplicativo_colegio_claretiano;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Daniel
 */
public class EquipoDAO {

    public List<Equipo> obtenerEquipos() {
        List<Equipo> lista = new ArrayList<>();

        String sql = """
            SELECT 
                e.id_equipo,
                e.numero_serie,
                t.nombre AS tipo,
                e.marca,
                e.modelo,
                est.descripcion AS estado,
                u.nombre AS ubicacion
            FROM equipos e
            JOIN cat_tipo_equipo t ON e.id_tipo = t.id_tipo
            JOIN cat_estado_equipo est ON e.id_estado = est.id_estado
            JOIN ubicaciones u ON e.id_ubicacion = u.id_ubicacion
        """;

        try (Connection cn = Conexion.getConexion();
             PreparedStatement ps = cn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Equipo eq = new Equipo(
                        rs.getInt("id_equipo"),
                        rs.getString("numero_serie"),
                        rs.getString("tipo"),
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getString("estado"),
                        rs.getString("ubicacion")
                );

                lista.add(eq);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return lista;
    }
}

