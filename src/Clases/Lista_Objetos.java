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
public class Lista_Objetos {
    private int id;
    private float bid;
    private float ask;
    private float ganacia_minima;
    private float precio_alcanzado;
    private String orden;
    private int duracion;
    private String razon_venta;

    public Lista_Objetos() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getBid() {
        return bid;
    }

    public void setBid(float bid) {
        this.bid = bid;
    }

    public float getAsk() {
        return ask;
    }

    public void setAsk(float ask) {
        this.ask = ask;
    }

    public float getGanacia_minima() {
        return ganacia_minima;
    }

    public void setGanacia_minima(float ganacia_minima) {
        this.ganacia_minima = ganacia_minima;
    }

    public float getPrecio_alcanzado() {
        return precio_alcanzado;
    }

    public void setPrecio_alcanzado(float precio_alcanzado) {
        this.precio_alcanzado = precio_alcanzado;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getRazon_venta() {
        return razon_venta;
    }

    public void setRazon_venta(String razon_venta) {
        this.razon_venta = razon_venta;
    }
    
    
}
