package pe.idat.edu.lauchun.Controller;

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
import pe.idat.edu.lauchun.Entity.VentaEntity;
import pe.idat.edu.lauchun.Service.VentaService;


@RestController
@RequestMapping("/venta")
public class VentaController {
    
    @Autowired
    private VentaService  ventaRepository;
    
    @GetMapping
    public List<VentaEntity> findAll(){
        return ventaRepository.findAll();
    }
    
    @GetMapping("/custom")
    public List<VentaEntity>findAllCustom(){
        return ventaRepository.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<VentaEntity> findById(@PathVariable Long id){
        return ventaRepository.findById(id);
    }
    
    @PostMapping
    public VentaEntity add (@RequestBody VentaEntity v){
        return ventaRepository.add(v);
    }
    
    @PutMapping("{id}")
    public VentaEntity update(@PathVariable long id, @RequestBody VentaEntity v){
        v.setIdventa(id);
        return ventaRepository.update(v);
    }
    
    @DeleteMapping("/{id}")
    public VentaEntity delete(@PathVariable long id){
        VentaEntity objeventa= new VentaEntity();
        objeventa.setEstado(false);
        return ventaRepository.delete(VentaEntity.builder().idventa(id).build());
    }
    
}

