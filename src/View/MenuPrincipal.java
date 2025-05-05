package View;

import Controller.DanfeController;
import Controller.ImpostoController; 
import Faker.DanfeFaker;
import Model.DanfeModel;


public class MenuPrincipal implements MenuInterface {
    
    private int opcao = 0;
    private DanfeController controller = new DanfeController();
    private ImpostoController impostoController = new ImpostoController();  
    
    public int menuPrincipal(){

        if (controller.getListaDanfes().isEmpty()) {
            for (int i = 1; i <= 5; i++) {
                DanfeModel danfeFaker = DanfeFaker.gerarDanfeFaker();
                controller.getListaDanfes().add(danfeFaker); 
            }
        }
        
        System.out.println("\n----- Menu Principal -----");
        System.out.println("1. Incluir NF-E");
        System.out.println("2. Alterar NF-E pelo número");
        System.out.println("3. Excluir NF-E pelo número");
        System.out.println("4. Consultar NF-E");
        System.out.println("5. Listagem de NF-E");
        System.out.println("6. Sair");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();
        scanner.nextLine(); 
        return opcao;
    }
    
    public void executarMenu(){
        while(opcao != 6){
            opcao = menuPrincipal();
            switch (opcao){
                case 1:
                    System.out.println("Funcionalidade de inclusão ainda não implementada.");
                    break;
                case 2:
                    MenuAlterar menuAlterar = new MenuAlterar(controller, impostoController); // Updated constructor to match fixed MenuAlterar
                    menuAlterar.executarMenuAlterar();                    
                    break;
                case 3:
                    System.out.println("Funcionalidade de exclusão ainda não implementada.");
                    break;
                case 4:
                    System.out.println("Funcionalidade de consulta ainda não implementada.");
                    break;
                case 5:
                    controller.exibirDanfes();
                    break;
                case 6:
                    System.out.println("Saindo....");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}