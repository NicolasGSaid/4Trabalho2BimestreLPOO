package Controller;

import Model.NotaFiscal;
import Model.Destinatario;
import Model.Transportador;
import Model.CalculoImposto;
import Model.CalculoISSQN;

import java.util.List;

public interface NotaFiscalController {

    void incluirNotaFiscal(NotaFiscal notaFiscal);
    void alterarDestinatario(String numeroNfe, Destinatario novoDestinatario);
    void alterarTransportador(String numeroNfe, Transportador novoTransportador);
    void alterarCalculoImposto(String numeroNfe, CalculoImposto novoCalculoImposto);
    void alterarCalculoISSQN(String numeroNfe, CalculoISSQN novoCalculoISSQN);
    void alterarDadosAdicionais(String numeroNfe, String novaNaturezaOperacao, String novoProtocolo);
    void excluirNotaFiscal(String numeroNfe);
    
    NotaFiscal consultarPorNumero(String numeroNfe);
    List<NotaFiscal> consultarPorRazaoSocial(String razaoSocial);
    List<NotaFiscal> consultarPorDocumento(String cnpjOuCpf);
    List<NotaFiscal> consultarPorValorTotal(double valorTotal);
    List<NotaFiscal> consultarPorNumeroIntervalo(String numeroInicial, String numeroFinal);;
}
