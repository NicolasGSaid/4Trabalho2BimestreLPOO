package Model;

import java.util.List;
import java.util.ArrayList;

public class NotaFiscal {

    private String chaveAcesso;
    private String numero;
    private String serie;
    private String dataEmissao;
    private String dataSaida;
    private String protocolo;
    private String naturezaOperacao;

    private Destinatario destinatario;
    private Transportador transportador;
    private List<ProdutoServico> produtos;
    private CalculoImposto calculoImposto;
    private CalculoISSQN calculoISSQN;
    private DadosAdicionais dadosAdicionais;

    private double valorTotalProdutos;
    private double valorTotalImpostos;
    private double valorTotalNota;

    public NotaFiscal() {
        this.produtos = new ArrayList<>();
        this.valorTotalProdutos = 0.0;
        this.valorTotalImpostos = 0.0;
        this.valorTotalNota = 0.0;
    }

    public NotaFiscal(String chaveAcesso, String numero, String serie, String dataEmissao,
                      String dataSaida, String protocolo, String naturezaOperacao,
                      List<ProdutoServico> produtos, CalculoImposto calculoImposto, 
                      CalculoISSQN calculoISSQN, DadosAdicionais dadosAdicionais) {

        this.dadosAdicionais = dadosAdicionais;
        this.calculoISSQN = calculoISSQN;
        this.calculoImposto = calculoImposto;
        this.chaveAcesso = chaveAcesso;
        this.numero = numero;
        this.serie = serie;
        this.dataEmissao = dataEmissao;
        this.dataSaida = dataSaida;
        this.protocolo = protocolo;
        this.naturezaOperacao = naturezaOperacao;
        this.produtos = produtos != null ? produtos : new ArrayList<>();
        calcularTotais();
    }

    public void calcularTotais() {
        this.valorTotalProdutos = produtos.stream()
            .mapToDouble(prod -> prod.getValorTotal())
            .sum();

        this.valorTotalImpostos = calcularImpostos();
        this.valorTotalNota = valorTotalProdutos + valorTotalImpostos;
    }

    private double calcularImpostos() {
        double impostoICMS = calculoImposto != null ? calculoImposto.getValorICMS() : 0.0;
        double impostoISSQN = calculoISSQN != null ? calculoISSQN.getValorISSQN() : 0.0;
        return impostoICMS + impostoISSQN;
    }

    public double getValorTotalProdutos() {
        return valorTotalProdutos;
    }

    public double getValorTotalImpostos() {
        return valorTotalImpostos;
    }

    public double getValorTotalNota() {
        return valorTotalNota;
    }
    
    public String getChaveAcesso() {
        return chaveAcesso;
    }

    public void setChaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public String getNaturezaOperacao() {
        return naturezaOperacao;
    }

    public void setNaturezaOperacao(String naturezaOperacao) {
        this.naturezaOperacao = naturezaOperacao;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Destinatario destinatario) {
        this.destinatario = destinatario;
    }

    public Transportador getTransportador() {
        return transportador;
    }

    public void setTransportador(Transportador transportador) {
        this.transportador = transportador;
    }

    public List<ProdutoServico> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoServico> produtos) {
        this.produtos = produtos;
    }

    public CalculoImposto getCalculoImposto() {
        return calculoImposto;
    }

    public void setCalculoImposto(CalculoImposto calculoImposto) {
        this.calculoImposto = calculoImposto;
    }

    public CalculoISSQN getCalculoISSQN() {
        return calculoISSQN;
    }

    public void setCalculoISSQN(CalculoISSQN calculoISSQN) {
        this.calculoISSQN = calculoISSQN;
    }

    public DadosAdicionais getDadosAdicionais() {
        return dadosAdicionais;
    }

    public void setDadosAdicionais(DadosAdicionais dadosAdicionais) {
        this.dadosAdicionais = dadosAdicionais;
    }

    @Override
    public String toString() {
        return "NotaFiscal {" +
               "Número='" + numero + '\'' +
               ", Série='" + serie + '\'' +
               ", Data de Emissão='" + dataEmissao + '\'' +
               ", Data de Saída='" + dataSaida + '\'' +
               ", Protocolo='" + protocolo + '\'' +
               ", Natureza da Operação='" + naturezaOperacao + '\'' +
               ", Razão Social do Destinatário='" + (destinatario != null ? destinatario.getNome() : "Não Informado") + '\'' +
               ", CNPJ/CPF do Destinatário='" + (destinatario != null ? destinatario.getCnpjCpf() : "Não Informado") + '\'' +
               ", Valor Total='" + valorTotalNota + '\'' +
               '}';
    }
}