/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;


public class Cuenta {
    public int id_cuenta;
    public String id_client;   
    public String NroCuenta;
    public String fechaAlta;
    public String tipodecuenta;
    public String estado;
    public String saldo;
    public String nrocuenta;
    public String nrocontrato;
    public String costoMantemiento;
    public String PrmoedioAcreditacion;
    public String moneda;
    
    public Cuenta(String id_client, String NroCuenta, String fechaAlta, String tipodecuenta, String estado, String saldo, String nrocuenta, String nrocontrato, String costoMantemiento) {
        this.id_cuenta = id_cuenta;
        this.id_client = id_client;
        this.NroCuenta = NroCuenta;
        this.fechaAlta = fechaAlta;
        this.tipodecuenta = tipodecuenta;
        this.estado = estado;
        this.saldo = saldo;
        this.nrocuenta = nrocuenta;
        this.nrocontrato = nrocontrato;
        this.costoMantemiento = costoMantemiento;
        this.PrmoedioAcreditacion = PrmoedioAcreditacion;
        this.moneda = moneda;
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public String getId_client() {
        return id_client;
    }

    public void setId_client(String id_client) {
        this.id_client = id_client;
    }

    public String getNroCuenta() {
        return NroCuenta;
    }

    public void setNroCuenta(String NroCuenta) {
        this.NroCuenta = NroCuenta;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getTipodecuenta() {
        return tipodecuenta;
    }

    public void setTipodecuenta(String tipodecuenta) {
        this.tipodecuenta = tipodecuenta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSaldo(double aDouble) {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getNrocuenta() {
        return nrocuenta;
    }

    public void setNrocuenta(String nrocuenta) {
        this.nrocuenta = nrocuenta;
    }

    public String getNrocontrato() {
        return nrocontrato;
    }

    public void setNrocontrato(String nrocontrato) {
        this.nrocontrato = nrocontrato;
    }

    public String getCostoMantemiento() {
        return costoMantemiento;
    }

    public void setCostoMantemiento(String costoMantemiento) {
        this.costoMantemiento = costoMantemiento;
    }

    public String getPrmoedioAcreditacion() {
        return PrmoedioAcreditacion;
    }

    public void setPrmoedioAcreditacion(String PrmoedioAcreditacion) {
        this.PrmoedioAcreditacion = PrmoedioAcreditacion;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public Cuenta() {
    }

}
