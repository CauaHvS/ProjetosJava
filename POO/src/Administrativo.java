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
}
