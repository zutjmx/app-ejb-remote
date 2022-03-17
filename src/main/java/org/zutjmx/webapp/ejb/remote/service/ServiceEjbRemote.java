package org.zutjmx.webapp.ejb.remote.service;

import jakarta.ejb.Remote;
import org.zutjmx.webapp.ejb.remote.models.Producto;

import java.util.List;

@Remote
public interface ServiceEjbRemote {
    String saludar(String nombre);
    List<Producto> listar();
    Producto crear(Producto producto);
}
