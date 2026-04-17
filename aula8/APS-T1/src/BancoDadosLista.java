package recursos.aps1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Classe que salva Pessoa em uma lista
public class BancoDadosLista implements BancoDados {

    private List<Pessoa> lista = new ArrayList<>();

    @Override
    public void salvar(Pessoa pessoa) {
        lista.add(pessoa);
    }

    @Override
    public void remover(Integer idPessoa) {
        Iterator<Pessoa> it = lista.iterator();
        while (it.hasNext()) {
            Pessoa p = it.next();
            if (p.getId().equals(idPessoa)) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public Pessoa buscar(Pessoa pessoa) {
        for (Pessoa p : lista) {
            if (p.getId().equals(pessoa.getId())) {
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Pessoa> buscar() {
        return lista;
    }
}