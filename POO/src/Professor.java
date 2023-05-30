import java.util.ArrayList;

public class Professor extends Funcionario{
    private int titulacao;
    private String areaPesquisa;

    private ArrayList<Disciplina> disciplinasMinistradas;

    public int getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(int titulacao) {
        this.titulacao = titulacao;
    }

    public String getAreaPesquisa() {
        return areaPesquisa;
    }

    public void setAreaPesquisa(String areaPesquisa) {
        this.areaPesquisa = areaPesquisa;
    }

    public Professor() {
        this("","",null,"",null,0,"");
    }


    public Professor(String nome, String telefone, Endereco endereco, String CPF, Double salario, int titulacao, String areaPesquisa) {
        super(nome, telefone, endereco, CPF, salario);
        this.titulacao = titulacao;
        this.areaPesquisa = areaPesquisa;
    }

    public void adicionarDisciplinaMinistrada(Disciplina disciplina) {
        disciplinasMinistradas.add(disciplina);
    }

    public void removerDisciplinaMinistrada(Disciplina disciplina) {
        disciplinasMinistradas.remove(disciplina);
    }

    public void imprimirDisciplinasMinistradas() {
        System.out.println("Disciplinas ministradas pelo professor:");
        for (Disciplina disciplina : disciplinasMinistradas) {
            System.out.println("Código: " + disciplina.getCodigo());
            System.out.println("Nome: " + disciplina.getNome());
        }
    }
}
