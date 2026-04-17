
package recursos.aps1;


public interface PessoaService {
    void salva(Pessoa pessoa) throws Exception;
    void remover(Integer id) throws Exception;
    Pessoa busca(Integer id);
}