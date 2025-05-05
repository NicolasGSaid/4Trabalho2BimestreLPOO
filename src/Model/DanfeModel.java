package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DanfeModel {
    
    private String numero;
    private String serie;
    private String folha;
    private Date dataEmissao;
    private Date dataEntrada;
    private Date dataSaida;
    private String horaSaida;
    private String tipoOperacao; // 0-Entrada, 1-Saída
    private String naturezaOperacao;
    private String protocolo;
    private String chaveAcesso;
    private String informacoesComplementares;
    private String observacoes;
    
    private RemetenteModel remetente;
    private DestinatarioModel destinatario;
    private TransporteModel transporte;
    private ImpostoModel imposto;
    private IssqnModel issqn;
    private List<ProdutoModel> produtos;

    public DanfeModel() {
    }

    public DanfeModel(String numero, String serie, String folha, Date dataEmissao, Date dataEntrada, Date dataSaida, String horaSaida, String tipoOperacao, String naturezaOperacao, String protocolo, String chaveAcesso, String informacoesComplementares, String observacoes, RemetenteModel remetente, DestinatarioModel destinatario, TransporteModel transporte, ImpostoModel imposto, IssqnModel issqn, List<ProdutoModel> produtos) {
        this.numero = numero;
        this.serie = serie;
        this.folha = folha;
        this.dataEmissao = dataEmissao;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.horaSaida = horaSaida;
        this.tipoOperacao = tipoOperacao;
        this.naturezaOperacao = naturezaOperacao;
        this.protocolo = protocolo;
        this.chaveAcesso = chaveAcesso;
        this.informacoesComplementares = informacoesComplementares;
        this.observacoes = observacoes;
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.transporte = transporte;
        this.imposto = imposto;
        this.issqn = issqn;
        this.produtos = produtos;
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

    public String getFolha() {
        return folha;
    }

    public void setFolha(String folha) {
        this.folha = folha;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }

    public String getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public String getNaturezaOperacao() {
        return naturezaOperacao;
    }

    public void setNaturezaOperacao(String naturezaOperacao) {
        this.naturezaOperacao = naturezaOperacao;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public String getChaveAcesso() {
        return chaveAcesso;
    }

    public void setChaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
    }

    public String getInformacoesComplementares() {
        return informacoesComplementares;
    }

    public void setInformacoesComplementares(String informacoesComplementares) {
        this.informacoesComplementares = informacoesComplementares;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public RemetenteModel getRemetente() {
        return remetente;
    }

    public void setRemetente(RemetenteModel remetente) {
        this.remetente = remetente;
    }

    public DestinatarioModel getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(DestinatarioModel destinatario) {
        this.destinatario = destinatario;
    }

    public TransporteModel getTransporte() {
        return transporte;
    }

    public void setTransporte(TransporteModel transporte) {
        this.transporte = transporte;
    }

    public ImpostoModel getImposto() {
        return imposto;
    }

    public void setImposto(ImpostoModel imposto) {
        this.imposto = imposto;
    }

    public IssqnModel getIssqn() {
        return issqn;
    }

    public void setIssqn(IssqnModel issqn) {
        this.issqn = issqn;
    }

    public List<ProdutoModel> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoModel> produtos) {
        this.produtos = produtos;
    }
    
    @Override
    public String toString() {
    return """          
             Numero: """ + numero + "\n" +
            "  Serie: " + serie + "\n" +
            "  Folha: " + folha + "\n" +
            "  Data Emissão: " + dataEmissao + "\n" +
            "  Data Entrada: " + dataEntrada + "\n" +
            "  Data Saída: " + dataSaida + "\n" +
            "  Hora Saída: " + horaSaida + "\n" +
            "  Tipo Operação: " + tipoOperacao + "\n" +
            "  Natureza Operação: " + naturezaOperacao + "\n" +
            "  Protocolo: " + protocolo + "\n" +
            "  Chave Acesso: " + chaveAcesso + "\n" +
            "  Informações Complementares: " + informacoesComplementares + "\n" +
            "  Observações: " + observacoes + "\n" +
            "  Destinatário: \n" + destinatario + "\n" +
            "  Remetente: \n" + remetente + "\n" +
            "  Transporte: \n" + transporte + "\n" +
            "  Imposto: " + imposto + "\n" +
            "  Issqn: " + issqn + "\n" +
            "  Produtos: " + produtos + "\n" +
            "}";
    }
}
