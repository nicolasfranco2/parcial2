/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;

import javax.swing.JTextField;

/**
 *
 * @author Lenovo
 */
public class Ciudad {
    public int id;
    public String ciudad;   
    public String departamento;
    public String postal;
private String nombre;

    public Ciudad(String nombre) {
        this.nombre = nombre;
;
    }
    public Ciudad(int id, String ciudad, String departamento, String postal) {
        this.id = id;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.postal = postal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public Ciudad() {
    }

    public String getNombreCiudad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
