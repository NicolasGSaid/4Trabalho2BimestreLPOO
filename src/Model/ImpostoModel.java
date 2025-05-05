
package Model;

public class ImpostoModel {
    private double baseCalculoIcms;
    private double valorIcms;
    private double baseCalculoSubstituicao;
    private double valorSubstituicao;
    private double valorTotalProdutos;
    private double valorFrete;
    private double valorSeguro;
    private double desconto;
    private double outrasDespesas;
    private double valorIpi;
    private double valorTotalImpostos;
    private double valorTotalNota;

    public ImpostoModel(double baseCalculoIcms, double valorIcms, double baseCalculoSubstituicao, double valorSubstituicao, double valorTotalProdutos, double valorFrete, double valorSeguro, double desconto, double outrasDespesas, double valorIpi, double valorTotalImpostos, double valorTotalNota) {
        this.baseCalculoIcms = baseCalculoIcms;
        this.valorIcms = valorIcms;
        this.baseCalculoSubstituicao = baseCalculoSubstituicao;
        this.valorSubstituicao = valorSubstituicao;
        this.valorTotalProdutos = valorTotalProdutos;
        this.valorFrete = valorFrete;
        this.valorSeguro = valorSeguro;
        this.desconto = desconto;
        this.outrasDespesas = outrasDespesas;
        this.valorIpi = valorIpi;
        this.valorTotalImpostos = valorTotalImpostos;
        this.valorTotalNota = valorTotalNota;
    }

    @Override
    public String toString() {
        return """ 
               Base de Cálculo ICMS: """ + baseCalculoIcms + "\n" +
            "  Valor ICMS: " + valorIcms + "\n" +
            "  Base de Cálculo Substituição: " + baseCalculoSubstituicao + "\n" +
            "  Valor Substituição: " + valorSubstituicao + "\n" +
            "  Valor Total Produtos: " + valorTotalProdutos + "\n" +
            "  Valor Frete: " + valorFrete + "\n" +
            "  Valor Seguro: " + valorSeguro + "\n" +
            "  Desconto: " + desconto + "\n" +
            "  Outras Despesas: " + outrasDespesas + "\n" +
            "  Valor IPI: " + valorIpi + "\n" +
            "  Valor Total Impostos: " + valorTotalImpostos + "\n" +
            "  Valor Total Nota: " + valorTotalNota + "\n" 
            ; 
    }
    
    public ImpostoModel() {
    }

    public double getBaseCalculoIcms() {
        return baseCalculoIcms;
    }

    public void setBaseCalculoIcms(double baseCalculoIcms) {
        this.baseCalculoIcms = baseCalculoIcms;
    }

    public double getValorIcms() {
        return valorIcms;
    }

    public void setValorIcms(double valorIcms) {
        this.valorIcms = valorIcms;
    }

    public double getBaseCalculoSubstituicao() {
        return baseCalculoSubstituicao;
    }

    public void setBaseCalculoSubstituicao(double baseCalculoSubstituicao) {
        this.baseCalculoSubstituicao = baseCalculoSubstituicao;
    }

    public double getValorSubstituicao() {
        return valorSubstituicao;
    }

    public void setValorSubstituicao(double valorSubstituicao) {
        this.valorSubstituicao = valorSubstituicao;
    }

    public double getValorTotalProdutos() {
        return valorTotalProdutos;
    }

    public void setValorTotalProdutos(double valorTotalProdutos) {
        this.valorTotalProdutos = valorTotalProdutos;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public double getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getOutrasDespesas() {
        return outrasDespesas;
    }

    public void setOutrasDespesas(double outrasDespesas) {
        this.outrasDespesas = outrasDespesas;
    }

    public double getValorIpi() {
        return valorIpi;
    }

    public void setValorIpi(double valorIpi) {
        this.valorIpi = valorIpi;
    }

    public double getValorTotalImpostos() {
        return valorTotalImpostos;
    }

    public void setValorTotalImpostos(double valorTotalImpostos) {
        this.valorTotalImpostos = valorTotalImpostos;
    }

    public double getValorTotalNota() {
        return valorTotalNota;
    }

    public void setValorTotalNota(double valorTotalNota) {
        this.valorTotalNota = valorTotalNota;
    }
    
    
}
