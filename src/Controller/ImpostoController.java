package Controller;

import Model.ImpostoModel;
import java.util.ArrayList;
import java.util.Scanner;

public class ImpostoController implements InterfaceController {

    private final ArrayList<ImpostoModel> listaImpostos = new ArrayList<>();

    public void incluirImposto() {
        ImpostoModel imposto = new ImpostoModel();

        System.out.print("Digite a base de cálculo do ICMS: ");
        imposto.setBaseCalculoIcms(Double.parseDouble(scanner.nextLine()));

        System.out.print("Digite o valor do ICMS: ");
        imposto.setValorIcms(Double.parseDouble(scanner.nextLine()));

        System.out.print("Digite a base de cálculo da substituição: ");
        imposto.setBaseCalculoSubstituicao(Double.parseDouble(scanner.nextLine()));

        System.out.print("Digite o valor da substituição: ");
        imposto.setValorSubstituicao(Double.parseDouble(scanner.nextLine()));

        System.out.print("Digite o valor total dos produtos: ");
        imposto.setValorTotalProdutos(Double.parseDouble(scanner.nextLine()));

        System.out.print("Digite o valor do frete: ");
        imposto.setValorFrete(Double.parseDouble(scanner.nextLine()));

        System.out.print("Digite o valor do seguro: ");
        imposto.setValorSeguro(Double.parseDouble(scanner.nextLine()));

        System.out.print("Digite o valor do desconto: ");
        imposto.setDesconto(Double.parseDouble(scanner.nextLine()));

        System.out.print("Digite outras despesas acessórias: ");
        imposto.setOutrasDespesas(Double.parseDouble(scanner.nextLine()));

        System.out.print("Digite o valor do IPI: ");
        imposto.setValorIpi(Double.parseDouble(scanner.nextLine()));

        System.out.print("Digite o valor total dos impostos: ");
        imposto.setValorTotalImpostos(Double.parseDouble(scanner.nextLine()));

        System.out.print("Digite o valor total da nota: ");
        imposto.setValorTotalNota(Double.parseDouble(scanner.nextLine()));

        listaImpostos.add(imposto);
        System.out.println("Imposto cadastrado com sucesso!");
    }

    public void incluir(ImpostoModel imposto) {
        listaImpostos.add(imposto);
        System.out.println("Imposto cadastrado com sucesso!");
    }

    public void alterar() {
        System.out.print("Informe o índice do imposto a alterar: ");
        int indice = Integer.parseInt(scanner.nextLine());

        if (indice >= 0 && indice < listaImpostos.size()) {
            ImpostoModel imposto = listaImpostos.get(indice);

            System.out.print("Nova base de cálculo do ICMS: ");
            imposto.setBaseCalculoIcms(Double.parseDouble(scanner.nextLine()));

            System.out.print("Novo valor do ICMS: ");
            imposto.setValorIcms(Double.parseDouble(scanner.nextLine()));

            System.out.print("Nova base de cálculo da substituição: ");
            imposto.setBaseCalculoSubstituicao(Double.parseDouble(scanner.nextLine()));

            System.out.print("Novo valor da substituição: ");
            imposto.setValorSubstituicao(Double.parseDouble(scanner.nextLine()));

            System.out.print("Novo valor total dos produtos: ");
            imposto.setValorTotalProdutos(Double.parseDouble(scanner.nextLine()));

            System.out.print("Novo valor do frete: ");
            imposto.setValorFrete(Double.parseDouble(scanner.nextLine()));

            System.out.print("Novo valor do seguro: ");
            imposto.setValorSeguro(Double.parseDouble(scanner.nextLine()));

            System.out.print("Novo valor do desconto: ");
            imposto.setDesconto(Double.parseDouble(scanner.nextLine()));

            System.out.print("Novas outras despesas acessórias: ");
            imposto.setOutrasDespesas(Double.parseDouble(scanner.nextLine()));

            System.out.print("Novo valor do IPI: ");
            imposto.setValorIpi(Double.parseDouble(scanner.nextLine()));

            System.out.print("Novo valor total dos impostos: ");
            imposto.setValorTotalImpostos(Double.parseDouble(scanner.nextLine()));

            System.out.print("Novo valor total da nota: ");
            imposto.setValorTotalNota(Double.parseDouble(scanner.nextLine()));

            System.out.println("Imposto alterado com sucesso!");
        } else {
            System.out.println("Índice inválido.");
        }
    }
    
    public void exibirImpostos() {
        if (listaImpostos.isEmpty()) {
            System.out.println("Nenhum imposto cadastrado.");
        } else {
            for (ImpostoModel imposto : listaImpostos) {
                System.out.println("\n********************************************");
                System.out.println("\nImposto: ");
                System.out.println(imposto);  // Exibe o Imposto com o formato ajustado do toString()
                System.out.println("********************************************\n");
            }
        }
    }
}
