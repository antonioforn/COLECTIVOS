

package entidades;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Pasajero extends Persona{
    @ManyToMany(mappedBy="pasajeros")
    private List<Viaje> viajes;    

    public List<Viaje> getViajes() {
        return viajes;
    }

    public void setViajes(List<Viaje> viajes) {
        this.viajes = viajes;
    }
    
    public Pasajero(int ci, String nombre, String apellido) {
        super(ci, nombre, apellido);
    }

    public Pasajero() {
    }
    
}
