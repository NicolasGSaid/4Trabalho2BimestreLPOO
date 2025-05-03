package Controller;

import Model.*;
import java.util.ArrayList;
import java.util.List;

public class NotaFiscalControllerImpl implements NotaFiscalController {

    private List<NotaFiscal> notasFiscais = new ArrayList<>();

    @Override
    public void incluirNotaFiscal(NotaFiscal notaFiscal) {
        notasFiscais.add(notaFiscal);
    }

    @Override
    public void alterarDestinatario(String numeroNfe, Destinatario novoDestinatario) {
        for (NotaFiscal nota : notasFiscais) {
            if (nota.getNumero().equals(numeroNfe)) {
                nota.setDestinatario(novoDestinatario);
                break;
            }
        }
    }

    @Override
    public void alterarTransportador(String numeroNfe, Transportador novoTransportador) {
        for (NotaFiscal nota : notasFiscais) {
            if (nota.getNumero().equals(numeroNfe)) {
                nota.setTransportador(novoTransportador);
                break;
            }
        }
    }

    @Override
    public void alterarCalculoImposto(String numeroNfe, CalculoImposto novoCalculoImposto) {
        for (NotaFiscal nota : notasFiscais) {
            if (nota.getNumero().equals(numeroNfe)) {
                nota.setCalculoImposto(novoCalculoImposto);
                break;
            }
        }
    }

    @Override
    public void alterarDadosAdicionais(String numeroNfe, String novaNaturezaOperacao, String novoProtocolo) {
        for (NotaFiscal nota : notasFiscais) {
            if (nota.getNumero().equals(numeroNfe)) {
                nota.setNaturezaOperacao(novaNaturezaOperacao);
                nota.setProtocolo(novoProtocolo);
                break;
            }
        }
    }

    @Override
    public void excluirNotaFiscal(String numeroNfe) {
        notasFiscais.removeIf(nota -> nota.getNumero().equals(numeroNfe));
    }

    @Override
    public NotaFiscal consultarPorNumero(String numeroNfe) {
        for (NotaFiscal nota : notasFiscais) {
            if (nota.getNumero().equals(numeroNfe)) {
                return nota;
            }
        }
        return null;
    }

    @Override
    public List<NotaFiscal> consultarPorRazaoSocial(String razaoSocial) {
        List<NotaFiscal> resultado = new ArrayList<>();
        for (NotaFiscal nota : notasFiscais) {
            if (nota.getDestinatario().getNome().equalsIgnoreCase(razaoSocial)) {
                resultado.add(nota);
            }
        }
        return resultado;
    }

    @Override
    public List<NotaFiscal> consultarPorDocumento(String cnpjOuCpf) {
        List<NotaFiscal> resultado = new ArrayList<>();
        for (NotaFiscal nota : notasFiscais) {
            if (nota.getDestinatario().getCnpjCpf().equals(cnpjOuCpf)) {
                resultado.add(nota);
            }
        }
        return resultado;
    }

    @Override
    public List<NotaFiscal> consultarPorValorTotal(double valorTotal) {
        List<NotaFiscal> resultado = new ArrayList<>();
        for (NotaFiscal nota : notasFiscais) {
            if (nota.getValorTotalNota() == valorTotal) {
                resultado.add(nota);
            }
        }
        return resultado;
    }

    @Override
    public void alterarCalculoISSQN(String numeroNfe, CalculoISSQN novoCalculoISSQN) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}