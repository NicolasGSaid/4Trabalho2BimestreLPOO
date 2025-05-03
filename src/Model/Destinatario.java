
package Model;

public class Destinatario {
    
    private String nome;
    private String endereco;
    private String municipio;
    private String uf;
    private String cep;
    private String cnpjCpf;
    private String inscricaoEstadual;

    public Destinatario() {
    }

    public Destinatario(String nome, String endereco, String municipio, String uf, String cep, String cnpjCpf, String inscricaoEstadual) {
        this.nome = nome;
        this.endereco = endereco;
        this.municipio = municipio;
        this.uf = uf;
        this.cep = cep;
        this.cnpjCpf = cnpjCpf;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCnpjCpf() {
        return cnpjCpf;
    }

    public void setCnpjCpf(String cnpjCpf) {
        this.cnpjCpf = cnpjCpf;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    
}
