package Controller;

import Model.RemetenteModel;

import java.util.ArrayList;
import java.util.Scanner;

public class RemetenteController {

    private final ArrayList<RemetenteModel> listaRemetentes = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public void incluirRemetente() {
        RemetenteModel remetente = new RemetenteModel();

        System.out.print("Inscrição Estadual: ");
        remetente.setInscricaoEstadual(scanner.nextLine());

        System.out.print("CNPJ: ");
        remetente.setCnpj(scanner.nextLine());

        System.out.print("Razão Social: ");
        remetente.setRazaoSocial(scanner.nextLine());

        System.out.print("Endereço: ");
        remetente.setEndereco(scanner.nextLine());

        System.out.print("Cidade: ");
        remetente.setCidade(scanner.nextLine());

        System.out.print("Estado: ");
        remetente.setEstado(scanner.nextLine());

        System.out.print("CEP: ");
        remetente.setCep(scanner.nextLine());

        System.out.print("Telefone: ");
        remetente.setTelefone(scanner.nextLine());

        listaRemetentes.add(remetente);
        System.out.println("Remetente cadastrado com sucesso!");
    }

    public void incluir(RemetenteModel remetente) {
        listaRemetentes.add(remetente);
        System.out.println("Remetente cadastrado com sucesso!");
    }

    public ArrayList<RemetenteModel> listarRemetentes() {
        return listaRemetentes;
    }
}
