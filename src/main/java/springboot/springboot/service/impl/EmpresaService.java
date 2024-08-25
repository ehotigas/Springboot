package springboot.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import springboot.springboot.repository.EmpresaRepository;
import springboot.springboot.service.IEmpresaService;
import springboot.springboot.entity.Empresa;
import org.slf4j.LoggerFactory;
import java.util.Optional;
import org.slf4j.Logger;


public class EmpresaService implements IEmpresaService {
    @Autowired
    private EmpresaRepository empresaRepository;
    private static final Logger log = LoggerFactory.getLogger(EmpresaService.class);


    @Override
    public Optional<Empresa> buscarPorCnpj(String cnpj) {
        log.info("Buscando uma empresa para o CNPJ {}", cnpj);
        return Optional.ofNullable(empresaRepository.findByCnpj(cnpj));
    }

    @Override
    public Empresa persistir(Empresa empresa) {
        log.info("Persistindo empresa: {}", empresa);
        return this.empresaRepository.save(empresa);
    }
}
