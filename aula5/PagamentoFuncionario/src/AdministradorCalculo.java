public class AdministradorCalculo implements Calculo {
    @Override
    public float calcular(Funcionario funcionario) {
		float aumentoDeSalario = 100;
		float novoSalario = funcionario.getSalario() + aumentoDeSalario;
		funcionario.setSalario(novoSalario);
		return novoSalario;
	}

}
