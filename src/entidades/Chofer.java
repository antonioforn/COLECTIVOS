
package entidades;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Chofer extends Persona{
    @OneToOne (cascade=CascadeType.ALL) Vehiculo vehiculo;   

    public Chofer() {
    }

    public Chofer(int ci, String nombre, String apellido) {
        super(ci, nombre, apellido);
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    

}
