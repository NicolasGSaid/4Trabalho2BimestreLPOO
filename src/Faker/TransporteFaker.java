package Faker;

import Model.TransporteModel;
import com.github.javafaker.Faker;

import java.util.Locale;

public class TransporteFaker {

    private static final Faker faker = new Faker(new Locale("pt-BR"));

    public static TransporteModel gerarTransporteFake() {
        TransporteModel transporte = new TransporteModel();

        transporte.setRazaoSocial(faker.company().name());
        transporte.setFretePorConta(faker.options().option("0", "1"));
        transporte.setCodigoAntt(String.valueOf(faker.number().digits(9)));
        transporte.setPlaca(faker.bothify("???-####").toUpperCase());
        transporte.setUf(faker.address().stateAbbr());
        transporte.setCnpjCpf(faker.number().digits(14));
        transporte.setInscricaoEstadual(faker.number().digits(9));
        transporte.setEndereco(faker.address().streetAddress());
        transporte.setMunicipio(faker.address().cityName());
        transporte.setQuantidade(String.valueOf(faker.number().numberBetween(1, 100)));
        transporte.setEspecie(faker.commerce().productName());
        transporte.setMarca(faker.company().name());
        transporte.setTonelagem(faker.number().randomDouble(2, 1, 30));
        transporte.setPesoBruto(faker.number().randomDouble(2, 1000, 30000));
        transporte.setPesoLiquido(faker.number().randomDouble(2, 800, 29000));

        return transporte;
    }
}
