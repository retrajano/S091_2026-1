public class Funcionario implements Calculo {
    protected String nome;
	protected float salario;
	
	public Funcionario(String nome, float salario) {
		this.nome = nome;
		this.salario = salario;
	}

    @Override
	public float calcular() {
		return salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + "]";
	}
}
