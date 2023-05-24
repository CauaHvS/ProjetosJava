public class Endereco {
    private String logradouro;
    private String numero;
    private String bairro;
    private String CEP;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public Endereco() {
        this("","","", "");
    }

    public Endereco(String logradouro, String numero, String bairro, String CEP) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.CEP = CEP;
    }
}
