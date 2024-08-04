package com.example;

import java.util.ArrayList;
import java.util.Date; 
import java.util.List;
public class Main {
    public static void main(String[] args){


        Poste developpeur = new Poste("Développeur");
        Poste patron_inutile = new Poste("Boss");
        Poste Concepteur_intelligent = new Poste("Développeur");
        Poste Agent_marketing = new Poste("Développeur");
        Poste admin = new Poste("admin");

        Discipline design1 = new Discipline("design1");
        Discipline design2 = new Discipline("design2");
        Discipline implementation = new Discipline("implementation"); 
        Discipline test = new Discipline("test");
        Discipline deploiement = new Discipline("deploiement");

        List<Discipline> disciplines1 = new ArrayList<>();
        disciplines1.add(design2);
        disciplines1.add(deploiement);

        List<Discipline> disciplines2 = new ArrayList<>();
        disciplines2.add(design1);
        disciplines2.add(test);

        List<Discipline> disciplines3 = new ArrayList<>();
        disciplines3.add(implementation);

        Projet projet1 = new Projet("Réseau social", new Date(), new Date(), 1,disciplines1);
        Projet projet2 = new Projet("gaming", new Date(), new Date(), 2,disciplines2);
        Projet projet3 = new Projet("documentaion", new Date(), new Date(), 3,disciplines3);
        
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

        for(Discipline d : disciplines1){
            d.add_heures(11, employe1);
            d.add_heures(21, employe2);
            d.add_heures(31, employe3);
        }

        for(Discipline d : disciplines2){
            d.add_heures(22, employe2);
            d.add_heures(32, employe3);
        }
        for(Discipline d : disciplines3){
            d.add_heures(33, employe3);
        }
        
        Entreprise entreprise = new Entreprise();

        entreprise.employee.add(employe1);
        entreprise.employee.add(employe2);
        entreprise.employee.add(employe3);
        
        entreprise.projets.add(projet1);
        entreprise.projets.add(projet2);
        entreprise.projets.add(projet3);
        
        //System.out.println("creation de l'activiter");
        Activite activite = new Activite("test",projet1 , null, 1);
        //System.out.println("Commencer Activiter");
        //activite.Commencer_activité(gaming.getNumero_identification(),Mathieu.getNumero_identifiant());
        //Thread.sleep(5000);
        //System.out.println("Terminer Activiter");
        

        String filePath = "entreprise.txt";
        boolean end = true;
        while(end){
            interface_console interface_console = new interface_console();
            boolean ans = interface_console.connexion();
            if(ans){
                while(true){
                    int choice = interface_console.main_menu();
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
