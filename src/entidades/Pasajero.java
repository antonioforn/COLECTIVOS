

package entidades;

import javax.persistence.Entity;

@Entity
public class Pasajero extends Persona{
    
    public Pasajero(int ci, String nombre, String apellido) {
        super(ci, nombre, apellido);
    }

    public Pasajero() {
    }
    
}
