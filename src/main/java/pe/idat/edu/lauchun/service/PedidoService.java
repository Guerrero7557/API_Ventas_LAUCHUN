package pe.idat.edu.lauchun.service;

import pe.idat.edu.lauchun.entity.PedidoEntity;
import java.util.List;
import java.util.Optional;

public interface PedidoService {
    //funcion que te permita mostrar todos los datos
    List<PedidoEntity> findAll();
    //funcion que permita mostrar todos los datos habilitados
    List<PedidoEntity> findAllCustom();
    //funcion para poder buscar el codigo
    Optional<PedidoEntity>findById(Long id);
    //funcion para registrar datos
    PedidoEntity add(PedidoEntity p);
    //funcion para actualizar datos
    PedidoEntity update(PedidoEntity p);
    //funcion para eliminar datos
    PedidoEntity delete(PedidoEntity p);
}
