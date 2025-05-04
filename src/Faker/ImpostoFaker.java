package Faker;

import Model.ImpostoModel;
import com.github.javafaker.Faker;

import java.util.Locale;

public class ImpostoFaker {

    public ImpostoModel gerarImpostoFake() {
        Faker faker = new Faker(new Locale("pt-BR"));

      
        double valorProdutos = faker.number().randomDouble(2, 500, 5000);
        double valorFrete = faker.number().randomDouble(2, 50, 300);
        double valorSeguro = faker.number().randomDouble(2, 20, 150);
        double desconto = faker.number().randomDouble(2, 0, 200);
        double outrasDespesas = faker.number().randomDouble(2, 10, 100);
        double valorIpi = faker.number().randomDouble(2, 30, 300);

        
        double percentualBaseIcms = 0.7 + (0.3 * faker.random().nextDouble()); // 70% a 100%
        double aliquotaIcms = 0.12 + (0.06 * faker.random().nextDouble());     // 12% a 18%

        double baseCalculoIcms = valorProdutos * percentualBaseIcms;
        double valorIcms = baseCalculoIcms * aliquotaIcms;

        double percentualBaseSt = 1.05 + (0.25 * faker.random().nextDouble()); // 105% a 130%
        double baseSubstituicao = baseCalculoIcms * percentualBaseSt;
        double valorSubstituicao = baseSubstituicao * (0.10 + 0.10 * faker.random().nextDouble()); // 10% a 20%

        double valorTotalImpostos = valorIcms + valorSubstituicao + valorIpi;
        double valorTotalNota = valorProdutos + valorFrete + valorSeguro + outrasDespesas + valorIpi - desconto;

        ImpostoModel imposto = new ImpostoModel();
        imposto.setValorTotalProdutos(valorProdutos);
        imposto.setValorFrete(valorFrete);
        imposto.setValorSeguro(valorSeguro);
        imposto.setDesconto(desconto);
        imposto.setOutrasDespesas(outrasDespesas);
        imposto.setValorIpi(valorIpi);
        imposto.setBaseCalculoIcms(baseCalculoIcms);
        imposto.setValorIcms(valorIcms);
        imposto.setBaseCalculoSubstituicao(baseSubstituicao);
        imposto.setValorSubstituicao(valorSubstituicao);
        imposto.setValorTotalImpostos(valorTotalImpostos);
        imposto.setValorTotalNota(valorTotalNota);

        return imposto;
    }
}
