
package ec.edu.espoch.yasuniexplora.objeto;

public class InterpretiveTour extends Tour {
    
    private float adicionalTime;

    public InterpretiveTour(float adicionalTime, int id, String name, SeveralTrail[] severalTrail) {
        super(id, name, severalTrail);
        this.adicionalTime = adicionalTime;
    }

   


    public float getAdicionalTime() {
        return adicionalTime;
    }

    public void setAdicionalTime(float adicionalTime) {
        this.adicionalTime = adicionalTime;
    }

    
    
  
 
 
}
