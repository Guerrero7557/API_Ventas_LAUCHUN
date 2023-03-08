package pe.idat.edu.lauchun.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.lauchun.Entity.UsuarioEntity;
import pe.idat.edu.lauchun.Repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository UsuRep;

    @Override
    public List<UsuarioEntity> findAll() {
        return UsuRep.findAll();
    }

    @Override
    public List<UsuarioEntity> findAllCustom() {
        return UsuRep.findAllCustom();
    }

    @Override
    public Optional<UsuarioEntity> findById(Long id) {
        return UsuRep.findById(id);
    }

    @Override
    public UsuarioEntity add(UsuarioEntity u) {
        return UsuRep.save(u);
    }

    @Override
    public UsuarioEntity update(UsuarioEntity u) {
        UsuarioEntity objusuario = UsuRep.getById(u.getIdusuario());
        BeanUtils.copyProperties(u, objusuario);
        return UsuRep.save(objusuario);
    }

    @Override
    public UsuarioEntity delete(UsuarioEntity u) {
        UsuarioEntity objusuario = UsuRep.getById(u.getIdusuario());
        objusuario.setEstado(false);
        return UsuRep.save(objusuario);
    }
}
