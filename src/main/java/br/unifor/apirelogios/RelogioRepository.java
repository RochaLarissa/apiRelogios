package br.unifor.apirelogios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelogioRepository extends JpaRepository<RelogioEntity, Long>{

}
