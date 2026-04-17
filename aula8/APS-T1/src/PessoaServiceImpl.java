package recursos.aps1;

/**
 * Classe responsável pela camada de negócio.
 * Faz a ligação com a camada de dados.
 */
public class PessoaServiceImpl implements PessoaService, SalarioService {

    private BancoDados bancoDados;
    private static int contadorID = 0;

    // Inversão de dependência: recebe qualquer implementação de BancoDados
    public PessoaServiceImpl(BancoDados bancoDados) {
        this.bancoDados = bancoDados;
    }

    @Override
    public void salva(Pessoa pessoa) throws Exception {
        PessoaValidator.validar(pessoa); // validação separada
        pessoa.setId(contadorID++);
        bancoDados.salvar(pessoa);
    }

    @Override
    public void remover(Integer id) throws Exception {
        bancoDados.remover(id);
    }

    @Override
    public Pessoa busca(Integer id) {
        return bancoDados.buscar().stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public String calculaSalario() {
        StringBuilder retorno = new StringBuilder();
        for (Pessoa p : bancoDados.buscar()) {
            if (p instanceof PessoaFisica) {
                PessoaFisica pf = (PessoaFisica) p;
                retorno.append(pf.getNome())
                       .append(" salário total R$ ")
                       .append(calcularSalarioComBonus(pf.getSalario()))
                       .append("\n");
            }
        }
        return retorno.toString();
    }

    // Método auxiliar para cálculo de bônus → responsabilidade separada
    private Float calcularSalarioComBonus(Float salario) {
        if (salario < 1000) return salario + (salario * 0.02f);
        else if (salario < 3000) return salario + (salario * 0.04f);
        else return salario + (salario * 0.07f);
    }
}
