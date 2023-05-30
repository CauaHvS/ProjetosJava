public class Curso {
    private int codigo;
    private String nome;
    private int duração;

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

    public int getDuração() {
        return duração;
    }

    public void setDuração(int duração) {
        this.duração = duração;
    }

    public Curso() {
        this(0,"",0);
    }

    public Curso(int codigo, String nome, int duração) {
        this.codigo = codigo;
        this.nome = nome;
        this.duração = duração;
    }

    public void imprimirInformacoes() {
        System.out.println("Informaçãoes do curso:");
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Duração: " + getDuração() + " semestres");
    }
}
