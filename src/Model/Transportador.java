
package Model;

public class Transportador {
    
    private String razaoSocial;
    private String endereco;
    private String municipio;
    private String uf;
    private String cnpjCpf;
    private String inscricaoEstadual;
    private String codigoANTT;
    private String placaVeiculo;
    private String ufPlaca;
    private String especie;
    private String marca;
    private int quantidade;
    private double pesoBruto;
    private double pesoLiquido;

    public Transportador() {
    }

    public Transportador(String razaoSocial, String endereco, String municipio, String uf, String cnpjCpf, String inscricaoEstadual, String codigoANTT, String placaVeiculo, String ufPlaca, String especie, String marca, int quantidade, double pesoBruto, double pesoLiquido) {
        this.razaoSocial = razaoSocial;
        this.endereco = endereco;
        this.municipio = municipio;
        this.uf = uf;
        this.cnpjCpf = cnpjCpf;
        this.inscricaoEstadual = inscricaoEstadual;
        this.codigoANTT = codigoANTT;
        this.placaVeiculo = placaVeiculo;
        this.ufPlaca = ufPlaca;
        this.especie = especie;
        this.marca = marca;
        this.quantidade = quantidade;
        this.pesoBruto = pesoBruto;
        this.pesoLiquido = pesoLiquido;
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

    public String getCodigoANTT() {
        return codigoANTT;
    }

    public void setCodigoANTT(String codigoANTT) {
        this.codigoANTT = codigoANTT;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public String getUfPlaca() {
        return ufPlaca;
    }

    public void setUfPlaca(String ufPlaca) {
        this.ufPlaca = ufPlaca;
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
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
