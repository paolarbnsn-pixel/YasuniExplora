
package ec.edu.espoch.yasuniexplora.objeto;

public class Tour {
private int id;
private String name;
private SeveralTrail[]  severalTrail ;
private  float dificculd=1.0f;

    public Tour(int id, String name, SeveralTrail[] severalTrail) {
        this.id = id;
        this.name = name;
        this.severalTrail = severalTrail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SeveralTrail[] getSeveralTrail() {
        return severalTrail;
    }

    public void setSeveralTrail(SeveralTrail[] severalTrail) {
        this.severalTrail = severalTrail;
    }

    public float getDificculd() {
        return dificculd;
    }

    public void setDificculd(float dificculd) {
        this.dificculd = dificculd;
    }

   

}
