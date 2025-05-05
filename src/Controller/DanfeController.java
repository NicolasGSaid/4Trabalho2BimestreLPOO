
package Controller;

import Model.DanfeModel;
import Model.TransporteModel;
import java.util.ArrayList;


public class DanfeController {
    
    public final ArrayList<DanfeModel> listaDanfes = new ArrayList<>();
  
    public void exibirDanfes() {
        if (listaDanfes.isEmpty()) {
            System.out.println("Nenhum DANFE cadastrado.");
        } else {
            for (DanfeModel danfe : listaDanfes) {
                System.out.println("\n********************************************");
                System.out.println("DANFE: ");
                System.out.println(danfe);  
                System.out.println("********************************************\n");
            }
        }
    }
    
    public void listarDanfes() {
        if (listaDanfes.isEmpty()) {
            System.out.println("Nenhuma DANFE cadastrada.");
        } else {
            System.out.println("\nLista de DANFEs:");
            for (int i = 0; i < listaDanfes.size(); i++) {
                System.out.println((i + 1) + ". " + listaDanfes.get(i));
            }
        }
    }

 
    public void adicionarDanfe(DanfeModel danfe) {
        listaDanfes.add(danfe);
    }

    public ArrayList<DanfeModel> getListaDanfes() {
        return listaDanfes;
    } 
}