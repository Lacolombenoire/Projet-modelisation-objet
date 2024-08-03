package com.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class main {
    

    public static void main(String[] args) throws InterruptedException {


        Poste developpeur = new Poste("Développeur");
        Poste patron_inutile = new Poste("Boss");
        Poste Concepteur_intelligent = new Poste("Développeur");
        Poste Agent_marketing = new Poste("Développeur");
        Poste admin = new Poste("admin");

        Projet projet1 = new Projet("Réseau social", new Date(), new Date(), 1);
        Projet projet2 = new Projet("gaming", new Date(), new Date(), 2);
        Projet projet3 = new Projet("documentaion", new Date(), new Date(), 3);
        
        List<Projet> list1 = new ArrayList<Projet>();
        list1.add(projet1);
        List<Projet> list2 = new ArrayList<Projet>();
        list1.add(projet1);
        list1.add(projet2);
        List<Projet> list3 = new ArrayList<Projet>();
        list1.add(projet1);
        list1.add(projet2);
        list1.add(projet3);

        Employe employe1 = new Employe(1500, 2000, "e1",1 , 423543654, new Date(), developpeur,list1);
        Employe employe2 = new Employe(1500, 2000, "e2", 2, 8908540, new Date(), developpeur, list2);
        Employe employe3 = new Employe(1500, 2000, "e3",3 , 35347, new Date(), patron_inutile, list3);
        Employe admin_account = new Employe(0,0,"admin",42,0,new Date(),admin,null);
        

        Entreprise.entreprise.employee.add(employe1);
        Entreprise.entreprise.employee.add(employe2);
        Entreprise.entreprise.employee.add(employe3);
        
        Entreprise.entreprise.projets.add(projet1);
        Entreprise.entreprise.projets.add(projet2);
        Entreprise.entreprise.projets.add(projet3);
        
        //System.out.println("creation de l'activiter");
        Activite activite = new Activite("test",projet1 , null, 1);
        //System.out.println("Commencer Activiter");
        //activite.Commencer_activité(gaming.getNumero_identification(),Mathieu.getNumero_identifiant());
        //Thread.sleep(5000);
        //System.out.println("Terminer Activiter");
        

        String filePath = "entreprise.txt";
        boolean end = true;
        while(end){
            interface_console test = new interface_console();
            boolean ans = test.connexion();
            if(ans){
                while(true){
                    int choice = test.main_menu();
                    if(choice == 1){
                        activite.Terminer_activité(projet1.getNumero_identification(),employe1.getNumero_identifiant());
                    }else if(choice == 3){
                        activite.Commencer_activité(projet1.getNumero_identification(),employe1.getNumero_identifiant());
                    }else{
                        System.out.println("Vous vous êtes bien déconnecté");
                        break;
                    }
                }
            }
        }
    }
}
