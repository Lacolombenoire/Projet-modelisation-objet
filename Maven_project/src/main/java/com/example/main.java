package com.example;

import java.util.Date;
public class main {
    

    public static void main(String[] args) throws InterruptedException {


        Poste developpeur = new Poste("Développeur");
        Poste patron_inutile = new Poste("Boss");
        Poste Concepteur_intelligent = new Poste("Développeur");
        Poste Agent_marketing = new Poste("Développeur");

        Projet reseau_social = new Projet("Réseau social", new Date(), new Date(), 1);
        Projet gaming = new Projet("gaming", new Date(), new Date(), 2);
        Projet documentaion = new Projet("documentaion", new Date(), new Date(), 3);
        Projet marketing = new Projet("marketing", new Date(), new Date(), 4);
        
        Employe Nicolas = new Employe(1500, 2000, "Nicolas",1 , 423543654, new Date(), developpeur, null);
        Employe Mathieu = new Employe(1500, 2000, "Mathieu", 2, 8908540, new Date(), developpeur, null);
        Employe Alexanne = new Employe(1500, 2000, "Alexanne",3 , 35347, new Date(), patron_inutile, null);
        Employe William = new Employe(1500, 2000, "William", 4, 345708, new Date(), Concepteur_intelligent, null);
        Employe Alex = new Employe(1500, 2000, "Alex",5 , 3453754, new Date(), Agent_marketing, null);

        Entreprise.entreprise.employee.add(Nicolas);
        Entreprise.entreprise.employee.add(Mathieu);
        Entreprise.entreprise.employee.add(Alexanne);
        Entreprise.entreprise.employee.add(William);
        Entreprise.entreprise.employee.add(Alex);

        Entreprise.entreprise.projets.add(reseau_social);
        Entreprise.entreprise.projets.add(gaming);
        Entreprise.entreprise.projets.add(documentaion);
        Entreprise.entreprise.projets.add(marketing);
        
        System.out.println("creation de l'activiter");
        Activite activite = new Activite("test", marketing, null, 1);
        System.out.println("Commencer Activiter");
        activite.Commencer_activité(gaming.getNumero_identification(),Mathieu.getNumero_identifiant());
        Thread.sleep(5000);
        System.out.println("Terminer Activiter");
        activite.Terminer_activité(gaming.getNumero_identification(),Mathieu.getNumero_identifiant());

        String filePath = "entreprise.txt";

        

        try {
            
            
        } catch(Exception e) {
            System.out.println(e);
        }
        






    }






}
