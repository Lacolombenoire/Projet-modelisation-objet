package com.example;
import java.util.Scanner;
import java.util.HashMap;
import java.io.*;
import java.util.Date;

public class interface_console {
    public Scanner scanner;
    public HashMap<String, String> nom_id = new HashMap<>();
    private Logger logger = new Logger();
    private boolean is_punched = false;

    public interface_console(){
        scanner = new Scanner(System.in);
        fill_hashmap();
    }
    public void fill_hashmap(){
        String filePath = "Maven_project\\src\\main\\java\\com\\example\\nom_id.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(" ");
                nom_id.put(data[0],data[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean connexion(){
        
        System.out.println("entrez votre nom");
        String nom = scanner.nextLine();
        System.out.println("entrez votre ID");
        String ID = scanner.nextLine();

        return log_check(nom, ID);
    }
    public int main_menu(){
        boolean end = true;
        if(is_punched){
            while(end){
                System.out.println("voulez-vous (1) Terminer une activitée ou (2) vous deconnecter");
                int choix = scanner.nextInt();
                System.out.println(choix);
                if (choix == 1){
                    is_punched = false;
                    return 1;
                }else if(choix == 2){
                    return 2;
                }else{
                    System.out.println("entrez 1 ou 2");
                }
            }
        }else{
            while(end){
                System.out.println("voulez-vous (1) Démarrer une activitée ou (2) vous deconnecter");
                int choix = scanner.nextInt();
                if (choix == 1){
                    is_punched = true;
                    return 3;
                }else if(choix == 1){
                    return 2;
                }else{
                    System.out.println("entrez 1 ou 2");
                }
            }
        }
        return 0;
    }

    public boolean log_check(String nom,String id){
        for (String key : nom_id.keySet()) {
            if (key.equals(nom)){
                if (nom_id.get(nom).equals(id)){
                    Date now = new Date();
                    Log log = new Log(now,0,"connexion "+nom,0);
                    logger.addLog(log);
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        interface_console interface_c = new interface_console();
        System.out.println(interface_c.log_check("mathieu","42"));
    }
}
