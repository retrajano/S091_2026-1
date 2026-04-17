package recursos.aps1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Classe que salva Pessoa em um mapa
public class BancoDadosMapa implements BancoDados {

    private Map<Integer, Pessoa> mapa = new HashMap<>();

    @Override
    public void salvar(Pessoa pessoa) {
        mapa.put(pessoa.getId(), pessoa);
    }

    @Override
    public void remover(Integer idPessoa) {
        mapa.remove(idPessoa);
    }

    @Override
    public Pessoa buscar(Pessoa pessoa) {
        return mapa.get(pessoa.getId());
    }

    @Override
    public List<Pessoa> buscar() {
        return mapa.values().stream().collect(Collectors.toList());
    }
}
	@Override
	public Pessoa buscar(Pessoa pe) {
		
		return m.get(pe.getId());
	}

	@Override
	public List<Pessoa> buscar() {	
		return new ArrayList<>(m.values());
	}

}
