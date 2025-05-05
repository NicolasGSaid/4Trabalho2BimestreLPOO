package Controller;

import Model.IssqnModel;
import java.util.ArrayList;
import java.util.Scanner;

public class IssqnController implements InterfaceController {

    private ArrayList<IssqnModel> listaIssqn = new ArrayList<>();

    public void incluirIssqn() {
        IssqnModel issqn = new IssqnModel();

        System.out.print("Digite a inscrição municipal: ");
        issqn.setInscricaoMunicipal(scanner.nextLine());

        System.out.print("Digite o valor total do serviço: ");
        issqn.setValorTotalServico(Double.parseDouble(scanner.nextLine()));

        System.out.print("Digite a base de cálculo do ISSQN: ");
        issqn.setBaseCalculoIssqn(Double.parseDouble(scanner.nextLine()));

        System.out.print("Digite o valor do ISSQN: ");
        issqn.setValorIssqn(Double.parseDouble(scanner.nextLine()));

        listaIssqn.add(issqn);
        System.out.println("ISSQN cadastrado com sucesso!");
    }

    public void incluir(IssqnModel issqn) {
        listaIssqn.add(issqn);
        System.out.println("ISSQN cadastrado com sucesso!");
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
