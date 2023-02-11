package pe.idat.edu.lauchun.service;

import java.util.List;
import java.util.Optional;
import pe.idat.edu.lauchun.entity.ProductoEntity;

public interface ProductoService {
    
    List<ProductoEntity> findAll();
    
    
    List<ProductoEntity> findAllCustom();
    
    //buscar por categoria
    List<ProductoEntity> finCategoriaProd(Long xidcategoria);
    
    
    Optional<ProductoEntity> findById(Long id);
    
    
    ProductoEntity add (ProductoEntity p);
    
    
    ProductoEntity update (ProductoEntity p);
    
    
    ProductoEntity delete (ProductoEntity p);
        
}
