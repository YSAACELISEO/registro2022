/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.serviciosrest.service;

import java.util.List;
import java.util.Optional;
import pe.com.serviciosrest.entity.Cliente;


public interface ClienteService {
       List<Cliente> finAll();

    Optional<Cliente> findById(Long id);

    List<Cliente> finByName(String name);

    Cliente add(Cliente c);

    Cliente update(Cliente c);

    Cliente delete(Cliente c);
}
