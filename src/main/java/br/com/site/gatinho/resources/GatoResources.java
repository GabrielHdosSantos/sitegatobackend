package br.com.site.gatinho.resources;

import br.com.site.gatinho.modelo.Gato;
import br.com.site.gatinho.service.GatoService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gato")
public class GatoResources {

    @Autowired
    private GatoService gatoService;


    @PostMapping
    public ResponseEntity<Gato> addGato(@RequestBody Gato gato){
        Gato newgato = gatoService.addGato(gato);

        return new ResponseEntity<>(newgato, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Gato> updateGato(@RequestBody Gato gato){
        Gato newgato = gatoService.updateGato(gato);

        return new ResponseEntity<>(newgato, HttpStatus.OK);
    }

    @GetMapping("/{nome}")
    public ResponseEntity<List<Gato>> findGatoByNome(@RequestParam("nome") String nome){
        List<Gato> gatos = gatoService.findGatoByNome(nome);

        return new ResponseEntity<>(gatos, HttpStatus.OK);
    }

    @GetMapping("/{raca}")
    public ResponseEntity<List<Gato>> findGatoByRaca(@RequestParam("raca") String raca){
        List<Gato> gatos = gatoService.findGatoByRaca(raca);

        return new ResponseEntity<>(gatos, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Gato>> all (){
        List<Gato> gatos = gatoService.findAll();

        return new ResponseEntity<>(gatos, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable("id") Long id){
        gatoService.deletarGato(id);
    }

}
