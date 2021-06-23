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
public class Factura {
    private int numero_factura;
    private Date f_emision;
    private float total;

    public Factura() {
    }

    public int getNumero_factura() {
        return numero_factura;
    }

    public void setNumero_factura(int numero_factura) {
        this.numero_factura = numero_factura;
    }

    public Date getF_emision() {
        return f_emision;
    }

    public void setF_emision(Date f_emision) {
        this.f_emision = f_emision;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    
}
