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
import com.github.javafaker.Faker;
import java.math.BigInteger;
import java.time.ZoneId;
import java.util.Locale;
import java.util.concurrent.TimeUnit;


public class DanfeFaker {

    private static final Faker faker = new Faker(new Locale("pt-BR"));

    
    DestinatarioFaker gerarDestinatarioFake = new DestinatarioFaker();
    RemetenteFaker gerarRemetenteFake = new RemetenteFaker();
    ImpostoFaker gerarImpostoFake = new ImpostoFaker();
    IssqnFaker gerarIssqnFake = new IssqnFaker();
    
    
    

    public static DanfeModel gerarDanfeFaker() {
        
    DanfeModel danfe = new DanfeModel();
    
    danfe.setNumero(String.valueOf(faker.number().numberBetween(1000, 9999)));
    danfe.setSerie(String.valueOf(faker.number().numberBetween(1, 999)));
    danfe.setFolha(String.valueOf(faker.number().numberBetween(1, 10)));
    
    danfe.setDataEmissao(faker.date().past(10, TimeUnit.DAYS));
    danfe.setDataEntrada(faker.date().past(5, TimeUnit.DAYS));
    danfe.setDataSaida(new Date());  
    
    danfe.setHoraSaida(faker.date().birthday().toInstant().atZone(ZoneId.systemDefault()).toLocalTime().toString());
    
    danfe.setTipoOperacao(faker.bool().bool() ? "0" : "1");
    danfe.setNaturezaOperacao("Venda");  
    
    danfe.setProtocolo(String.valueOf(faker.number().numberBetween(100000, 999999)));
    
    danfe.setChaveAcesso(String.format("%040d", new BigInteger(faker.number().digits(40))));  // Formata chave com 40 dígitos
    
    danfe.setInformacoesComplementares(faker.lorem().sentence());
    danfe.setObservacoes(faker.lorem().sentence());

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