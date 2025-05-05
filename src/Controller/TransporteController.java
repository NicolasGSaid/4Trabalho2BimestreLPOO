package Controller;

import Model.TransporteModel;

import java.util.ArrayList;
import java.util.Scanner;

public class TransporteController {

    private final ArrayList<TransporteModel> listaTransportes = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

   public TransporteModel incluirTransporte() {
        TransporteModel transporte = new TransporteModel();

        System.out.print("Razão Social: ");
        transporte.setRazaoSocial(scanner.nextLine());

        System.out.print("Frete por Conta (0 - Emitente, 1 - Destinatário): ");
        transporte.setFretePorConta(scanner.nextLine());

        System.out.print("Código ANTT: ");
        transporte.setCodigoAntt(scanner.nextLine());

        System.out.print("Placa do veículo: ");
        transporte.setPlaca(scanner.nextLine());

        System.out.print("UF: ");
        transporte.setUf(scanner.nextLine());

        System.out.print("CNPJ ou CPF: ");
        transporte.setCnpjCpf(scanner.nextLine());

        System.out.print("Inscrição Estadual: ");
        transporte.setInscricaoEstadual(scanner.nextLine());

        System.out.print("Endereço: ");
        transporte.setEndereco(scanner.nextLine());

        System.out.println("Transporte cadastrado com sucesso!");
        return transporte;
    }

    public void incluir(TransporteModel transporte) {
        listaTransportes.add(transporte);
        System.out.println("Transporte cadastrado com sucesso!");
    }
    
    public void exibirTransportes() {
        if (listaTransportes.isEmpty()) {
            System.out.println("Nenhum transporte cadastrado.");
        } else {
            for (TransporteModel t : listaTransportes) {
                System.out.println("\n********************************************");
                System.out.println("TRANSPORTE:");
                System.out.println(t);  // Agora formatado com legibilidade
                System.out.println("********************************************\n");
            }
        }
    }
}
