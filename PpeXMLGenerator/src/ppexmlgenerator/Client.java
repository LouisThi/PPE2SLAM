
package ppexmlgenerator;

import java.util.ArrayList;


public class Client {
    private String numClient;
    private String raisonSociale;
    private String siren;
    private String codeApe;
    private String adresse;
    private String telClient;
    private String email;
    private int dureeDeplacement;
    private int distanceKm;
    private ArrayList<Materiel> lesMateriels;
    private ContratMaintenance leContrat;
    
    public ArrayList<Materiel> getMateriels(){
        return lesMateriels;
    }
    
    public ArrayList<Materiel> getMaterielSousContrat(){
        
        return lesMateriels;
    }
    
    public boolean estAssure(){
        
        return true;
    }
    
}
