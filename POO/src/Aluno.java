import java.util.List;

public class Aluno extends Pessoa{
    private String matricula;
    private Endereco endereco;
    private String curso;
    private Double mediaGlobal;
    private int status;
    private List<Disciplina> disciplinasCursando;
    private List<Disciplina> disciplinasACursar;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Double getMediaGlobal() {
        return mediaGlobal;
    }

    public void setMediaGlobal(Double mediaGlobal) {
        this.mediaGlobal = mediaGlobal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<Disciplina> getDisciplinasCursando() {
        return disciplinasCursando;
    }

    public void setDisciplinasCursando(List<Disciplina> disciplinasCursando) {
        this.disciplinasCursando = disciplinasCursando;
    }

    public List<Disciplina> getDisciplinasACursar() {
        return disciplinasACursar;
    }

    public void setDisciplinasACursar(List<Disciplina> disciplinasACursar) {
        this.disciplinasACursar = disciplinasACursar;
    }

    public Aluno() {
        this("","","","",null,"",0.0,0,null,null);
    }

    public Aluno(String nome, String telefone, String CPF, String matricula, Endereco endereco, String curso, Double mediaGlobal, int status, List<Disciplina> disciplinasCursando, List<Disciplina> disciplinasACursar) {
        super(nome, telefone, endereco, CPF);
        this.matricula = matricula;
        this.curso = curso;
        this.mediaGlobal = mediaGlobal;
        this.status = status;
        this.disciplinasCursando = disciplinasCursando;
        this.disciplinasACursar = disciplinasACursar;
    }

    public void adicionarDisciplinaCursando(Disciplina disciplina) {
        disciplinasCursando.add(disciplina);
    }

    public void removerDisciplinaCursando(Disciplina disciplina) {
        disciplinasCursando.remove(disciplina);
    }

    public void adicionarDisciplinaACursar(Disciplina disciplina) {
        disciplinasACursar.add(disciplina);
    }

    public void removerDisciplinaACursar(Disciplina disciplina) {
        disciplinasACursar.remove(disciplina);
    }

    public void imprimirDisciplinasCursando() {
        System.out.println("Disciplinas cursando:");
        for (Disciplina disciplina : disciplinasCursando) {
            System.out.println("Código: " + disciplina.getCodigo());
            System.out.println("Nome: " + disciplina.getNome());
        }
    }

    public void imprimirDisciplinasACursar() {
        System.out.println("Disciplinas a cursar:");
        for (Disciplina disciplina : disciplinasACursar) {
            System.out.println("Código: " + disciplina.getCodigo());
            System.out.println("Nome: " + disciplina.getNome());
        }
    }
}
