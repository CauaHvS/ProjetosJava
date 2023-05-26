public class Pessoa {

    private String nome;
    private String telefone;
    private Endereco endereco;
    private String CPF;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Pessoa() {
        this("","",null, "");
    }

    public Pessoa(String nome, String telefone, Endereco endereco, String CPF) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.CPF = CPF;
    }



}
