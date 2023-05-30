public class Administrativo extends Funcionario{
    private String cargo;
    private String departamento;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Administrativo() {
        this("","", null,"",null,"","");
    }

    public Administrativo(String nome, String telefone, Endereco endereco, String CPF, Double salario, String cargo, String departamento) {
        super(nome, telefone, endereco, CPF, salario);
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public void imprimirInformacoes() {

        System.out.println("Informações Gerais: ");
        System.out.println("Nome: " + getNome());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Endereço: " + getEndereco().getLogradouro() + ", " + getEndereco().getNumero() + ", " + getEndereco().getBairro() + ", " + getEndereco().getCEP());
        System.out.println("CPF: " + getCPF());
        System.out.println("Salário: " + getSalario());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Departamento: " + getDepartamento());
    }

}
