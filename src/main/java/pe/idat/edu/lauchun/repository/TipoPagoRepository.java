package pe.idat.edu.lauchun.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.idat.edu.lauchun.Entity.TipoPagoEntity;

public interface TipoPagoRepository  extends JpaRepository<TipoPagoEntity, Long>{
      @Query("select tp from TipoPagoEntity tp where tp.estado = true")
    List<TipoPagoEntity>findAllCustom();  
    
}
