/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocios;

import AccesoDatos.Cuenta;
import AccesoDatos.CuentasDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CuentaService {
    private CuentasDAO cuentaDAO;

    public CuentaService(Connection conexion) {
        cuentaDAO = new CuentasDAO(conexion);
    }

    public boolean agregarCuenta(Cuenta cuenta) throws SQLException {
        return cuentaDAO.agregarCuenta(cuenta);
    }

    public List<Cuenta> obtenerTodasLasCuentas() throws SQLException {
        return cuentaDAO.obtenerTodasLasCuentas();
    }

    public List<Cuenta> buscarCuentaPorNroCuenta(String nroCuenta) throws SQLException {
        return cuentaDAO.buscarCuentaPorNroCuenta(nroCuenta);
    }

    // Otros métodos para actualizar y eliminar cuentas según sea necesario
}
