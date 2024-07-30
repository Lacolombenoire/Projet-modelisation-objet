package com.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import java.io.*;
import java.lang.reflect.Type;


public class Activite {
    
    private Date Date_debut;
    private String Nom;
    private Projet projet;
    public Discipline discipline;
    private int project_id;
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public Activite(final String Nom, Projet projet, Discipline discipline,int id) {
        this.Nom = Nom;
        this.projet = projet;
        this.project_id = id;
        this.Date_debut = new Date();

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
    public int get_project_id(){ return this.project_id; }

    private void Calculer_temps_total() {
    }

    public void Terminer_activité(int project_id,int employee_id) {
        String operation_type = "Punch_out";

        Date now = new Date();

        Log log = new Log(now,project_id,operation_type,employee_id);
        
        System.out.println("terminer activiter dans les logs");

        addLog(log);

    }

    public void Commencer_activité(int project_id,int employee_id) {
        String operation_type = "Punch_in";

        Date now = new Date();

        Log log = new Log(now,project_id,operation_type,employee_id);

        System.out.println("Commencer activiter dans les logs");

        addLog(log);

    }

    public void addLog(Log log) {
        List<Log> logs = readLogs();
        logs.add(log);
        writeLogs(logs);
    }

    private List<Log> readLogs() {
        String path = "Maven_project\\src\\main\\java\\com\\example\\log.json";
        try (JsonReader reader = new JsonReader(new FileReader(path))) {
            Type logListType = new TypeToken<ArrayList<Log>>() {}.getType();
            return gson.fromJson(reader, logListType);
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    private void writeLogs(List<Log> logs) {
        String path = "Maven_project\\src\\main\\java\\com\\example\\log.json";
        try (FileWriter writer = new FileWriter(path)) {
            gson.toJson(logs, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
