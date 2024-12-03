package br.com.tarcyla.medicalconsult.consulta.repositories;

import br.com.tarcyla.medicalconsult.consulta.models.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

}

