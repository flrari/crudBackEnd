package it.progetto.crud;

import it.progetto.crud.model.Dipendente;
import it.progetto.crud.service.DipendenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/dipendenti")
public class ApiDipendenti {

    @Autowired
    DipendenteService dipendenteService; //passo per il service

    @GetMapping("/all")
    public List<Dipendente> getAllDipendente(){
        return dipendenteService.findAllDipendente();
    }
    
    //@CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/find/{id}")
    public Dipendente getDipendenteById(@PathVariable("id") Long id){
        return dipendenteService.findDipendenteById(id);
    }

    @PostMapping("/add")
    public  Dipendente addDipendente(@RequestBody Dipendente dipendente){
        return dipendenteService.addDipendente(dipendente);
    }

}
