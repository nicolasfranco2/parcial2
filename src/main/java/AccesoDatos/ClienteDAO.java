/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    private Connection conexion;

    public ClienteDAO(Connection conexion) {
        this.conexion = conexion;
    }

    public void insertarCliente(int idPersona, int idCiudad, String fechaIngreso, String calificacion, String estado) {
        try {
            String sql = "INSERT INTO cliente (id_persona, id_ciudad, fecha_ingreso, calificacion, estado) " +
                         "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, idPersona);
            statement.setInt(2, idCiudad);
            statement.setString(3, fechaIngreso);
            statement.setString(4, calificacion);
            statement.setString(5, estado);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();

        try {
            String sql = "SELECT * FROM cliente";
            PreparedStatement statement = conexion.prepareStatement(sql);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                Cliente cliente = new Cliente();
                cliente.setId_cliente(result.getInt("id"));
                cliente.setFacha_ingreso(result.getString("fecha_ingreso"));
                cliente.setCalificacion(result.getString("calificacion"));
                cliente.setEstado(result.getString("estado"));

                clientes.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return clientes;
    }

    // Agrega otros métodos para actualizar y eliminar clientes si es necesario
}

