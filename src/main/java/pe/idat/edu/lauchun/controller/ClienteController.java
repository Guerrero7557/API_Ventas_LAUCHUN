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
import pe.idat.edu.lauchun.entity.ClienteEntity;
import pe.idat.edu.lauchun.service.CienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    private CienteService reservaservice;
    
    @GetMapping
    public List<ClienteEntity> findAll(){
        return reservaservice.findAll();
    }
    
    @GetMapping("/custom")
    public List<ClienteEntity> findAllCustom(){
        return reservaservice.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<ClienteEntity> findById(@PathVariable Long id){
        return reservaservice.findById(id);
    }
    
    @PostMapping
    public ClienteEntity add(@RequestBody ClienteEntity a){
        return reservaservice.add(a);
    }
    
    @PutMapping("/{id}")
    public ClienteEntity update(@PathVariable long id, @RequestBody ClienteEntity a){
        a.setIdcliente(id);
        return reservaservice.update(a);
    }
    
    @DeleteMapping("/{id}")
    public ClienteEntity delete(@PathVariable long id){
        ClienteEntity objApoderado = new ClienteEntity();
        objApoderado.setEstado(false);
        return reservaservice.delete(ClienteEntity.builder().idcliente(id).build());
    }
    
    
}
