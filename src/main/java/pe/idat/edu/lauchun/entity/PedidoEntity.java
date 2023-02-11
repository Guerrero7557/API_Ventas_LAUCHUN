package pe.idat.edu.lauchun.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="PedidoEntity")
@Table(name="pedido")
public class PedidoEntity implements Serializable{
    
    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name="idpedido")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idpedido;
    
    @ManyToOne
     @JoinColumn(name="idcliente", nullable = false)
    private ClienteEntity idcliente;
    
    @Column(name="fechaventa")
    private String fechaventa;
    
    @Column(name="montototal")
    private double montototal;
    
    @Column(name="estado")
    private boolean estado;    
    
}
