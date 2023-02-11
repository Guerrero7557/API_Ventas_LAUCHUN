package pe.idat.edu.lauchun.service;

import java.util.List;
import java.util.Optional;
import pe.idat.edu.lauchun.entity.ClienteEntity;


public interface CienteService {
    //funcion que te permita mostrar todos los datos    
    List<ClienteEntity> findAll();
    
    //funcion para mostrar todods los datos habilitados
    List<ClienteEntity> findAllCustom();
    
    //funcion para buscar por codigo
    Optional<ClienteEntity> findById(Long id);
    
    //funcion para registrar datos
    ClienteEntity add(ClienteEntity c);
    
    //funcion para actualizar datos
    ClienteEntity update(ClienteEntity c);
    
    //funcion para eliminar datos
    ClienteEntity delete(ClienteEntity c);
}
