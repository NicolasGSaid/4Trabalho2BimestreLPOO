
package View;

import Controller.DestinatarioController;

public class MenuAlterar implements MenuInterface{
    
    int opcaoSecundaria = 0;
    
    
    
    public void executarMenuAlterar(){
    
        while(opcaoSecundaria != 4) {
            System.out.println("\n----- Menu de Clientes -----");  
            System.out.println("1. Alterar Destinatário/Rementente");  
            System.out.println("2. Alterar Fatura");  
            System.out.println("3. Alterar Calculo do Imposto");  
            System.out.println("4. Alterar Transportadora");  
            System.out.println("5. Voltar");
            opcaoSecundaria = scanner.nextInt();
            scanner.nextLine(); 
            
             switch(opcaoSecundaria) {
                case 1 :                  
                    break;
                case 2 :
                    break;
                case 3 : 
                    break;
                case 4:
                    break;
                case 5:
                    break;
                    
                 
            }
        }
    }
}
