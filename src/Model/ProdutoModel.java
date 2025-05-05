
package Model;

public class ProdutoModel {
    
    String codigo, descricao, ncsh, cst, cfop, unidade;
    Double quantidade, valorUnitario, valorTotal, baseCalIcms,valorIpi,
           alicotaIcms, alicotaIpi;

    public ProdutoModel() {
    }

    public ProdutoModel(String codigo, String descricao, String ncsh, String cst, String cfop, String unidade, Double quantidade, Double valorUnitario, Double valorTotal, Double baseCalIcms, Double valorIpi, Double alicotaIcms, Double alicotaIpi) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.ncsh = ncsh;
        this.cst = cst;
        this.cfop = cfop;
        this.unidade = unidade;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
        this.baseCalIcms = baseCalIcms;
        this.valorIpi = valorIpi;
        this.alicotaIcms = alicotaIcms;
        this.alicotaIpi = alicotaIpi;
    }
    
    @Override
    public String toString() {
        return """
             Código: """ + codigo + "\n" +
            "  Descrição: " + descricao + "\n" +
            "  NCM/SH: " + ncsh + "\n" +
            "  CST: " + cst + "\n" +
            "  CFOP: " + cfop + "\n" +
            "  Unidade: " + unidade + "\n" +
            "  Quantidade: " + quantidade + "\n" +
            "  Valor Unitário: " + valorUnitario + "\n" +
            "  Valor Total: " + valorTotal + "\n" +
            "  Base de Cálculo ICMS: " + baseCalIcms + "\n" +
            "  Valor IPI: " + valorIpi + "\n" +
            "  Alíquota ICMS: " + alicotaIcms + "\n" +
            "  Alíquota IPI: " + alicotaIpi + "\n" 
            ;
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

    public String getNcsh() {
        return ncsh;
    }

    public void setNcsh(String ncsh) {
        this.ncsh = ncsh;
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

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double getBaseCalIcms() {
        return baseCalIcms;
    }

    public void setBaseCalIcms(Double baseCalIcms) {
        this.baseCalIcms = baseCalIcms;
    }

    public Double getValorIpi() {
        return valorIpi;
    }

    public void setValorIpi(Double valorIpi) {
        this.valorIpi = valorIpi;
    }

    public Double getAlicotaIcms() {
        return alicotaIcms;
    }

    public void setAlicotaIcms(Double alicotaIcms) {
        this.alicotaIcms = alicotaIcms;
    }

    public Double getAlicotaIpi() {
        return alicotaIpi;
    }

    public void setAlicotaIpi(Double alicotaIpi) {
        this.alicotaIpi = alicotaIpi;
    }    
}
