package springboot.springboot.repository;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import springboot.springboot.entity.Funcionario;

@Transactional(readOnly = true)
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    Funcionario findByCpf(String cpf);
    
    Funcionario findByEmail(String email);

    Funcionario findByCpfOrEmail(String cpf, String email);
}
