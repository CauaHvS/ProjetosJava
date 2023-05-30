public class Main {
    private Endereco e;

    public static void main(String[] args) {

        GradeHorario gradeHorarios = new GradeHorario();
        Endereco endereco1 = new Endereco("Rua A", "123", "Bairro X", "12345-678");

        // Criando um professor
        Professor professor1 = new Professor("João", "99999999", endereco1, "12345678901", 5000.0, 2, "Ciência da Computação");

        // Criando um funcionário administrativo
        Funcionario administrativo1 = new Administrativo("Carlos","7777777777",endereco1,"987654321",3500.0,"Secretario", "Secretaria");

        // Criando uma disciplina
        Disciplina disciplina1 = new Disciplina(1, "Programação I", 1, 2023, 60.0, 4);

        // Criando uma turma
        Turma turma1 = new Turma(1, disciplina1, professor1);

        // Criando alunos
        Aluno aluno1 = new Aluno("Maria", "88888888", "98765432109", "20230001", endereco1, "Ciência da Computação", 0.0, 1, null, null);
        Aluno aluno2 = new Aluno("Pedro", "77777777", "10987654321", "20230002", endereco1, "Ciência da Computação", 0.0, 1, null, null);

        // Adicionando alunos à turma
        turma1.adicionarAluno(aluno1);
        turma1.adicionarAluno(aluno2);

        // Exibindo informações da turma
        System.out.println("Turma: Código " + turma1.getCodigo() + ", Disciplina: " + turma1.getDisciplina().getNome() +
                ", Professor: " + turma1.getProfessor().getNome());
        System.out.println("Alunos matriculados na turma:");
        for (Aluno aluno : turma1.getAlunos()) {
            System.out.println("- " + aluno.getNome() + " (Matrícula: " + aluno.getMatricula() + ")");
        }

        // Removendo um aluno da turma
        turma1.removerAluno(aluno2);

        // Exibindo informações atualizadas da turma
        System.out.println("Alunos matriculados na turma após remoção:");
        for (Aluno aluno : turma1.getAlunos()) {
            System.out.println("- " + aluno.getNome() + " (Matrícula: " + aluno.getMatricula() + ")");
        }

        // Exibindo informações do funcionário administrativo
        System.out.println("Funcionário Administrativo: " + administrativo1.getNome() + ", CPF: " + administrativo1.getCPF() +
                ", Salário: R$" + administrativo1.getSalario() + ", Departamento: " + ((Administrativo) administrativo1).getDepartamento());
    }

}

