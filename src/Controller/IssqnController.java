package Controller;

import Model.IssqnModel;
import java.util.ArrayList;
import java.util.Scanner;

public class IssqnController implements InterfaceController {

    private ArrayList<IssqnModel> listaIssqn = new ArrayList<>();

     public IssqnModel incluirIssqn() {
        IssqnModel issqn = new IssqnModel();
        
        System.out.println("Inscrição municipal");
        issqn.setInscricaoMunicipal(scanner.nextLine());
        
        System.out.print("Base de Cálculo do ISSQN: ");
        issqn.setBaseCalculoIssqn(Double.parseDouble(scanner.nextLine()));

        System.out.print("Valor total do serviço: ");
        issqn.setValorTotalServico(Double.parseDouble(scanner.nextLine()));

        System.out.print(" Valor do ISSQN: ");
        issqn.setValorIssqn(Double.parseDouble(scanner.nextLine()));

        System.out.println("ISSQN cadastrado com sucesso!");
        return issqn;
    }

    public void alterar() {
        System.out.print("Informe a inscrição municipal para alterar: ");
        String inscricao = scanner.nextLine();

        for (IssqnModel issqn : listaIssqn) {
            if (issqn.getInscricaoMunicipal().equalsIgnoreCase(inscricao)) {
                System.out.print("Novo valor total do serviço: ");
                issqn.setValorTotalServico(Double.parseDouble(scanner.nextLine()));

                System.out.print("Nova base de cálculo do ISSQN: ");
                issqn.setBaseCalculoIssqn(Double.parseDouble(scanner.nextLine()));

                System.out.print("Novo valor do ISSQN: ");
                issqn.setValorIssqn(Double.parseDouble(scanner.nextLine()));

                System.out.println("ISSQN alterado com sucesso!");
                return;
            }
        }

        System.out.println("Inscrição municipal não encontrada.");
    }
    
    public void exibirIssqn() {
        if (listaIssqn.isEmpty()) {
            System.out.println("Nenhum ISSQN cadastrado.");
        } else {
            for (IssqnModel i : listaIssqn) {
                System.out.println("\n********************************************");
                System.out.println("ISSQN: ");
                System.out.println(i);  // Agora formatado de forma legível
                System.out.println("********************************************\n");
            }
        }
    }
}
