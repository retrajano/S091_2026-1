public class AnalistaCalculo implements Calculo {
    @Override
    public float calcular(Funcionario funcionario) {
		float aumentoDeSalario = 400;
		float novoSalario = funcionario.getSalario() + aumentoDeSalario;
		funcionario.setSalario(novoSalario);
		return novoSalario;
	}

}
