package Faker;

import Model.IssqnModel;
import com.github.javafaker.Faker;
import java.util.Locale;

public class IssqnFaker {

    public IssqnModel adicionarIssqnFake() {
        Faker faker = new Faker(new Locale("pt-BR"));

        IssqnModel issqn = new IssqnModel();

        issqn.setInscricaoMunicipal(faker.number().digits(8));

        double valorServico = faker.number().randomDouble(2, 100, 10000);

        double percentualBase = 0.7 + (0.3 * faker.random().nextDouble()); // entre 70% e 100%
        double baseCalculo = valorServico * percentualBase;

        double aliquota = 2 + (3 * faker.random().nextDouble()); // entre 2% e 5%
        double valorIssqn = baseCalculo * (aliquota / 100.0);

        issqn.setValorTotalServico(valorServico);
        issqn.setBaseCalculoIssqn(baseCalculo);
        issqn.setValorIssqn(valorIssqn);

        return issqn;
    }
}
