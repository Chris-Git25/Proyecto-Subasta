/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Christian
 */
public class Contacto extends Persona{
    private String cargo;
    private int id_organizacion;
    
    public Contacto() {
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getId_organizacion() {
        return id_organizacion;
    }

    public void setId_organizacion(int id_organizacion) {
        this.id_organizacion = id_organizacion;
    }
    
}
