
package Model;


public class CalculoISSQN {
    
    private String inscricaoMunicipal;
    private double valorTotalServicos;
    private double valorISSQN;

    public CalculoISSQN() {
    }

    public CalculoISSQN(String inscricaoMunicipal, double valorTotalServicos, double valorISSQN) {
        this.inscricaoMunicipal = inscricaoMunicipal;
        this.valorTotalServicos = valorTotalServicos;
        this.valorISSQN = valorISSQN;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public double getValorTotalServicos() {
        return valorTotalServicos;
    }

    public void setValorTotalServicos(double valorTotalServicos) {
        this.valorTotalServicos = valorTotalServicos;
    }

    public double getValorISSQN() {
        return valorISSQN;
    }

    public void setValorISSQN(double valorISSQN) {
        this.valorISSQN = valorISSQN;
    }
}
