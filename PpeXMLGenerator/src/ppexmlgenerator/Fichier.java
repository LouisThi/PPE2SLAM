package ppexmlgenerator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fichier {
    private BufferedWriter fW;
    private BufferedReader fR;
    private char mode;
    
    public void ouvrir(String nomDuFichier, String s) throws IOException{
        mode = (s.toUpperCase()).charAt(0);
        File f = new File(nomDuFichier);
        if (mode == 'R' || mode == 'L')
            fR = new BufferedReader(new FileReader(f));
        else if (mode == 'W' || mode == 'E')
            fW = new BufferedWriter(new FileWriter(f));
    }
    public void ecrire(int tmp) throws IOException{
        String chaine = "";
	chaine = String.valueOf(tmp);
 	if (chaine != null)   {
		fW.write(chaine,0,chaine.length());
                fW.newLine();
        }
    }
    public void ecrire(String chaine) throws IOException {
        if (chaine != null)   {
            fW.write(chaine,0,chaine.length());
            fW.newLine();
	} 
    }
    public String lire()throws IOException{
           String chaine = fR.readLine();
           return chaine;
    }
    public void fermer()throws IOException{
        if (mode == 'L'){
            fR.close();
        }
        else {
            fW.close();
        }
    }
}
