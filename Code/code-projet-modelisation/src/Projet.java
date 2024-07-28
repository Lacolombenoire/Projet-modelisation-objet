import java.util.ArrayList;
import java.util.List;

public class Projet {
    
    private String Date_debut;

   
    public String getDate_debut() {
        // Automatically generated method. Please do not modify this code.
        return this.Date_debut;
    }

    
    public void setDate_debut(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.Date_debut = value;
    }

 
    private String Nom;

    
    public String getNom() {
        // Automatically generated method. Please do not modify this code.
        return this.Nom;
    }

    
    public void setNom(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.Nom = value;
    }

    
    private String Date_fin;

    
    public String getDate_fin() {
        // Automatically generated method. Please do not modify this code.
        return this.Date_fin;
    }

   
    public void setDate_fin(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.Date_fin = value;
    }

  
    private String Numero_identification;

    
    public String getNumero_identification() {
        // Automatically generated method. Please do not modify this code.
        return this.Numero_identification;
    }

   
    public void setNumero_identification(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.Numero_identification = value;
    }

    
    public List<Activite> Liste_activite = new ArrayList<Activite> ();

    public List<Employe> liste_employes = new ArrayList<Employe> ();

    
    private Entreprise entreprise;

    
    public Entreprise getEntreprise() {
        // Automatically generated method. Please do not modify this code.
        return this.entreprise;
    }

    
    public void setEntreprise(final Entreprise value) {
        // Automatically generated method. Please do not modify this code.
        this.entreprise = value;
    }

}
