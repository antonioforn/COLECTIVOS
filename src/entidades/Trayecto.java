

package entidades;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Trayecto {
    @Id @GeneratedValue int idTrayecto;   
    @OneToMany (mappedBy="trayecto") Set<Ciudad> ciudades;
    
}
