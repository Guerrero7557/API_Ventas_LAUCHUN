package pe.idat.edu.lauchun.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.idat.edu.lauchun.entity.PedidoEntity;
import pe.idat.edu.lauchun.service.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
    
    @Autowired
    private PedidoService reservaservice;
    
    @GetMapping
    public List<PedidoEntity> findAll(){
        return reservaservice.findAll();
    }
    
    @GetMapping("/custom")
    public List<PedidoEntity> findAllCustom(){
        return reservaservice.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<PedidoEntity> findById(@PathVariable Long id){
        return reservaservice.findById(id);
    }
    
    @PostMapping
    public PedidoEntity add(@RequestBody PedidoEntity a){
        return reservaservice.add(a);
    }
    
    @PutMapping("/{id}")
    public PedidoEntity update(@PathVariable long id, @RequestBody PedidoEntity a){
        a.setIdpedido(id);
        return reservaservice.update(a);
    }
    
    @DeleteMapping("/{id}")
    public PedidoEntity delete(@PathVariable long id){
        PedidoEntity objApoderado = new PedidoEntity();
        objApoderado.setEstado(false);
        return reservaservice.delete(PedidoEntity.builder().idpedido(id).build());
    }
}