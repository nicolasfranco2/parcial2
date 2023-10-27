/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;


import java.util.Date;

public class Persona {
    public int id_persona;
    public String nombre;   
    public String apellido;
    public String Tipodocumento;
    public String NroDocumento;
    public String direccion;
    public String celular;
    public String email;
    public String estado;

    public Persona(int id_persona, String nombre, String apellido, String Tipodocumento, String NroDocumento, String direccion, String celular, String email, String estado) {
        this(nombre, apellido, Tipodocumento, NroDocumento, direccion, celular, email);
    }

    public Persona(String nombre, String apellido, String Tipodocumento, String NroDocumento, String direccion, String celular, String email) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.Tipodocumento = Tipodocumento;
        this.NroDocumento = NroDocumento;
        this.direccion = direccion;
        this.celular = celular;
        this.email = email;
        this.estado = estado;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipodocumento() {
        return Tipodocumento;
    }

    public void setTipodocumento(String Tipodocumento) {
        this.Tipodocumento = Tipodocumento;
    }

    public String getNroDocumento() {
        return NroDocumento;
    }

    public void setNroDocumento(String NroDocumento) {
        this.NroDocumento = NroDocumento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Persona() {
    }
    
    
    
    
    
}


