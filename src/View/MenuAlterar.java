package View;

import Controller.DestinatarioController;
import Model.DanfeModel;
import java.util.Scanner;

public class MenuAlterar implements MenuInterface {

    private DestinatarioController destinatarioController = new DestinatarioController();
    private Scanner scanner = new Scanner(System.in);

    int opcaoSecundaria = 0;

    public void executarMenuAlterar() {
        while (opcaoSecundaria != 5) {
            System.out.println("\n----- Menu de Alterações -----");
            System.out.println("1. Alterar Destinatário de uma DANFE");
            System.out.println("2. Alterar Fatura");
            System.out.println("3. Alterar Cálculo do Imposto");
            System.out.println("4. Alterar Transportadora");
            System.out.println("5. Voltar");
            opcaoSecundaria = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoSecundaria) {
                case 1:
                    alterarDestinatario();
                    break;
                case 2:
                    // Implementar alteração de fatura
                    break;
                case 3:
                    // Implementar alteração de imposto
                    break;
                case 4:
                    // Implementar alteração de transportadora
                    break;
                case 5:
                    System.out.println("Saindo do Menu de Alterações...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void alterarDestinatario() {
        // Lista DANFES para o usuário escolher
        System.out.println("Escolha a DANFE para alterar o destinatário:");
        for (int i = 0; i < destinatarioController.listarDestinatarios().size(); i++) {
            System.out.println((i + 1) + ": " + destinatarioController.listarDestinatarios().get(i).toString());
        }

        int escolhaDanfe = scanner.nextInt();
        scanner.nextLine(); 

        if (escolhaDanfe > 0 && escolhaDanfe <= destinatarioController.listarDestinatarios().size()) {
            DanfeModel danfeSelecionada = destinatarioController.listarDanfes().get(escolhaDanfe - 1);

            // Chama o método para incluir destinatário
            destinatarioController.incluirDestinatario();

            // Associa o destinatário à DANFE
            danfeSelecionada.setDestinatario(destinatarioController.listarDestinatarios().get(destinatarioController.listarDestinatarios().size() - 1));

            System.out.println("Destinatário atualizado com sucesso na DANFE!");
        } else {
            System.out.println("Escolha inválida.");
        }
    }
}