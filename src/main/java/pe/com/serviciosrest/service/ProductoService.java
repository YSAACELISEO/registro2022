/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.serviciosrest.service;

import java.util.List;
import java.util.Optional;
import pe.com.serviciosrest.entity.Producto;

public interface ProductoService {

    List<Producto> findAll();

    Optional<Producto> findById(Long id);

    List<Producto> finByName(String name);

    Producto add(Producto p);

    Producto update(Producto p);

    Producto delete(Producto p);
}
