

package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ciudad {
    @Id @GeneratedValue int idCiudad;
    String nombre;
    @ManyToOne Trayecto trayecto;
}
