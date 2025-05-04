
package Model;

public class DestinatarioModel {
    private String razaoSocial;
    private String cnpjCpf;
    private String endereco;
    private String bairroDistrito;
    private String cep;
    private String municipio;
    private String uf;
    private String telefone;
    private String inscricaoEstadual;

    public DestinatarioModel() {
    }

    public DestinatarioModel(String razaoSocial, String cnpjCpf, String endereco, String bairroDistrito, String cep, String municipio, String uf, String telefone, String inscricaoEstadual) {
        this.razaoSocial = razaoSocial;
        this.cnpjCpf = cnpjCpf;
        this.endereco = endereco;
        this.bairroDistrito = bairroDistrito;
        this.cep = cep;
        this.municipio = municipio;
        this.uf = uf;
        this.telefone = telefone;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpjCpf() {
        return cnpjCpf;
    }

    public void setCnpjCpf(String cnpjCpf) {
        this.cnpjCpf = cnpjCpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairroDistrito() {
        return bairroDistrito;
    }

    public void setBairroDistrito(String bairroDistrito) {
        this.bairroDistrito = bairroDistrito;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    
}
