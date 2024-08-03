package com.example;
import java.util.ArrayList;
import java.util.List;

public class Discipline {

    public Discipline(String nom){
        this.nom = nom;
    }
   
    private String nom;

    private ArrayList<Heure> heures = new ArrayList<>();
    
    public ArrayList<Heure> get_heures(){
        return heures;
    }
    public void add_heures(int nbs,Employe employe){
        Heure heure = new Heure(nbs, employe);
        heures.add(heure);
    }


    public String getNom() {
        // Automatically generated method. Please do not modify this code.
        return this.nom;
    }

   
    public void setNom(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.nom = value;
    }

   
    public List<Poste> postes = new ArrayList<Poste> ();

    
    private List<Activite> Liste_activite = new ArrayList<Activite> ();

    
    public List<Activite> getListe_activite() {
        // Automatically generated method. Please do not modify this code.
        return this.Liste_activite;
    }

    public void setListe_activite(final List<Activite> value) {
        // Automatically generated method. Please do not modify this code.
        this.Liste_activite = value;
    }

}
