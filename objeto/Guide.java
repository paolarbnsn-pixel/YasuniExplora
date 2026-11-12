
package ec.edu.espoch.yasuniexplora.objeto;

public class Guide {
 private String cardId;
private String nameGuide;
private boolean stateGuide;

    public Guide(String cardId, String nameGuide, boolean stateGuide) {
        this.cardId = cardId;
        this.nameGuide = nameGuide;
        this.stateGuide = stateGuide;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getNameGuide() {
        return nameGuide;
    }

    public void setNameGuide(String nameGuide) {
        this.nameGuide = nameGuide;
    }

    public boolean isStateGuide() {
        return stateGuide;
    }

    public void setStateGuide(boolean stateGuide) {
        this.stateGuide = stateGuide;
    }

}
