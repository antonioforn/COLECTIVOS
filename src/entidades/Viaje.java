

package entidades;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Viaje {
    @Id @GeneratedValue int idViaje;
    java.sql.Date fechaViaje;
    java.sql.Time horaViaje;
    Trayecto trayecto;
    Vehiculo vehiculo;
    String estado;
    @OneToMany(mappedBy="viaje") List<Pasaje> pasajes= new ArrayList<Pasaje>();
    
}
