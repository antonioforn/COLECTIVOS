

package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Pasaje {
    @Id @GeneratedValue int nro;
    java.sql.Date fechaPas;
    Pasajero cliente;
    @ManyToOne Viaje viaje;
    
}
