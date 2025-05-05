package View;

import Controller.DanfeController;
import Model.DanfeModel;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuConsulta implements MenuInterface {

    private DanfeController danfeController;
    private Scanner scanner = new Scanner(System.in);
    private int opcaoConsulta = 0;

    public MenuConsulta(DanfeController controller) {
        this.danfeController = controller;
    }

    public void executarMenuConsulta() {
        while (opcaoConsulta != 5) {
            System.out.println("\n----- Menu de Consultas -----");
            System.out.println("1. Consultar pelo número da NF-e");
            System.out.println("2. Consultar pela razão social do cliente");
            System.out.println("3. Consultar pelo CNPJ/CPF do cliente");
            System.out.println("4. Consultar pelo valor total da NF-e");
            System.out.println("5. Voltar");
            System.out.print("Escolha uma opção: ");
            opcaoConsulta = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoConsulta) {
                case 1:
                    consultarPorNumero();
                    break;
                case 2:
                    consultarPorRazaoSocial();
                    break;
                case 3:
                    consultarPorCnpjCpf();
                    break;
                case 4:
                    consultarPorValorTotal();
                    break;
                case 5:
                    System.out.println("Saindo do Menu de Consultas...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void consultarPorNumero() {
        System.out.print("Digite o número da NF-e: ");
        String numero = scanner.nextLine();
        DanfeModel resultado = danfeController.consultarPorNumero(numero);
        if (resultado != null) {
            System.out.println(resultado);
        }
    }

    private void consultarPorRazaoSocial() {
        System.out.print("Digite a razão social do cliente: ");
        String razaoSocial = scanner.nextLine();
        ArrayList<DanfeModel> resultados = danfeController.consultarPorRazaoSocial(razaoSocial);
        if (resultados.isEmpty()) {
            System.out.println("Nenhuma NF-e encontrada para a razão social: " + razaoSocial);
        } else {
            for (DanfeModel danfe : resultados) {
                System.out.println(danfe);
            }
        }
    }

    private void consultarPorCnpjCpf() {
        System.out.print("Digite o CNPJ/CPF do cliente: ");
        String cnpjCpf = scanner.nextLine();
        ArrayList<DanfeModel> resultados = danfeController.consultarPorCnpjCpf(cnpjCpf);
        if (resultados.isEmpty()) {
            System.out.println("Nenhuma NF-e encontrada para o CNPJ/CPF: " + cnpjCpf);
        } else {
            for (DanfeModel danfe : resultados) {
                System.out.println(danfe);
            }
        }
    }

    private void consultarPorValorTotal() {
        System.out.print("Digite o valor total da NF-e: ");
        double valorTotal = scanner.nextDouble();
        scanner.nextLine();
        ArrayList<DanfeModel> resultados = danfeController.consultarPorValorTotal(valorTotal);
        if (resultados.isEmpty()) {
            System.out.println("Nenhuma NF-e encontrada com o valor total: " + valorTotal);
        } else {
            for (DanfeModel danfe : resultados) {
                System.out.println(danfe);
            }
        }
    }
}