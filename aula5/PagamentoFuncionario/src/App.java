public class App {
    public static void main(String[] args) throws Exception {
        CalculaPagamento calculaPagamento = new CalculaPagamento();
		
		Funcionario programador = new Funcionario("Joao", 1000);
		System.out.println(calculaPagamento.calcular(
            new ProgramadorCalculo(), programador));

		Funcionario analista = new Funcionario("Maria", 2000);
		System.out.println(calculaPagamento.calcular(
            new AnalistaCalculo(), analista));    

        System.out.println(CalculaPagamento.calcular(new AnalistaCalculo(), analista));    
    }
}
