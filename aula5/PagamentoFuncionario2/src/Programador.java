public class Programador extends Funcionario {

	public Programador(String nome, float salario) {
		super(nome, salario);
	}

    @Override
    public float calcular() {
		float aumentoDeSalario = 200;
		float novoSalario = getSalario() + aumentoDeSalario;
		setSalario(novoSalario);
		return novoSalario;
	}

}
