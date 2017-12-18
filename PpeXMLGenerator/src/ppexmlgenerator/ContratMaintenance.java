
package ppexmlgenerator;

import java.util.ArrayList;
import java.util.Date;

public class ContratMaintenance {
    private String numContrat;
    private Date dateSignature;
    private Date dateEcheance;
    private ArrayList<Materiel> lesMaterielsAssures;
    
    public int getJoursRestants(){
        return dateEcheance - dateSignature;
    }
    
    public boolean estValide(){
        
        return true;
    }
    
    public void ajouteMateriel(){
        
    }
}
