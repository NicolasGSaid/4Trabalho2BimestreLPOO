
package Model;


public class TransporteModel {
     private String razaoSocial;
    private String fretePorConta; // 0-Emitente, 1-Destinatário
    private String codigoAntt;
    private String placa;
    private String uf;
    private String cnpjCpf;
    private String inscricaoEstadual;
    private String endereco;
    private String municipio;
    private String quantidade;
    private String especie;
    private String marca;
    private double tonelagem;
    private double pesoBruto;
    private double pesoLiquido;

    public TransporteModel() {
    }

    public TransporteModel(String razaoSocial, String fretePorConta, String codigoAntt, String placa, String uf, String cnpjCpf, String inscricaoEstadual, String endereco, String municipio, String quantidade, String especie, String marca, double tonelagem, double pesoBruto, double pesoLiquido) {
        this.razaoSocial = razaoSocial;
        this.fretePorConta = fretePorConta;
        this.codigoAntt = codigoAntt;
        this.placa = placa;
        this.uf = uf;
        this.cnpjCpf = cnpjCpf;
        this.inscricaoEstadual = inscricaoEstadual;
        this.endereco = endereco;
        this.municipio = municipio;
        this.quantidade = quantidade;
        this.especie = especie;
        this.marca = marca;
        this.tonelagem = tonelagem;
        this.pesoBruto = pesoBruto;
        this.pesoLiquido = pesoLiquido;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getFretePorConta() {
        return fretePorConta;
    }

    public void setFretePorConta(String fretePorConta) {
        this.fretePorConta = fretePorConta;
    }

    public String getCodigoAntt() {
        return codigoAntt;
    }

    public void setCodigoAntt(String codigoAntt) {
        this.codigoAntt = codigoAntt;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
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

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTonelagem() {
        return tonelagem;
    }

    public void setTonelagem(double tonelagem) {
        this.tonelagem = tonelagem;
    }

    public double getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(double pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public double getPesoLiquido() {
        return pesoLiquido;
    }

    public void setPesoLiquido(double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }
    
    
}
