
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
}