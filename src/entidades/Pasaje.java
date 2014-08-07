

package entidades;

import java.sql.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Pasaje {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) int nro;
    java.sql.Date fechaPas;
    @OneToOne Pasajero cliente;
    int monto;
    @ManyToOne(cascade=CascadeType.PERSIST) Viaje viaje;
    String ciuInicio;
    String ciuFin;
    int nroAsiento;

    public int getNroAsiento() {
        return nroAsiento;
    }

    public void setNroAsiento(int nroAsiento) {
        this.nroAsiento = nroAsiento;
    }

    public Pasaje() {
    }

    public Pasaje(java.sql.Date fechaPas, Pasajero cliente, Viaje viaje, String ciuInicio, String ciuFin, int nroAsient) {
        this.fechaPas = fechaPas;
        this.cliente = cliente;
        this.viaje = viaje;
        this.ciuInicio = ciuInicio;
        this.ciuFin = ciuFin;
        this.nroAsiento= nroAsient;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public Date getFechaPas() {
        return fechaPas;
    }

    public void setFechaPas(Date fechaPas) {
        this.fechaPas = fechaPas;
    }

    public Pasajero getCliente() {
        return cliente;
    }

    public void setCliente(Pasajero cliente) {
        this.cliente = cliente;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }

    public String getCiuInicio() {
        return ciuInicio;
    }

    public void setCiuInicio(String ciuInicio) {
        this.ciuInicio = ciuInicio;
    }

    public String getCiuFin() {
        return ciuFin;
    }

    public void setCiuFin(String ciuFin) {
        this.ciuFin = ciuFin;
    }
    
}
