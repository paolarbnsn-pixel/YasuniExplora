package ec.edu.espoch.yasuniexplora.objeto;

public class SeveralTrail {

    private String nameSeveralTrail;
    private float lenghSeveralTrail;
    private float timeSeveralTrail;
    private boolean stateSeveralTrail;

    public SeveralTrail(String nameSeveralTrail, float lenghSeveralTrail, float timeSeveralTrail, boolean stateSeveralTrail) {
        this.nameSeveralTrail = nameSeveralTrail;
        this.lenghSeveralTrail = lenghSeveralTrail;
        this.timeSeveralTrail = timeSeveralTrail;
        this.stateSeveralTrail = stateSeveralTrail;
    }

   // public void closeSeveralTrail() {

    public String getNameSeveralTrail() {
        return nameSeveralTrail;
    }

    public void setNameSeveralTrail(String nameSeveralTrail) {
        this.nameSeveralTrail = nameSeveralTrail;
    }

    public float getLenghSeveralTrail() {
        return lenghSeveralTrail;
    }

    public void setLenghSeveralTrail(float lenghSeveralTrail) {
        this.lenghSeveralTrail = lenghSeveralTrail;
    }

    public float getTimeSeveralTrail() {
        return timeSeveralTrail;
    }

    public void setTimeSeveralTrail(float timeSeveralTrail) {
        this.timeSeveralTrail = timeSeveralTrail;
    }

    public boolean isStateSeveralTrail() {
        return stateSeveralTrail;
    }

    public void setStateSeveralTrail(boolean stateSeveralTrail) {
        this.stateSeveralTrail = stateSeveralTrail;
    }

    

}
