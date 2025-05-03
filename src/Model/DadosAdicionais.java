
package Model;


public class DadosAdicionais {
    
    private String informacoesComplementares;
    private String reservadoFisco;

    public DadosAdicionais() {
    }

    public DadosAdicionais(String informacoesComplementares, String reservadoFisco) {
        this.informacoesComplementares = informacoesComplementares;
        this.reservadoFisco = reservadoFisco;
    }

    public String getInformacoesComplementares() {
        return informacoesComplementares;
    }

    public void setInformacoesComplementares(String informacoesComplementares) {
        this.informacoesComplementares = informacoesComplementares;
    }

    public String getReservadoFisco() {
        return reservadoFisco;
    }

    public void setReservadoFisco(String reservadoFisco) {
        this.reservadoFisco = reservadoFisco;
    }
}
