public class Administrador extends Funcionario {

	public Administrador(String nome, float salario) {
		super(nome, salario);
	}

    @Override
    public float calcular() {
		float aumentoDeSalario = 100;
		float novoSalario = getSalario() + aumentoDeSalario;
		setSalario(novoSalario);
		return novoSalario;
	}

}
