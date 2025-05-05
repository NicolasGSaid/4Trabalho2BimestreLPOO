package Faker;

import Model.DanfeModel;
import Model.ProdutoModel;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import static Faker.DestinatarioFaker.gerarDestinatarioFake;
import static Faker.ImpostoFaker.gerarImpostoFake;
import static Faker.IssqnFaker.gerarIssqnFake;
import static Faker.RemetenteFaker.gerarRemetenteFake;
import static Faker.TransporteFaker.gerarTransporteFake;


public class DanfeFaker {

    private static final Random random = new Random();
    
    DestinatarioFaker gerarDestinatarioFake = new DestinatarioFaker();
    RemetenteFaker gerarRemetenteFake = new RemetenteFaker();
    ImpostoFaker gerarImpostoFake = new ImpostoFaker();
    IssqnFaker gerarIssqnFake = new IssqnFaker();
    
    
    

    public static DanfeModel gerarDanfeFaker() {
        DanfeModel danfe = new DanfeModel();
        danfe.setNumero(String.valueOf(random.nextInt(1000000)));
        danfe.setSerie(String.valueOf(random.nextInt(1000)));
        danfe.setFolha(String.valueOf(random.nextInt(10)));
        danfe.setDataEmissao(new Date());
        danfe.setDataEntrada(new Date());
        danfe.setDataSaida(new Date());
        danfe.setHoraSaida("12:00");
        danfe.setTipoOperacao(random.nextBoolean() ? "0" : "1");
        danfe.setNaturezaOperacao("Venda");
        danfe.setProtocolo(String.valueOf(random.nextInt(1000000)));
        danfe.setChaveAcesso(String.format("%040d", random.nextLong()));
        danfe.setInformacoesComplementares("Informações complementares de teste.");
        danfe.setObservacoes("Observações de teste.");
        danfe.setProdutos(gerarProdutosFaker());
        danfe.setDestinatario(gerarDestinatarioFake());
        danfe.setRemetente(gerarRemetenteFake());
        danfe.setImposto(gerarImpostoFake());
        danfe.setTransporte(gerarTransporteFake());
        danfe.setIssqn(gerarIssqnFake());
        
        return danfe;
    }

    private static List<ProdutoModel> gerarProdutosFaker() {
        List<ProdutoModel> produtos = new ArrayList<>();
        ProdutoFaker produtoFaker = new ProdutoFaker();

        for (int i = 0; i < 5; i++) {
            ProdutoModel produto = produtoFaker.adicionarProdutoFake();
            produtos.add(produto);
        }

        return produtos;
    }
}