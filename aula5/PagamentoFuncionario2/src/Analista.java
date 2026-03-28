public class Analista extends Funcionario {

	public Analista(String nome, float salario) {
		super(nome, salario);
	}

    @Override
    public float calcular() {
		float aumentoDeSalario = 400;
		float novoSalario = getSalario() + aumentoDeSalario;
		setSalario(novoSalario);
		return novoSalario;
	}

}
