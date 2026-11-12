
package ec.edu.espoch.yasuniexplora.implementacion;

public abstract class Tours {
    
    public float distance(){
        return 0.2f;
    }
   public abstract float totalTime();
      
   
   public float simulation(){
       return 0.3f;
   }
   public float changefactor(){
       return 0.3f;
   }
   public float ajustedTime(){
       return 0.3f;
   }
   public String closeTrail(){
       return " ";
   }
}
