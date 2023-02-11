package pe.idat.edu.lauchun.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.idat.edu.lauchun.entity.DetallePedidoEntity;

public interface DetallePedidoRepository extends JpaRepository<DetallePedidoEntity, Long>{   
    
    @Query(value ="{call buscardetallepedido(:xidpedido)}",nativeQuery=true)
    List<DetallePedidoEntity>finxPedido(@Param("xidpedido") Long xidpedido);
    
}
