package com.example.pedidos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer id_Carrito;
    private String fecha;
    private Double costo;
    private String status;
    private String direccion;

    public Integer getId() {
        return id;
    }

    public Integer getId_Carrito() {
        return id_Carrito;
    }

    public String getFecha() {
        return fecha;
    }

    public Double getCosto() {
        return costo;
    }

    public String getStatus() {
        return status;
    }

    public String getDireccion() {
        return direccion;
    }

    
    public void setId(Integer id) {
        this.id = id;
    }

    public void setId_Carrito(Integer id_Carrito) {
        this.id_Carrito = id_Carrito;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "|ID: " + id + "| |ID Carrito: " + id_Carrito + "| |Fecha: " + fecha + "| |Costo: " + costo + "| |Status: " + status + "| |Direccion: " + direccion + "|";
    }
}