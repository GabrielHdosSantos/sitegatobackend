package br.com.site.gatinho.repos;

import br.com.site.gatinho.modelo.Gato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GatoRepo extends JpaRepository<Gato, Long> {

    List<Gato> findGatoByNome(String nome);

    List<Gato> findGatoByRaca(String raca);

}
