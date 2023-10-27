/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocios;

import AccesoDatos.ClienteDAO;
import java.sql.Connection;
import java.util.List;

public class ClienteService {
    private ClienteDAO clienteDAO;

    public ClienteService(Connection conexion) {
        clienteDAO = new ClienteDAO(conexion);
    }

    public void registrarCliente(int idPersona, int idCiudad, String fechaIngreso, String calificacion, String estado) {
        registrarCliente(idPersona, fechaIngreso, calificacion, estado);
    }


    // Agrega otros métodos de lógica de negocios según tus requerimientos

    public void registrarCliente(int idPersona, String fechaIngreso, String calificacion, String estado) {
        int idCiudad = 0;
        // Aquí puedes agregar validaciones de datos si es necesario
        clienteDAO.insertarCliente(idPersona, idCiudad, fechaIngreso, calificacion, estado);
    }
    // Agrega otros métodos de lógica de negocios según tus requerimientos
}

