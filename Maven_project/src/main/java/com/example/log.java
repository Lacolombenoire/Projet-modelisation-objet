import java.util.date;

public class log {
    private String job;
    private Date date_debut;
    private Date date_fin = None;

    public log(String job,Date date_debut){
        this.job = job;
        this.date_debut = date_debut;
    }
    public String get_job() { return job; }
    public void set_date_fin(Date date_fin) { this.date_fin = date_fin; }
    
}
