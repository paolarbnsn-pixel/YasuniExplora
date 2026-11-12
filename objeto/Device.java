
package ec.edu.espoch.yasuniexplora.objeto;

public class Device {
 private String id;
 private String description;
 private boolean state;

    public Device(String id, String description, boolean state) {
        this.id = id;
        this.description = description;
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
 
 
}
