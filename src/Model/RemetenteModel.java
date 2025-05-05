
package Model;


public class RemetenteModel {
    private String inscricaoEstadual;
    private String cnpj;
    private String razaoSocial;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private String telefone;

    public RemetenteModel() {
    }

    public RemetenteModel(String inscricaoEstadual, String cnpj, String razaoSocial, String endereco, String cidade, String estado, String cep, String telefone) {
        this.inscricaoEstadual = inscricaoEstadual;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public String toString() {
        return """
             Inscrição Estadual: """ + inscricaoEstadual + "\n" +
            "  CNPJ: " + cnpj + "\n" +
            "  Razão Social: " + razaoSocial + "\n" +
            "  Endereço: " + endereco + "\n" +
            "  Cidade: " + cidade + "\n" +
            "  Estado: " + estado + "\n" +
            "  CEP: " + cep + "\n" +
            "  Telefone: " + telefone + "\n" 
            ;
    }
}
