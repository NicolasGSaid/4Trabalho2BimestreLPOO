package Faker;

import Model.DestinatarioModel;
import com.github.javafaker.Faker;

import java.util.Locale;

public class DestinatarioFaker {

    private static final Faker faker = new Faker(new Locale("pt-BR"));

    public static DestinatarioModel gerarDestinatarioFake() {
        DestinatarioModel destinatario = new DestinatarioModel();

        destinatario.setRazaoSocial(faker.company().name());
        destinatario.setCnpjCpf(faker.number().digits(14));
        destinatario.setEndereco(faker.address().streetAddress());
        destinatario.setBairroDistrito(faker.address().streetName());
        destinatario.setCep(faker.number().digits(8));
        destinatario.setMunicipio(faker.address().cityName());
        destinatario.setUf(faker.address().stateAbbr());
        destinatario.setTelefone(faker.phoneNumber().cellPhone());
        destinatario.setInscricaoEstadual(faker.number().digits(9));

        return destinatario;
    }
}
