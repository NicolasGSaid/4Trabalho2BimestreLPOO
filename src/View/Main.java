package Controller;

import Model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static NotaFiscalControllerImpl controller = new NotaFiscalControllerImpl();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        do {
            displayMenu();
            option = scanner.nextInt();
            scanner.nextLine(); 
            switch (option) {
                case 1:
                    incluirNotaFiscal();
                    break;
                case 2:
                    alterarNotaFiscal();
                    break;
                case 3:
                    excluirNotaFiscal();
                    break;
                case 4:
                    consultarNotaFiscal();
                    break;
                case 5:
                    listarNotasPorIntervalo();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (option != 6);
    }

    private static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Incluir NF-e");
        System.out.println("2. Alterar NF-e pelo número");
        System.out.println("3. Excluir NF-e pelo número");
        System.out.println("4. Consultar NF-e");
        System.out.println("5. Listagem de NF-e por intervalo de número");
        System.out.println("6. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void incluirNotaFiscal() {
        System.out.println("Incluir NF-e:");

        System.out.print("Número: ");
        String numero = scanner.nextLine();

        System.out.print("Série: ");
        String serie = scanner.nextLine();

        System.out.print("Data de Emissão: ");
        String dataEmissao = scanner.nextLine();

        System.out.print("Data de Saída: ");
        String dataSaida = scanner.nextLine();

        System.out.print("Protocolo: ");
        String protocolo = scanner.nextLine();

        System.out.print("Natureza da Operação: ");
        String naturezaOperacao = scanner.nextLine();

        System.out.print("Razão Social do Destinatário: ");
        String razaoSocial = scanner.nextLine();

        System.out.print("CNPJ/CPF do Destinatário: ");
        String cnpjCpf = scanner.nextLine();

        System.out.print("Valor Total dos Produtos: ");
        double valorTotalProdutos = scanner.nextDouble();

        System.out.print("Valor Total dos Impostos: ");
        double valorTotalImpostos = scanner.nextDouble();

        scanner.nextLine();

        
        Destinatario destinatario = new Destinatario(razaoSocial, "", "", "", "", cnpjCpf, "");

      
        NotaFiscal notaFiscal = new NotaFiscal();
        notaFiscal.setNumero(numero);
        notaFiscal.setSerie(serie);
        notaFiscal.setDataEmissao(dataEmissao);
        notaFiscal.setDataSaida(dataSaida);
        notaFiscal.setProtocolo(protocolo);
        notaFiscal.setNaturezaOperacao(naturezaOperacao);
        notaFiscal.setDestinatario(destinatario);
        notaFiscal.calcularTotais();

        
        controller.incluirNotaFiscal(notaFiscal);
        System.out.println("NF-e incluída com sucesso!");
    }

    private static void alterarNotaFiscal() {
        System.out.print("Digite o número da NF-e para alterar: ");
        String numero = scanner.nextLine();

        System.out.println("O que deseja alterar?");
        System.out.println("a. Alterar Destinatário/Remetente");
        System.out.println("b. Alterar Fatura");
        System.out.println("c. Alterar Cálculo do Imposto");
        System.out.println("d. Alterar Transportadora");
        char escolha = scanner.nextLine().charAt(0);

        switch (escolha) {
            case 'a':
                System.out.print("Nova Razão Social: ");
                String novaRazaoSocial = scanner.nextLine();
                System.out.print("Novo CNPJ/CPF: ");
                String novoCnpjCpf = scanner.nextLine();
                Destinatario novoDestinatario = new Destinatario(novaRazaoSocial, "", "", "", "", novoCnpjCpf, "");
                controller.alterarDestinatario(numero, novoDestinatario);
                break;
            case 'c':
                System.out.print("Novo valor do ICMS: ");
                double novoICMS = scanner.nextDouble();
                CalculoImposto novoImposto = new CalculoImposto();
                novoImposto.setValorICMS(novoICMS);
                controller.alterarCalculoImposto(numero, novoImposto);
                break;
            case 'd':
                System.out.print("Nova Transportadora: ");
                String novaTransportadora = scanner.nextLine();
                Transportador novoTransportador = new Transportador();
                novoTransportador.setRazaoSocial(novaTransportadora);
                controller.alterarTransportador(numero, novoTransportador);
                break;
            default:
                System.out.println("Opção inválida!");
        }
        System.out.println("Alteração realizada com sucesso!");
    }

    private static void excluirNotaFiscal() {
        System.out.print("Digite o número da NF-e para excluir: ");
        String numero = scanner.nextLine();
        controller.excluirNotaFiscal(numero);
        System.out.println("NF-e excluída com sucesso!");
    }

    private static void consultarNotaFiscal() {
        System.out.println("Consulta NF-e:");
        System.out.println("a. Consulta pelo número da NF-e");
        System.out.println("b. Consulta pela razão social do cliente");
        System.out.println("c. Consulta pelo CNPJ/CPF do cliente");
        System.out.println("d. Consulta pelo valor total da NF-e");
        char escolha = scanner.nextLine().charAt(0);

        switch (escolha) {
            case 'a':
                System.out.print("Número da NF-e: ");
                String numero = scanner.nextLine();
                NotaFiscal nota = controller.consultarPorNumero(numero);
                if (nota != null) {
                    System.out.println(nota);
                } else {
                    System.out.println("NF-e não encontrada.");
                }
                break;
            case 'b':
                System.out.print("Razão Social: ");
                String razaoSocial = scanner.nextLine();
                List<NotaFiscal> notasPorRazao = controller.consultarPorRazaoSocial(razaoSocial);
                notasPorRazao.forEach(System.out::println);
                break;
            case 'c':
                System.out.print("CNPJ/CPF: ");
                String cnpjCpf = scanner.nextLine();
                List<NotaFiscal> notasPorDocumento = controller.consultarPorDocumento(cnpjCpf);
                notasPorDocumento.forEach(System.out::println);
                break;
            case 'd':
                System.out.print("Valor Total: ");
                double valorTotal = scanner.nextDouble();
                List<NotaFiscal> notasPorValor = controller.consultarPorValorTotal(valorTotal);
                notasPorValor.forEach(System.out::println);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private static void listarNotasPorIntervalo() {
        System.out.print("Digite o número inicial: ");
        String numeroInicial = scanner.nextLine();
        System.out.print("Digite o número final: ");
        String numeroFinal = scanner.nextLine();

        List<NotaFiscal> notasFiscais = controller.consultarPorNumeroIntervalo(numeroInicial, numeroFinal);
        if (notasFiscais.isEmpty()) {
            System.out.println("Nenhuma NF-e encontrada no intervalo.");
        } else {
            notasFiscais.forEach(System.out::println);
        }
    }
}