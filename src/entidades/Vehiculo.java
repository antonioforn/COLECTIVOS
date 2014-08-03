
package entidades;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Vehiculo {
     @Id String matricula;
     int nro;
     String modelo;
     int anho;
     int capacidad;
     @OneToOne(cascade=CascadeType.PERSIST) Chofer chofer;  

    public Vehiculo() {
    }

    public Vehiculo(String matricula, String modelo, int anho, int asientos, int nro) {
        this.matricula = matricula;
        this.modelo= modelo;
        this.anho= anho;
        this.capacidad = asientos;
        this.nro= nro;
    }


    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }    
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Chofer getChofer() {
        return chofer;
    }

    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }
     
}
