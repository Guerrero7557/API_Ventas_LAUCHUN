package pe.idat.edu.lauchun.service;

import java.util.List;
import java.util.Optional;
import pe.idat.edu.lauchun.entity.DetallePedidoEntity;


public interface DetallePedidoService {
    // funcion que te permita mostrar todos los datos    
    List<DetallePedidoEntity> findAll();
    
    //funcion para mostrar todods los datos habilitados
    //List<DetallePedidoEntity> findAllCustom();
    
    //funcion para mostrar todods los datos habilitados
    List<DetallePedidoEntity> finxPedido(Long idpedido);
    
    //funcion para buscar por codigo
    Optional<DetallePedidoEntity> findById(Long id);
    
    //funcion para registrar datos
    DetallePedidoEntity add(DetallePedidoEntity d);
    
    //funcion para actualizar datos
    DetallePedidoEntity update(DetallePedidoEntity d);
    
    //funcion para eliminar datos
   // DetallePedidoEntity delete(DetallePedidoEntity d);
}
