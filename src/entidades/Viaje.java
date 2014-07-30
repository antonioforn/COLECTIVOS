

package entidades;

import java.sql.Date;
import java.sql.Time;
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
    boolean modo=true;
    @OneToMany(mappedBy="viaje") List<Pasaje> pasajes= new ArrayList<Pasaje>();

    public Viaje(java.sql.Date fechaViaje, java.sql.Time horaViaje, Trayecto trayecto, Vehiculo vehiculo, String estado) {
        this.fechaViaje = fechaViaje;
        this.horaViaje = horaViaje;
        this.trayecto = trayecto;
        this.vehiculo = vehiculo;
        this.estado = estado;
    }

    public Viaje() {
    }

    public int getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(int idViaje) {
        this.idViaje = idViaje;
    }

    public Date getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(Date fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public Time getHoraViaje() {
        return horaViaje;
    }

    public void setHoraViaje(Time horaViaje) {
        this.horaViaje = horaViaje;
    }

    public Trayecto getTrayecto() {
        return trayecto;
    }

    public void setTrayecto(Trayecto trayecto) {
        this.trayecto = trayecto;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isModo() {
        return modo;
    }

    public void setModo(boolean modo) {
        this.modo = modo;
    }

    public List<Pasaje> getPasajes() {
        return pasajes;
    }

    public void setPasajes(List<Pasaje> pasajes) {
        this.pasajes = pasajes;
    }
    
}
