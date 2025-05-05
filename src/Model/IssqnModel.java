
package Model;


public class IssqnModel {
    String inscricaoMunicipal;
    double valorTotalServico, baseCalculoIssqn, valorIssqn;

    public IssqnModel() {
    }

    public IssqnModel(String inscricaoMunicipal, double valorTotalServico, double baseCalculoIssqn, double valorIssqn) {
        this.inscricaoMunicipal = inscricaoMunicipal;
        this.valorTotalServico = valorTotalServico;
        this.baseCalculoIssqn = baseCalculoIssqn;
        this.valorIssqn = valorIssqn;
    }
    
    @Override
    public String toString() {
        return """

             Inscrição Municipal: """ + inscricaoMunicipal + "\n" +
            "  Valor Total Serviço: " + valorTotalServico + "\n" +
            "  Base Cálculo ISSQN: " + baseCalculoIssqn + "\n" +
            "  Valor ISSQN: " + valorIssqn + "\n" 
            ;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public double getValorTotalServico() {
        return valorTotalServico;
    }

    public void setValorTotalServico(double valorTotalServico) {
        this.valorTotalServico = valorTotalServico;
    }

    public double getBaseCalculoIssqn() {
        return baseCalculoIssqn;
    }

    public void setBaseCalculoIssqn(double baseCalculoIssqn) {
        this.baseCalculoIssqn = baseCalculoIssqn;
    }

    public double getValorIssqn() {
        return valorIssqn;
    }

    public void setValorIssqn(double valorIssqn) {
        this.valorIssqn = valorIssqn;
    }    
}
