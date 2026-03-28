public class App {
    public static void main(String[] args) throws Exception {
        
		Funcionario programador = new Programador("Joao", 1000);
		Funcionario analista = new Analista("Maria", 1000);
        Funcionario administrador = new Administrador("Jose", 1000);
		Funcionario sre = new SRE("Ana", 1000);
        
        System.out.println(CalculaPagamento.calcular(sre));
        System.out.println(CalculaPagamento.calcular(analista));
        System.out.println(CalculaPagamento.calcular(programador));
        System.out.println(CalculaPagamento.calcular(administrador));
    }
}
