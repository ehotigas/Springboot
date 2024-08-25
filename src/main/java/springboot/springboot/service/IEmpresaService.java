package springboot.springboot.service;

import springboot.springboot.entity.Empresa;
import java.util.Optional;


public interface IEmpresaService {
    Optional<Empresa> buscarPorCnpj(String cnpj);

    Empresa persistir(Empresa empresa);
}
