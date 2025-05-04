package Controller;

import Model.DestinatarioModel;

import java.util.ArrayList;
import java.util.Scanner;

public class DestinatarioController {

    private final ArrayList<DestinatarioModel> listaDestinatarios = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public void incluirDestinatario() {
        DestinatarioModel destinatario = new DestinatarioModel();

        System.out.print("Razão Social: ");
        destinatario.setRazaoSocial(scanner.nextLine());

        System.out.print("CNPJ ou CPF: ");
        destinatario.setCnpjCpf(scanner.nextLine());

        System.out.print("Endereço: ");
        destinatario.setEndereco(scanner.nextLine());

        System.out.print("Bairro/Distrito: ");
        destinatario.setBairroDistrito(scanner.nextLine());

        System.out.print("CEP: ");
        destinatario.setCep(scanner.nextLine());

        System.out.print("Município: ");
        destinatario.setMunicipio(scanner.nextLine());

        System.out.print("UF: ");
        destinatario.setUf(scanner.nextLine());

        System.out.print("Telefone: ");
        destinatario.setTelefone(scanner.nextLine());

        System.out.print("Inscrição Estadual: ");
        destinatario.setInscricaoEstadual(scanner.nextLine());

        listaDestinatarios.add(destinatario);
        System.out.println("Destinatário cadastrado com sucesso!");
    }

    public void incluir(DestinatarioModel destinatario) {
        listaDestinatarios.add(destinatario);
        System.out.println("Destinatário cadastrado com sucesso!");
    }

    public ArrayList<DestinatarioModel> listarDestinatarios() {
        return listaDestinatarios;
    }
}
