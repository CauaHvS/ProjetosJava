public class Funcionario extends Pessoa{
    private Double Salario;

    public Double getSalario() {

        return Salario;
    }

    public void setSalario(Double salario) {
        Salario = salario;
    }

    public Funcionario() {
        this("", "",null, "",null);
    }

    public Funcionario(String nome, String telefone, Endereco endereco, String CPF, Double salario) {
        super(nome, telefone, endereco, CPF);
        Salario = salario;
    }
}
