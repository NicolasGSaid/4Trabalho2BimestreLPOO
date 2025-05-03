
package Model;

public class CalculoImposto {
    
    private double baseICMS;
    private double valorICMS;
    private double baseICMSST;
    private double valorICMSST;
    private double valorTotalProdutos;
    private double valorFrete;
    private double valorSeguro;
    private double desconto;
    private double outrasDespesas;
    private double valorIPI;
    private double valorTotalImpostos;
    private double valorTotalNota;

    public CalculoImposto() {
    }

    public CalculoImposto(double baseICMS, double valorICMS, double baseICMSST,
            double valorICMSST, double valorTotalProdutos, double valorFrete, 
            double valorSeguro, double desconto, double outrasDespesas, double valorIPI,
            double valorTotalImpostos, double valorTotalNota) {
        
        this.baseICMS = baseICMS;
        this.valorICMS = valorICMS;
        this.baseICMSST = baseICMSST;
        this.valorICMSST = valorICMSST;
        this.valorTotalProdutos = valorTotalProdutos;
        this.valorFrete = valorFrete;
        this.valorSeguro = valorSeguro;
        this.desconto = desconto;
        this.outrasDespesas = outrasDespesas;
        this.valorIPI = valorIPI;
        this.valorTotalImpostos = valorTotalImpostos;
        this.valorTotalNota = valorTotalNota;
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

    public double getValorIPI() {
        return valorIPI;
    }

    public void setValorIPI(double valorIPI) {
        this.valorIPI = valorIPI;
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
