package br.com.site.gatinho.service;

import br.com.site.gatinho.modelo.Gato;
import br.com.site.gatinho.repos.GatoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class GatoService {

    @Autowired
    private GatoRepo repo;

    public Gato addGato(Gato gato){
        return repo.save(gato);
    }

    public Gato updateGato(Gato gato){
        return repo.save(gato);
    }

    public Gato findById(Long id){
        return repo.getById(id);
    }

    public void deletarGato(Long id){
        repo.deleteById(id);
    }

    public List<Gato> findGatoByNome(String nome){
        return repo.findGatoByNome(nome);
    }

    public List<Gato> findGatoByRaca(String raca){
        return repo.findGatoByRaca(raca);
    }

    public List<Gato> findAll(){
        return repo.findAll();
    }

}
