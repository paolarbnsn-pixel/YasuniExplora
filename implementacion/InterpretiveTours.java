
package ec.edu.espoch.yasuniexplora.implementacion;

import ec.edu.espoch.yasuniexplora.Interface.InterfaceInterpretiveTours;

public class InterpretiveTours extends Tours implements InterfaceInterpretiveTours {

        
  public float distance(){
     return 1.2f; 
  }
  public float totalTime(){
      return 2.1f;
  }
  public float simulation(){
      return 0.2f;
  }
}
