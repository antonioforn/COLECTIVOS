

package entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {
    @Id int ci;
    String nombre;
    String apellido;

    public Persona(int ci, String nombre, String apellido) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona() {
    
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    
}
