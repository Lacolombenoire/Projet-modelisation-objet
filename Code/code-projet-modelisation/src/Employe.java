import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employe {
   
    private int taux_horaire;

 
    public int getTaux_horaire() {
        // Automatically generated method. Please do not modify this code.
        return this.taux_horaire;
    }

   
    public void setTaux_horaire(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.taux_horaire = value;
    }

    
    private String taux_supplementaire;

  
    public String getTaux_supplementaire() {
        // Automatically generated method. Please do not modify this code.
        return this.taux_supplementaire;
    }

    
    public void setTaux_supplementaire(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.taux_supplementaire = value;
    }

    
    private String numero_identifiant;

    
    public String getNumero_identifiant() {
        // Automatically generated method. Please do not modify this code.
        return this.numero_identifiant;
    }

 
    public void setNumero_identifiant(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.numero_identifiant = value;
    }

    
    private String nom;

    
    public String getNom() {
        // Automatically generated method. Please do not modify this code.
        return this.nom;
    }

    
    public void setNom(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.nom = value;
    }

    
    private Date date_embauche;

 
    public Date getDate_embauche() {
        // Automatically generated method. Please do not modify this code.
        return this.date_embauche;
    }

    
    public void setDate_embauche(final Date value) {
        // Automatically generated method. Please do not modify this code.
        this.date_embauche = value;
    }

  
    private String date_depart;

   
    public String getDate_depart() {
        // Automatically generated method. Please do not modify this code.
        return this.date_depart;
    }

    
    public void setDate_depart(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.date_depart = value;
    }

    
    private String numero_assurance_social;

   
    public String getNumero_assurance_social() {
        // Automatically generated method. Please do not modify this code.
        return this.numero_assurance_social;
    }

    
    public void setNumero_assurance_social(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.numero_assurance_social = value;
    }


    private Entreprise entreprise;

    
    public Entreprise getEntreprise() {
        // Automatically generated method. Please do not modify this code.
        return this.entreprise;
    }

   
    public void setEntreprise(final Entreprise value) {
        // Automatically generated method. Please do not modify this code.
        this.entreprise = value;
    }

    private Projet projet;

  
    public Projet getProjet() {
        // Automatically generated method. Please do not modify this code.
        return this.projet;
    }

   
    public void setProjet(final Projet value) {
        // Automatically generated method. Please do not modify this code.
        this.projet = value;
    }

 
    private Poste poste;

    
    public Poste getPoste() {
        // Automatically generated method. Please do not modify this code.
        return this.poste;
    }

    
    public void setPoste(final Poste value) {
        // Automatically generated method. Please do not modify this code.
        this.poste = value;
    }

    
    public List<Activite> Liste_activite = new ArrayList<Activite> ();

   
    public Activite activite_en_cours;

   
    public void Consulter_information() {
    }

   
    public void Consulter_information_salariale() {
    }

   
    public void Commencer_activité() {
    }

}
