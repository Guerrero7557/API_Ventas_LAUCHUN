package pe.idat.edu.lauchun.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import pe.idat.edu.lauchun.entity.PedidoEntity;
import org.springframework.stereotype.Service;
import pe.idat.edu.lauchun.repository.PedidoRepository;

@Service
public class PedidoServiceImpl implements PedidoService{
    //inyectar dependencias
    @Autowired
    private PedidoRepository reservarepository;
    
    @Override
    public List<PedidoEntity> findAll() {
        return reservarepository.findAll();
    }

    @Override
    public List<PedidoEntity> findAllCustom() {
        return reservarepository.findAllCustom();
    }

    @Override
    public Optional<PedidoEntity> findById(Long id) {
        return reservarepository.findById(id);
    }

    @Override
    public PedidoEntity add(PedidoEntity p) {
        return reservarepository.save(p);
    }

    @Override
    public PedidoEntity update(PedidoEntity p) {
        PedidoEntity objpedido = reservarepository.getById(p.getIdpedido());
        BeanUtils.copyProperties(p, objpedido);
        return reservarepository.save(objpedido);
    }

    @Override
    public PedidoEntity delete(PedidoEntity p) {
        PedidoEntity objpedido = reservarepository.getById(p.getIdpedido());
        objpedido.setEstado(false);
        return reservarepository.save(objpedido);
    }
    
}
