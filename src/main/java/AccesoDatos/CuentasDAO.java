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

import java.sql.Connection;

import java.util.List;

import java.util.ArrayList;

import java.util.List;


public class CuentasDAO {
    private Connection conexion;

    public CuentasDAO(Connection conexion) {
        this.conexion = conexion;
    }

    public void insertarCuenta(int idCliente, String nroCuenta, String fechaAlta, String tipoCuenta, String estado, double saldo) {
        try {
            String sql = "INSERT INTO cuentas (id_cliente, nro_cuenta, fecha_alta, tipo_cuenta, estado, saldo) " +
                         "VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, idCliente);
            statement.setString(2, nroCuenta);
            statement.setString(3, fechaAlta);
            statement.setString(4, tipoCuenta);
            statement.setString(5, estado);
            statement.setDouble(6, saldo);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Cuenta> listarCuentas() {
        List<Cuenta> cuentas = new ArrayList<>();

        try {
            String sql = "SELECT * FROM cuentas";
            PreparedStatement statement = conexion.prepareStatement(sql);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                Cuenta cuenta = new Cuenta();
                cuenta.setId_cuenta(result.getInt("id"));              
                cuenta.setNroCuenta(result.getString("nro_cuenta"));
                cuenta.setNrocontrato(result.getString("contrato"));
                cuenta.setFechaAlta(result.getString("fecha_alta"));
                cuenta.setCostoMantemiento(result.getString("manetnimiento"));
                cuenta.setPrmoedioAcreditacion(result.getString("pomedioAcreditacion"));
                cuenta.setTipodecuenta(result.getString("tipo_cuenta"));
                cuenta.setEstado(result.getString("estado"));
                cuenta.getSaldo(result.getDouble("saldo"));
                cuenta.setMoneda(result.getString("moneda"));

                

                cuentas.add(cuenta);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cuentas;
    }

    // Agrega otros métodos para actualizar y eliminar cuentas si es necesario

    public boolean agregarCuenta(Cuenta cuenta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Cuenta> obtenerTodasLasCuentas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Cuenta> buscarCuentaPorNroCuenta(String nroCuenta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
