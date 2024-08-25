package springboot.springboot.repository;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import springboot.springboot.entity.Lancamento;
import org.hibernate.annotations.NamedQueries;
import org.springframework.data.domain.Page;
import org.hibernate.annotations.NamedQuery;
import java.util.List;

@Transactional(readOnly = true)
@NamedQueries({
    @NamedQuery(
        name = "LancamentoRepository.findByFuncionarioId",
        query = "select lanc from lancamento lanc where lanc.funcionario.id = :funcionarioId"
    )
})
public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {
    List<Lancamento> findByFuncionarioId(@Param("funcionarioId") Long funcionarioId);

    Page<Lancamento> findByFuncionarioId(@Param("funcionarioId") Long funcionarioId, Pageable pageable);
}
