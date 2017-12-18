
package ppexmlgenerator;

public class PersistanceSQL {
    private String ip;
    private int port;
    private String BDD;
    
    public PersistanceSQL(String ipBase, int port, String nomBaseDonnee){
        this.ip = ipBase;
        this.port = port;
        this.BDD = nomBaseDonnee;
    }
    
    public void RangerDansBase(PersistanceSQL unObjet){
        
    }
    
    public PersistanceSQL ChargerDepuisBase(String id, String nomClasse){
        PersistanceSQL alo = new PersistanceSQL("123", 1, "alo");
        return alo;
    }
}
