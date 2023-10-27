/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocios;

import AccesoDatos.Ciudad;
import AccesoDatos.CiudadDAO;
import AccesoDatos.ClienteDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class CiudadService {
    private CiudadDAO ciudadDAO;
  public CiudadService(Connection conexion) {
        ciudadDAO = new CiudadDAO(conexion);
    }
    public CiudadService(CiudadDAO ciudadDAO) {
        this.ciudadDAO = ciudadDAO;
    }

    public boolean insertarCiudad(Ciudad ciudad) throws SQLException {
    try {
        Connection conexion = null;
        String sql = "INSERT INTO ciudad (ciudad, departamento, postal) VALUES (?, ?, ?)";

        PreparedStatement statement = conexion.prepareStatement(sql);
        statement.setString(1, ciudad.getNombreCiudad());
        statement.setString(2, ciudad.getDepartamento());
        statement.setString(3, ciudad.getPostal());
        int filasAfectadas = statement.executeUpdate();
        
        return filasAfectadas > 0; // Devuelve true si se insertaron filas, false en caso contrario
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}

    public List<Ciudad> obtenerTodasLasCiudades() {
        try {
            return ciudadDAO.obtenerTodasLasCiudades();
        } catch (SQLException e) {
            // Maneja la excepción si ocurre algún error al obtener las ciudades de la base de datos
            e.printStackTrace();
            return null; // Puedes devolver una lista vacía o manejar el error de otra forma
        }
    }

    // Otros métodos para actualizar y eliminar ciudades según sea necesario
}