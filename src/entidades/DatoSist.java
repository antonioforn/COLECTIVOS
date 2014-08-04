

package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DatoSist {
    @Id int id;
    String nombreEmpresa;
    int precioBase;

    public DatoSist(String nombreEmpresa, int precioBase) {
        this.nombreEmpresa = nombreEmpresa;
        this.precioBase = precioBase;
    }

    public DatoSist() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }
    
}
