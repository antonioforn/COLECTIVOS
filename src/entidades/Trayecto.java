

package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Trayecto {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) int idTrayecto;   
    @OneToMany (fetch=FetchType.EAGER) List<Ciudad> ciudades= new ArrayList<Ciudad>();
    
    public Trayecto() {
    }

    public int getIdTrayecto() {
        return idTrayecto;
    }

    public void setIdTrayecto(int idTrayecto) {
        this.idTrayecto = idTrayecto;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }
    
}
