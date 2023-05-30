import java.util.ArrayList;

public class GradeHorario {
    private String curso;
    private int semestre;
    private int ano;
    private String turno;
    private ArrayList<HorarioAula> horarioAulas;

    private ArrayList<Aluno> alunos;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
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

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public ArrayList<HorarioAula> getHorarioAulas() {
        return horarioAulas;
    }

    public void setHorarioAulas(ArrayList<HorarioAula> horarioAulas) {
        this.horarioAulas = horarioAulas;
    }

    public GradeHorario() {
        this("",0,0,"",null);
    }

    public GradeHorario(String curso, int semestre, int ano, String turno, ArrayList<HorarioAula> horarioAulas) {
        this.curso = curso;
        this.semestre = semestre;
        this.ano = ano;
        this.turno = turno;
        this.horarioAulas = horarioAulas;
    }
    public void exibirQuadroHorarios() {
        System.out.println("Quadro de Horários:");

        if (alunos != null && !alunos.isEmpty()) {
            for (Aluno aluno : alunos) {
                aluno.getDisciplinasCursando();
                System.out.println("--------------------------");
            }
        } else {
            System.out.println("Nenhum aluno cadastrado na grade de horários.");
        }
}
}
