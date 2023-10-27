/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;
import static AccesoDatos.ConexionBD.obtenerConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CiudadDAO {
    
    Connection conexion = obtenerConexion();
    CiudadDAO ciudadDAO = new CiudadDAO(conexion);

    public CiudadDAO(Connection conexion) {
        this.conexion = conexion;
    }

    public CiudadDAO() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void insertarCiudad(Ciudad city) {
        try {
            Connection conexion = null;
            String sql = "INSERT INTO ciudad (id, ciudad, departamento, postal) VALUES (?, ?, ?)";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1,  city.getCiudad());
            statement.setString(2, city.getDepartamento());
            statement.setString(3, city.getPostal());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Ciudad> obtenerTodasLasCiudades() throws SQLException {
        List<Ciudad> ciudades = new ArrayList<>();
        String sql = "SELECT * FROM ciudad";
        try (PreparedStatement statement = conexion.prepareStatement(sql);
             ResultSet result = statement.executeQuery()) {
            while (result.next()) {
                int id = result.getInt("id");
                String nombreCiudad = result.getString("nombreCiudad");
                String departamento = result.getString("departamento");
                String postal = result.getString("postal");

                Ciudad ciudad = new Ciudad(id, nombreCiudad, departamento, postal);
                ciudades.add(ciudad);
            }
        }
        return ciudades;
    }

    // Otros métodos para actualizar y eliminar ciudades según sea necesario
}

