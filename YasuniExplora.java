package ec.edu.espoch.yasuniexplora;

import ec.edu.espoch.yasuniexplora.Interface.InterfaceRegularTours;
import ec.edu.espoch.yasuniexplora.objeto.RegularTour;
import ec.edu.espoch.yasuniexplora.objeto.SeveralTrail;
import ec.edu.espoch.yasuniexplora.objeto.Tour;

public class YasuniExplora {

    public static void main(String[] args) {
       
        SeveralTrail severalTrail = new SeveralTrail("senderoCoca ", 1.0f, 60f, true);
        
       RegularTour regularTour =new RegularTour(22504, "Paola", severalTrail);
      
    }
}
