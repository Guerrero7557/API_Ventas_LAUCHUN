package pe.idat.edu.lauchun.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.lauchun.entity.DetallePedidoEntity;
import pe.idat.edu.lauchun.repository.DetallePedidoRepository;

@Service
public class DetallePedidoServiceImp implements DetallePedidoService{
    
    @Autowired
    private DetallePedidoRepository detallepedido;

    @Override
    public List<DetallePedidoEntity> findAll() {
        return detallepedido.findAll();
    }

    @Override
    public List<DetallePedidoEntity> finxPedido(Long xidpedido) {
        return detallepedido.finxPedido(xidpedido);
    }

    @Override
    public Optional<DetallePedidoEntity> findById(Long id) {
        return detallepedido.findById(id);
    }

    @Override
    public DetallePedidoEntity add(DetallePedidoEntity d) {
        return detallepedido.save(d);
    }

    @Override
    public DetallePedidoEntity update(DetallePedidoEntity d) {
        DetallePedidoEntity objdetallepedido = detallepedido.getById(d.getIddetalle());
        BeanUtils.copyProperties(d, objdetallepedido);
        return detallepedido.save(objdetallepedido);
    }
          
}
