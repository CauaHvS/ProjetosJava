import java.util.ArrayList;
import java.util.Date;

public class HorarioAula {
    private Date horaInicial;
    private Date horaFinal;
    private int diaSemana;
    private String sala;
    private String disciplina;
    private String professor;
    private ArrayList<Aluno> alunos;

    public Date getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(Date horaInicial) {
        this.horaInicial = horaInicial;
    }

    public Date getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Date horaFinal) {
        this.horaFinal = horaFinal;
    }

    public int getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(int diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public HorarioAula() {
        this(null, null, 0, "","","",null);
    }

    public HorarioAula(Date horaInicial, Date horaFinal, int diaSemana, String sala, String disciplina, String professor, ArrayList<Aluno> alunos) {
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.diaSemana = diaSemana;
        this.sala = sala;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = alunos;
    }
}
