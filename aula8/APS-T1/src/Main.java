package recursos.aps1;

import javax.swing.JOptionPane;

public class Main {

    static PessoaServiceImpl serv;

    public static void main(String[] args) {
        String escolha = JOptionPane.showInputDialog("Selecione a forma de armazenamento\n1. Lista\n2. Mapa");

        if ("1".equals(escolha)) {
            serv = new PessoaServiceImpl(new BancoDadosLista());
        } else if ("2".equals(escolha)) {
            serv = new PessoaServiceImpl(new BancoDadosMapa());
        } else {
            JOptionPane.showMessageDialog(null, "Opção inválida para salvamento");
            System.exit(1);
        }

        while (true) {
            String opcao = JOptionPane.showInputDialog(menuPrincipal());
            switch (opcao) {
                case "1": cadastrarPessoaFisica(); break;
                case "2": cadastrarPessoaJuridica(); break;
                case "3": mostrarSalarios(); break;
                case "4": removerPessoa(); break;
                case "5": System.exit(0); break;
                default: JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        }
    }

    private static void removerPessoa() {
        String id = JOptionPane.showInputDialog("Qual id da pessoa para remover?");
        try {
            serv.remover(Integer.parseInt(id));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao remover pessoa");
        }
    }

    private static void mostrarSalarios() {
        JOptionPane.showMessageDialog(null, serv.calculaSalario());
    }

    private static void cadastrarPessoaJuridica() {
        String nome = JOptionPane.showInputDialog("Nome da empresa");
        String endereco = JOptionPane.showInputDialog("Endereço da empresa");
        String cnpj = JOptionPane.showInputDialog("CNPJ da empresa");

        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome(nome);
        pj.setEndereco(endereco);
        pj.setCnpj(cnpj);

        try {
            serv.salva(pj);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar empresa");
        }
    }

    private static void cadastrarPessoaFisica() {
        String nome = JOptionPane.showInputDialog("Nome da pessoa");
        String endereco = JOptionPane.showInputDialog("Endereço da pessoa");
        String cpf = JOptionPane.showInputDialog("CPF da pessoa");
        String salario = JOptionPane.showInputDialog("Salário da pessoa");

        PessoaFisica pf = new PessoaFisica();
        pf.setNome(nome);
        pf.setEndereco(endereco);
        pf.setCpf(cpf);
        pf.setSalario(Float.parseFloat(salario));

        try {
            serv.salva(pf);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar pessoa");
        }
    }

    public static String menuPrincipal() {
        return "Selecione uma opção\n" +
               "1. Cadastro pessoa física\n" +
               "2. Cadastro pessoa jurídica\n" +
               "3. Mostrar salários\n" +
               "4. Remover pessoa\n" +
               "5. Sair\n";
    }
}