package Faker;

import Model.RemetenteModel;
import com.github.javafaker.Faker;

import java.util.Locale;

public class RemetenteFaker {

    private static final Faker faker = new Faker(new Locale("pt-BR"));

    public static RemetenteModel gerarRemetenteFake() {
        RemetenteModel remetente = new RemetenteModel();

        remetente.setInscricaoEstadual(faker.number().digits(9));
        remetente.setCnpj(faker.number().digits(14));
        remetente.setRazaoSocial(faker.company().name());
        remetente.setEndereco(faker.address().streetAddress());
        remetente.setCidade(faker.address().cityName());
        remetente.setEstado(faker.address().stateAbbr());
        remetente.setCep(faker.number().digits(8));
        remetente.setTelefone(faker.phoneNumber().cellPhone());

        return remetente;
    }
}
