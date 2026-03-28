public class SRE extends Funcionario {

	public SRE(String nome, float salario) {
		super(nome, salario);
	}

    @Override
    public float calcular() {
		float aumentoDeSalario = 500;
		float novoSalario = getSalario() + aumentoDeSalario;
		setSalario(novoSalario);
		return novoSalario;
	}

}
