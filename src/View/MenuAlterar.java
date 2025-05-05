package View;

import Controller.DanfeController;
import Controller.DestinatarioController;
import Controller.ImpostoController;
import Controller.RemetenteController;
import Model.DanfeModel;
import Model.DestinatarioModel;
import Model.ImpostoModel;
import Model.RemetenteModel;
import Model.TransporteModel;
import java.util.Scanner;

public class MenuAlterar implements MenuInterface {

    private DestinatarioController destinatarioController = new DestinatarioController();
    private RemetenteController remetenteController = new RemetenteController();
    private DanfeController danfeController;
    private ImpostoController impostoController; 
    private Scanner scanner = new Scanner(System.in);
    private int opcaoSecundaria = 0;
    

    
    public MenuAlterar(DanfeController controller, ImpostoController impostoController) {
        this.danfeController = controller;
        this.impostoController = impostoController;
    }

    public void executarMenuAlterar() {
        while (opcaoSecundaria != 7) {
            System.out.println("\n----- Menu de Alterações -----");
            System.out.println("1. Alterar Destinatário de uma DANFE");
            System.out.println("2. Alterar Remetente de uma DANFE");
            System.out.println("3. Alterar Cálculo do Imposto");
            System.out.println("4. Alterar Impostos"); 
            System.out.println("5. Alterar Transportadora");
            System.out.println("6. Voltar");
            opcaoSecundaria = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoSecundaria) {
                case 1:
                    alterarDestinatario();
                    break;
                case 2:
                    alterarRemetente();
                    break;
                case 3:
                    alterarCalculoImposto();
                    break;
                case 4:
                    alterarImposto(); 
                    break;
                case 5:
                    alterarTransportadora();
                    break;
                case 6:
                    System.out.println("Saindo do Menu de Alterações...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void alterarDestinatario() {
        System.out.println("Escolha a DANFE para alterar o destinatário:");
        for (int i = 0; i < danfeController.getListaDanfes().size(); i++) {
            System.out.println((i + 1) + ": " + danfeController.getListaDanfes().get(i).toString());
        }

        int escolhaDanfe = scanner.nextInt();
        scanner.nextLine();

        if (escolhaDanfe > 0 && escolhaDanfe <= danfeController.getListaDanfes().size()) {
            DanfeModel danfeSelecionada = danfeController.getListaDanfes().get(escolhaDanfe - 1);

            DestinatarioModel novoDestinatario = destinatarioController.alterarDestinatario();
            danfeSelecionada.setDestinatario(novoDestinatario);

            System.out.println("Destinatário atualizado com sucesso na DANFE!");
        } else {
            System.out.println("Escolha inválida.");
        }
    }
    
    private void alterarCalculoImposto() { // Renamed method for consistency
        System.out.println("Escolha a DANFE para alterar o cálculo de imposto:");
        for (int i = 0; i < danfeController.getListaDanfes().size(); i++) {
            System.out.println((i + 1) + ": " + danfeController.getListaDanfes().get(i).toString());
        }

        int escolhaDanfe = scanner.nextInt();
        scanner.nextLine();

        if (escolhaDanfe > 0 && escolhaDanfe <= danfeController.getListaDanfes().size()) {
            DanfeModel danfeSelecionada = danfeController.getListaDanfes().get(escolhaDanfe - 1);
            
            ImpostoModel novoImposto = impostoController.alterarImposto(danfeSelecionada);
            danfeSelecionada.setImposto(novoImposto);

            System.out.println("Cálculo de imposto atualizado com sucesso na DANFE!");
        } else {
            System.out.println("Escolha inválida.");
        }
    }
    
    private void alterarRemetente() {
        System.out.println("Escolha a DANFE para alterar o remetente:");
        for (int i = 0; i < danfeController.getListaDanfes().size(); i++) {
            System.out.println((i + 1) + ": " + danfeController.getListaDanfes().get(i).toString());
        }

        int escolhaDanfe = scanner.nextInt();
        scanner.nextLine();

        if (escolhaDanfe > 0 && escolhaDanfe <= danfeController.getListaDanfes().size()) {
            DanfeModel danfeSelecionada = danfeController.getListaDanfes().get(escolhaDanfe - 1);

            RemetenteModel novoRemetente = remetenteController.alterarRemetente();
            danfeSelecionada.setRemetente(novoRemetente);

            System.out.println("Remetente atualizado com sucesso na DANFE!");
        } else {
            System.out.println("Escolha inválida.");
        }
    }
    
    private void alterarImposto() {
        System.out.println("Escolha a DANFE para alterar os impostos:");
        for (int i = 0; i < danfeController.getListaDanfes().size(); i++) {
            System.out.println((i + 1) + ": " + danfeController.getListaDanfes().get(i).toString());
        }

        int escolhaDanfe = scanner.nextInt();
        scanner.nextLine();

        if (escolhaDanfe > 0 && escolhaDanfe <= danfeController.getListaDanfes().size()) {
            DanfeModel danfeSelecionada = danfeController.getListaDanfes().get(escolhaDanfe - 1);

            ImpostoModel novoImposto = new ImpostoModel();
            System.out.print("Digite a base de cálculo do ICMS: ");
            novoImposto.setBaseCalculoIcms(Double.parseDouble(scanner.nextLine()));

            System.out.print("Digite o valor do ICMS: ");
            novoImposto.setValorIcms(Double.parseDouble(scanner.nextLine()));

            System.out.print("Digite a base de cálculo da substituição: ");
            novoImposto.setBaseCalculoSubstituicao(Double.parseDouble(scanner.nextLine()));

            System.out.print("Digite o valor da substituição: ");
            novoImposto.setValorSubstituicao(Double.parseDouble(scanner.nextLine()));

            System.out.print("Digite o valor total dos produtos: ");
            novoImposto.setValorTotalProdutos(Double.parseDouble(scanner.nextLine()));

            danfeSelecionada.setImposto(novoImposto);

            System.out.println("Impostos atualizados com sucesso na DANFE!");
        } else {
            System.out.println("Escolha inválida.");
        }
    }
    
    private void alterarTransportadora() {
    System.out.println("Escolha a DANFE para alterar a transportadora:");
    for (int i = 0; i < danfeController.getListaDanfes().size(); i++) {
        System.out.println((i + 1) + ": " + danfeController.getListaDanfes().get(i).toString());
    }

    int escolhaDanfe = scanner.nextInt();
    scanner.nextLine();

    if (escolhaDanfe > 0 && escolhaDanfe <= danfeController.getListaDanfes().size()) {
        DanfeModel danfeSelecionada = danfeController.getListaDanfes().get(escolhaDanfe - 1);

        TransporteModel novoTransporte = new TransporteModel();
        System.out.print("Digite a razão social da transportadora: ");
        novoTransporte.setRazaoSocial(scanner.nextLine());

        System.out.print("Digite o CNPJ ou CPF da transportadora: ");
        novoTransporte.setCnpjCpf(scanner.nextLine());

        System.out.print("Digite a inscrição estadual da transportadora: ");
        novoTransporte.setInscricaoEstadual(scanner.nextLine());

        System.out.print("Digite o endereço da transportadora: ");
        novoTransporte.setEndereco(scanner.nextLine());

        System.out.print("Digite o código ANTT: ");
        novoTransporte.setCodigoAntt(scanner.nextLine());

        System.out.print("Digite a placa do veículo: ");
        novoTransporte.setPlaca(scanner.nextLine());

        System.out.print("Digite a UF do veículo: ");
        novoTransporte.setUf(scanner.nextLine());

        System.out.print("Digite o frete por conta (0 - Emitente, 1 - Destinatário): ");
        novoTransporte.setFretePorConta(scanner.nextLine());

        danfeSelecionada.setTransporte(novoTransporte);

        System.out.println("Transportadora atualizada com sucesso na DANFE!");
    } else {
        System.out.println("Escolha inválida.");
    }
}
    
}