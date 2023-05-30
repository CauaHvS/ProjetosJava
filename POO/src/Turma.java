import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int codigo;
    private Disciplina disciplina;
    private Professor professor;
    private List<Aluno> alunos;

    public Turma(int codigo, Disciplina disciplina, Professor professor) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public Turma() {
        this(0,null,null,null);
    }

    public Turma(int codigo, Disciplina disciplina, Professor professor, List<Aluno> alunos) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = alunos;
    }

    public void imprimirAlunosMatriculados() {
        System.out.println("Alunos matriculados na turma:");
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Matricula: " + aluno.getMatricula());
            // Imprimir outros detalhes do aluno, se necessário
        }
    }
}
