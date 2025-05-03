
package Model;

public class ProdutoServico {
    
    private String codigo;
    private String descricao;
    private String ncm;
    private String cst;
    private String cfop;
    private String unidade;
    private int quantidade;
    private double valorUnitario;
    private double valorTotal;
    private double baseICMS;
    private double valorICMS;
    private double baseICMSST;
    private double valorICMSST;
    private double valorIPI;
    private double aliquotaICMS;
    private double aliquotaIPI;
    private double valorTotalTributos;

    public ProdutoServico() {
    }

    public ProdutoServico(String codigo, String descricao, String ncm, String cst, String cfop, String unidade, int quantidade, double valorUnitario, double valorTotal, double baseICMS, double valorICMS, double baseICMSST, double valorICMSST, double valorIPI, double aliquotaICMS, double aliquotaIPI, double valorTotalTributos) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.ncm = ncm;
        this.cst = cst;
        this.cfop = cfop;
        this.unidade = unidade;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
        this.baseICMS = baseICMS;
        this.valorICMS = valorICMS;
        this.baseICMSST = baseICMSST;
        this.valorICMSST = valorICMSST;
        this.valorIPI = valorIPI;
        this.aliquotaICMS = aliquotaICMS;
        this.aliquotaIPI = aliquotaIPI;
        this.valorTotalTributos = valorTotalTributos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public String getCst() {
        return cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getBaseICMS() {
        return baseICMS;
    }

    public void setBaseICMS(double baseICMS) {
        this.baseICMS = baseICMS;
    }

    public double getValorICMS() {
        return valorICMS;
    }

    public void setValorICMS(double valorICMS) {
        this.valorICMS = valorICMS;
    }

    public double getBaseICMSST() {
        return baseICMSST;
    }

    public void setBaseICMSST(double baseICMSST) {
        this.baseICMSST = baseICMSST;
    }

    public double getValorICMSST() {
        return valorICMSST;
    }

    public void setValorICMSST(double valorICMSST) {
        this.valorICMSST = valorICMSST;
    }

    public double getValorIPI() {
        return valorIPI;
    }

    public void setValorIPI(double valorIPI) {
        this.valorIPI = valorIPI;
    }

    public double getAliquotaICMS() {
        return aliquotaICMS;
    }

    public void setAliquotaICMS(double aliquotaICMS) {
        this.aliquotaICMS = aliquotaICMS;
    }

    public double getAliquotaIPI() {
        return aliquotaIPI;
    }

    public void setAliquotaIPI(double aliquotaIPI) {
        this.aliquotaIPI = aliquotaIPI;
    }

    public double getValorTotalTributos() {
        return valorTotalTributos;
    }

    public void setValorTotalTributos(double valorTotalTributos) {
        this.valorTotalTributos = valorTotalTributos;
    }
    
    
    
}

