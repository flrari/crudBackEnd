package it.progetto.crud.service;

import it.progetto.crud.model.Dipendente;
import it.progetto.crud.repository.DipendenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service //classe in cui vengono svolte delle operazioni di servizio, quindi interpretate da spring in un altro modo, con delle finalità diverse
public class DipendenteService {

    @Autowired
    DipendenteRepository dipendenteRepository;

    public List<Dipendente> findAllDipendente(){
        return dipendenteRepository.findAll();
    }

    public Dipendente addDipendente(Dipendente dipendente){
        dipendente.setEmployeeCode(UUID.randomUUID().toString());
        return dipendenteRepository.save(dipendente);
    }

    public Dipendente updateDipendente(Dipendente dipendente){
        return dipendenteRepository.save(dipendente);
    }

    public Dipendente findDipendenteById(Long id){
        return dipendenteRepository.findDipendenteById(id);
    }

    public void deleteDipendente(Long id){
        dipendenteRepository.deleteDipendenteById(id);
    }

}
