package pe.idat.edu.lauchun.Service;

import java.util.List;
import java.util.Optional;
import pe.idat.edu.lauchun.Entity.ProductoEntity;

public interface ProductoService {
    
    List<ProductoEntity> findAll();
    
    
    List<ProductoEntity> findAllCustom();
    
    //buscar por categoria
    List<ProductoEntity> finCategoriaProd(Long xidcategoria);
    
    
    Optional<ProductoEntity> findById(Long id);
    
    
    ProductoEntity add (ProductoEntity p);
    
    
    ProductoEntity update (ProductoEntity p);
    
    
    public void deleteProducto(Long xid);
        
}
