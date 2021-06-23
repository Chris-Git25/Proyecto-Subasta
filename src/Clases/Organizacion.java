/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author Christian
 */
public class Organizacion {
    private int id;
    private String nombre;
    private String proposito;
    private Date f_fundacion;
    private String p_web;
    private String email;
    private String telefono;
    private String alcance;
    private String tipo;

    public Organizacion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProposito() {
        return proposito;
    }

    public void setProposito(String proposito) {
        this.proposito = proposito;
    }

    public Date getF_fundacion() {
        return f_fundacion;
    }

    public void setF_fundacion(Date f_fundacion) {
        this.f_fundacion = f_fundacion;
    }

    public String getP_web() {
        return p_web;
    }

    public void setP_web(String p_web) {
        this.p_web = p_web;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    
}
