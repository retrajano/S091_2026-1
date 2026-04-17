package recursos.aps1;

public class Pessoa {

    protected String nome;      // nome da pessoa
    protected String endereco;  // endereço da pessoa
    protected Integer id;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
}
