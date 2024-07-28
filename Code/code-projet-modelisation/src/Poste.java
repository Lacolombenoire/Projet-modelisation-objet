import java.util.ArrayList;
import java.util.List;

public class Poste {
   
    private String nom;

   
    public String getNom() {
        // Automatically generated method. Please do not modify this code.
        return this.nom;
    }

    
    public void setNom(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.nom = value;
    }

    
    private Discipline discipline;

   
    public Discipline getDiscipline() {
        // Automatically generated method. Please do not modify this code.
        return this.discipline;
    }

    
    public void setDiscipline(final Discipline value) {
        // Automatically generated method. Please do not modify this code.
        this.discipline = value;
    }

    
    public List<Employe> Liste_employees = new ArrayList<Employe> ();

}
