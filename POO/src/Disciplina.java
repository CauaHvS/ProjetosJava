import java.util.ArrayList;

public class Disciplina {
    private int codigo;
    private String nome;
    private int semestre;
    private int ano;
    private double cargaHoraria;
    private int creditos;

    private ArrayList<Aluno> alunos;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Disciplina() {
        this(0, "",0,0,0.0,0);
    }

    public Disciplina(int codigo, String nome, int semestre, int ano, double cargaHoraria, int creditos) {
        this.codigo = codigo;
        this.nome = nome;
        this.semestre = semestre;
        this.ano = ano;
        this.cargaHoraria = cargaHoraria;
        this.creditos = creditos;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public void imprimirAlunosMatriculados() {
        System.out.println("Alunos matriculados na disciplina:");
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Matricula: " + aluno.getMatricula());
            // Imprimir outros detalhes do aluno, se necessário
        }
    }
}
