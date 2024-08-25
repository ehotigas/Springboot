package springboot.springboot.repository;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import springboot.springboot.entity.Empresa;


public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
    @Transactional(readOnly = true)
    Empresa findByCnpj(String cnpj);    
}
