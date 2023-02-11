package pe.idat.edu.lauchun.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder  //Genera la clase 
@AllArgsConstructor //constructor con parametros
@NoArgsConstructor //constructor sin parametros
@Data               //genera getters and setters
@Entity(name = "DetallePedidoEntity")  //define la entidad con la que se va a trabajar
@Table(name = "detallepedido")
public class DetallePedidoEntity implements Serializable{
    
    private final static long serialVersionUID = 1L;
    
    @Id
    @Column(name = "iddetalle")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long iddetalle;     
    
    @ManyToOne
    @JoinColumn(name="idpedido", nullable = false)
    private PedidoEntity idpedido;
    
    @ManyToOne
    @JoinColumn(name="idproducto", nullable = false)
    private ProductoEntity idproducto;
    
    @Column(name = "cantidad")
    private int cantidad;
    
}
