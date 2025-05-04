package Faker;

import Model.ProdutoModel;
import com.github.javafaker.Faker;
import java.util.Locale;

public class ProdutoFaker {
    
    public ProdutoModel adicionarProdutoFake() {
        Faker faker = new Faker(new Locale("pt-BR"));

        ProdutoModel produto = new ProdutoModel();
        
        produto.setCodigo("PRD" + faker.number().digits(4));
        produto.setDescricao(faker.commerce().productName());
        produto.setNcsh(faker.number().digits(8));
        produto.setCst(faker.options().option("040", "060", "050"));
        produto.setCfop(faker.options().option("5102", "6102", "5403"));
        produto.setUnidade("UN");
        produto.setQuantidade(faker.number().randomDouble(2, 1, 100));
        
        double valorUnit = faker.number().randomDouble(2, 5, 500);
        produto.setValorUnitario(valorUnit);
        
        double qtd = produto.getQuantidade();
        produto.setValorTotal(qtd * valorUnit);
        produto.setBaseCalIcms(qtd * valorUnit);
        produto.setValorIpi(faker.number().randomDouble(2, 1, 20));
        produto.setAlicotaIcms(faker.number().randomDouble(2, 12, 18));
        produto.setAlicotaIpi(faker.number().randomDouble(2, 4, 10));

        return produto;
    }
}
