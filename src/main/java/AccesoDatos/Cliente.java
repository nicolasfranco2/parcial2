/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;

/**
 *
 * @author Lenovo
 */
class Cliente {
    public int id_cliente;
    public String id_persona;   
    public String facha_ingreso;
    public String calificacion;
    public String estado;
    
  public Cliente(int id_cliente, String id_persona, String facha_ingreso, String calificacion, String estado) {
        this.id_cliente = id_cliente;
        this.id_persona = id_persona;
        this.facha_ingreso = facha_ingreso;
        this.calificacion = calificacion;
        this.estado = estado;
       
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getId_persona() {
        return id_persona;
    }

    public void setId_persona(String id_persona) {
        this.id_persona = id_persona;
    }

    public String getFacha_ingreso() {
        return facha_ingreso;
    }

    public void setFacha_ingreso(String facha_ingreso) {
        this.facha_ingreso = facha_ingreso;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente() {
    }
  
  
  
}

    