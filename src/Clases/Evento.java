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
public class Evento {
    private int id;
    private Date fecha;
    private String puja;
    private String f_subasta;
    private String estatus;
    private int c_coleccionista;
    private int c_cliente;
    private int duracion;
    private String local;

    public Evento() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPuja() {
        return puja;
    }

    public void setPuja(String puja) {
        this.puja = puja;
    }

    public String getF_subasta() {
        return f_subasta;
    }

    public void setF_subasta(String f_subasta) {
        this.f_subasta = f_subasta;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public int getC_coleccionista() {
        return c_coleccionista;
    }

    public void setC_coleccionista(int c_coleccionista) {
        this.c_coleccionista = c_coleccionista;
    }

    public int getC_cliente() {
        return c_cliente;
    }

    public void setC_cliente(int c_cliente) {
        this.c_cliente = c_cliente;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
    
}
