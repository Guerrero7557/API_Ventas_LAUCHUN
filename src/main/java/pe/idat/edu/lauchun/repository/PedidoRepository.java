package pe.idat.edu.lauchun.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.idat.edu.lauchun.entity.PedidoEntity;

public interface PedidoRepository extends JpaRepository<PedidoEntity, Long>{
    @Query("select r from PedidoEntity r where r.estado = true")
    List<PedidoEntity> findAllCustom();
}