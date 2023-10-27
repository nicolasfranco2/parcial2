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

public class PersonaDAO {
    private Connection conexion;

    public PersonaDAO(Connection conexion) {
        this.conexion = conexion;
    }

    public void insertarPersona(String nombre, String apellido, String Tipodocumento, String NroDocumento, String direccion, String celular, String email) {
        try {
            String sql = "INSERT INTO persona (nombre, apellido, Tipodocumento, NroDocumento, direccion, celular, email) " +
                         "VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, nombre);
            statement.setString(2, apellido);
            statement.setString(3, Tipodocumento);
            statement.setString(4, NroDocumento);
            statement.setString(5, direccion);
            statement.setString(6, celular);
            statement.setString(7, email);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Persona> listarPersonas() {
        List<Persona> personas = new ArrayList<>();

        try {
            String sql = "SELECT * FROM persona";
            PreparedStatement statement = conexion.prepareStatement(sql);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                Persona persona = new Persona();
                persona.setId_persona(result.getInt("id"));
                persona.setNombre(result.getString("nombre"));
                persona.setApellido(result.getString("apellido"));
                persona.setTipodocumento(result.getString("Tipodocumento"));
                persona.setNroDocumento(result.getString("NroDocumento"));
                persona.setDireccion(result.getString("direccion"));
                persona.setCelular(result.getString("celular"));
                persona.setEmail(result.getString("email"));

                personas.add(persona);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return personas;
    }

    // Agrega métodos para actualizar y eliminar personas si es necesario

    public List<Persona> buscarPersonaPorNroDocumento(String nroDocumento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean agregarPersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Persona> obtenerTodasLasPersonas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


