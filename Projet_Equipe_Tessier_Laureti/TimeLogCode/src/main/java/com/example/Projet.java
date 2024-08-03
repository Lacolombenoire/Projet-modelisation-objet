package com.example;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;


public class Projet {
    
    private Date Date_debut;
    private String Nom;

    public Projet(String nom, Date date_debut, Date Date_fin, int Numero_identification) {
        this.Nom = nom;
        this.Date_debut = date_debut;
        this.Date_fin = Date_fin;
        this.Numero_identification = Numero_identification;

    }



    public Date getDate_debut() {
        // Automatically generated method. Please do not modify this code.
        return this.Date_debut;
    }

    
    public void setDate_debut(final Date value) {
        // Automatically generated method. Please do not modify this code.
        this.Date_debut = value;
    }

 
    

    
    public String getNom() {
        // Automatically generated method. Please do not modify this code.
        return this.Nom;
    }

    
    public void setNom(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.Nom = value;
    }

    
    private Date Date_fin;

    
    public Date getDate_fin() {
        // Automatically generated method. Please do not modify this code.
        return this.Date_fin;
    }

   
    public void setDate_fin(final Date value) {
        // Automatically generated method. Please do not modify this code.
        this.Date_fin = value;
    }

  
    private int Numero_identification;

    
    public int getNumero_identification() {
        // Automatically generated method. Please do not modify this code.
        return this.Numero_identification;
    }

   
    public void setNumero_identification(final int value) {
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
