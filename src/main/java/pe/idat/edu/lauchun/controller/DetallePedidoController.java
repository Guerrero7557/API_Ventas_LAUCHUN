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
import pe.idat.edu.lauchun.entity.DetallePedidoEntity;
import pe.idat.edu.lauchun.service.DetallePedidoService;


@RestController
@RequestMapping("/detallepedido")
public class DetallePedidoController {
    @Autowired
    private DetallePedidoService DetCompServ;
    
    @GetMapping
    public List<DetallePedidoEntity>findAll(){
        return DetCompServ.findAll();
    }
       
    
    
    @GetMapping("/{id}")
    public Optional<DetallePedidoEntity>findById(@PathVariable Long id ){
        return DetCompServ.findById(id);
    }
    
    @PostMapping
    public DetallePedidoEntity add(@RequestBody DetallePedidoEntity d){
        return DetCompServ.add(d);
    }
    
    @PutMapping("/{id}")
    public DetallePedidoEntity update(@PathVariable long id, @RequestBody DetallePedidoEntity d){
        d.setIddetalle(id);
        return DetCompServ.update(d);
    }    
    
    
    @GetMapping("/buscarxpedido/{xidpedido}")
    public List<DetallePedidoEntity>findxpedido(@PathVariable Long xidpedido){
        return DetCompServ.finxPedido(xidpedido);
    }
}
