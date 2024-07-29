import java.util.Date;
import javax.json.json;

public class Activite {
    
    private Date Date_debut;
    private String Nom;
    private Projet projet;
    public Discipline discipline;

    public Activite(final String Nom, final Poste poste) {
    }

    public Date getDate_debut () {
        // Automatically generated method. Please do not modify this code.
        return this.Date_debut ;
    }

   
    public void setDate_debut (final Date value) {
        // Automatically generated method. Please do not modify this code.
        this.Date_debut  = value;
    }
    
    public String getNom() {
        // Automatically generated method. Please do not modify this code.
        return this.Nom;
    }

    public void setNom(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.Nom = value;
    }

    public Projet getProjet() {
        // Automatically generated method. Please do not modify this code.
        return this.projet;
    }
  
    public void setProjet(final Projet value) {
        // Automatically generated method. Please do not modify this code.
        this.projet = value;
    }

    private void Calculer_temps_total() {
    }

    public void Terminer_activité() {

    }

    public void Commencer_activité() {

    }
    
}
