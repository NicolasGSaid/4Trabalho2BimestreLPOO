package Controller;

import Model.DanfeModel;
import Model.DestinatarioModel;
import Model.RemetenteModel;
import Model.TransporteModel;
import Model.ProdutoModel;
import Model.IssqnModel;
import Model.ImpostoModel;
import java.util.ArrayList;
import java.util.Scanner;

public class DanfeController {

    private final ArrayList<DanfeModel> listaDanfes = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    private final DestinatarioController destinatarioController = new DestinatarioController();
    private final RemetenteController remetenteController = new RemetenteController();
    private final TransporteController transporteController = new TransporteController();
    private final ProdutoController produtoController = new ProdutoController();
    private final IssqnController issqnController = new IssqnController();
    private final ImpostoController impostoController = new ImpostoController();

    public void incluirNfe() {
        DanfeModel novaDanfe = new DanfeModel();

        System.out.println("Digite os dados da nova NF-e:");

        System.out.print("Número: ");
        novaDanfe.setNumero(scanner.nextLine());

        System.out.print("Série: ");
        novaDanfe.setSerie(scanner.nextLine());

        System.out.print("Folha: ");
        novaDanfe.setFolha(scanner.nextLine());

        System.out.print("Data de Emissão (yyyy-MM-dd): ");
        novaDanfe.setDataEmissao(java.sql.Date.valueOf(scanner.nextLine()));

        System.out.print("Data de Entrada (yyyy-MM-dd): ");
        novaDanfe.setDataEntrada(java.sql.Date.valueOf(scanner.nextLine()));

        System.out.print("Data de Saída (yyyy-MM-dd): ");
        novaDanfe.setDataSaida(java.sql.Date.valueOf(scanner.nextLine()));

        System.out.print("Hora de Saída (HH:mm:ss): ");
        novaDanfe.setHoraSaida(scanner.nextLine());

        System.out.print("Tipo de Operação (0-Entrada, 1-Saída): ");
        novaDanfe.setTipoOperacao(scanner.nextLine());

        System.out.print("Natureza da Operação: ");
        novaDanfe.setNaturezaOperacao(scanner.nextLine());

        System.out.print("Protocolo: ");
        novaDanfe.setProtocolo(scanner.nextLine());

        System.out.print("Chave de Acesso: ");
        novaDanfe.setChaveAcesso(scanner.nextLine());

        System.out.print("Informações Complementares: ");
        novaDanfe.setInformacoesComplementares(scanner.nextLine());

        System.out.print("Observações: ");
        novaDanfe.setObservacoes(scanner.nextLine());

        // Vincular o Destinatário
        System.out.println("Incluindo o destinatário:");
        DestinatarioModel destinatario = destinatarioController.alterarDestinatario();
        novaDanfe.setDestinatario(destinatario);

        // Vincular o Remetente
        System.out.println("Incluindo o remetente:");
        RemetenteModel remetente = remetenteController.alterarRemetente();
        novaDanfe.setRemetente(remetente);

        // Vincular o Transporte
        System.out.println("Incluindo o transporte:");
        TransporteModel transporte = transporteController.incluirTransporte();
        novaDanfe.setTransporte(transporte);

        // Vincular Produtos
        System.out.println("Incluindo produtos:");
        ArrayList<ProdutoModel> produtos = produtoController.incluirProdutos();
        novaDanfe.setProdutos(produtos);

        // Vincular ISSQN
        System.out.println("Incluindo ISSQN:");
        IssqnModel issqn = issqnController.incluirIssqn();
        novaDanfe.setIssqn(issqn);

        // Vincular Imposto
        System.out.println("Incluindo Imposto:");
        ImpostoModel imposto = impostoController.incluirImposto();
        novaDanfe.setImposto(imposto);

        // Adicionar a DANFE à lista
        listaDanfes.add(novaDanfe);
        System.out.println("NF-e incluída com sucesso!");
    }

    public ArrayList<DanfeModel> getListaDanfes() {
        return listaDanfes;
    }

    public void exibirDanfes() {
        if (listaDanfes.isEmpty()) {
            System.out.println("Nenhuma DANFE cadastrada.");
        } else {
            for (DanfeModel danfe : listaDanfes) {
                System.out.println("\n********************************************");
                System.out.println("DANFE: ");
                System.out.println(danfe);
                System.out.println("********************************************\n");
            }
        }
    }
}