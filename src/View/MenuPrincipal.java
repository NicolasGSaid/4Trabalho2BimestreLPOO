
package View;

import Controller.DanfeController;
import Faker.DanfeFaker;
import Model.DanfeModel;


public class MenuPrincipal implements MenuInterface{
    
    int opcao = 0;
    DanfeController controller = new DanfeController();
    

    public int menuPrincipal(){
        
        for (int i = 1; i <= 5; i++) {
            DanfeModel danfeFaker = DanfeFaker.gerarDanfeFaker();
            controller.listaDanfes.add(danfeFaker);
        }
        
        System.out.println("1. Incluir NF-E");
        System.out.println("2. Alterar NF-E pelo número");
        System.out.println("3. Excluir NF-E pelo número");
        System.out.println("4. Consultar NF-E");
        System.out.println("5. Listagem de NF-E");
        System.out.println("6. Sair");
        opcao = scanner.nextInt();
        scanner.nextLine(); 
        return opcao;
    }
    
    public void executarMenu(){
        
        while(opcao != 6){
            
            opcao = menuPrincipal();
            
            switch (opcao){
                case 1:
                    break;
                case 2:                    
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.print("Saindo....");
                    break;
                default:
                    break;
                 
            }
        }
    }
}
