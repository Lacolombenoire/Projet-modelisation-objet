package com.example;

public class Heure {
    private int nbs;
    private Employe employe;
    public Heure(int nbs,Employe employe){
        this.nbs = nbs;
        this.employe = employe;
    }
    public int getNbs() {
        return nbs;
    }
    public void setNbs(int nbs) {
        this.nbs = nbs;
    }
    public Employe getEmploye() {
        return employe;
    }
    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
    
}
