package recursos.aps1;

import java.util.List;

public interface BancoDados {

    void salvar(Pessoa pessoa);

    void remover(Integer idPessoa);

    Pessoa buscar(Pessoa pessoa);

    List<Pessoa> buscar();
}