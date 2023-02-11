package pe.idat.edu.lauchun.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.lauchun.entity.ClienteEntity;
import pe.idat.edu.lauchun.repository.ClienteRepository;

@Service
public class ClienteServiceImp implements CienteService{
    
    @Autowired
    private ClienteRepository clirep;

    @Override
    public List<ClienteEntity> findAll() {
        return clirep.findAll();
    }

    @Override
    public List<ClienteEntity> findAllCustom() {
        return clirep.findAllCustom();
    }

    @Override
    public Optional<ClienteEntity> findById(Long id) {
        return clirep.findById(id);
    }

    @Override
    public ClienteEntity add(ClienteEntity c) {
        return clirep.save(c);
    }

    @Override
    public ClienteEntity update(ClienteEntity c) {
        ClienteEntity objcliente = clirep.getById(c.getIdcliente());
        BeanUtils.copyProperties(c, objcliente);
        return clirep.save(objcliente);
    }

    @Override
    public ClienteEntity delete(ClienteEntity c) {
        ClienteEntity objcliente = clirep.getById(c.getIdcliente());
        objcliente.setEstado(false);
        return clirep.save(objcliente);
    }
    
}
