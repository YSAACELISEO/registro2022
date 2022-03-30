/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.serviciosrest.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.serviciosrest.entity.Cliente;
import pe.com.serviciosrest.repository.ClienteRepository;

/**
 *
 * @author Elias
 */
@Service
public class ClienteServiceImpl implements ClienteService {

      @Autowired
    private ClienteRepository clientetoRepository;
    
    
    @Override
    public List<Cliente> finAll() {
       return clientetoRepository.findAllCustom();
    }

    @Override
    public Optional<Cliente> findById(Long id) {
       return clientetoRepository.findById(id);
    }

    @Override
    public List<Cliente> finByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente add(Cliente c) {
        return clientetoRepository.save(c);
    }

    @Override
    public Cliente update(Cliente c) {
         Cliente objcliente = clientetoRepository.getById(c.getCodigo());
        BeanUtils.copyProperties(c, objcliente);
        return clientetoRepository.save(objcliente);
        
    }

    @Override
    public Cliente delete(Cliente c) {
     Cliente  objcliente = clientetoRepository.getById(c.getCodigo());
        objcliente.setEstado(false);
        return clientetoRepository.save(objcliente);
    }
    
}
