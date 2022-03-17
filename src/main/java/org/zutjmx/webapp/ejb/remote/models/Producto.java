package org.zutjmx.webapp.ejb.remote.models;

import java.io.Serializable;

public class Producto implements Serializable {

    static final long serialVersionUID = 4286256108L;

    public String nombre;

    public Producto() {
    }

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Producto {" +
                "nombre = '" + nombre + '\'' +
                '}';
    }
}
