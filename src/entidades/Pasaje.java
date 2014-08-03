

package entidades;

import java.sql.Date;
import javax.persistence.CascadeType;
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
    int monto;
    @ManyToOne(cascade=CascadeType.PERSIST) Viaje viaje;
    String ciuInicio;
    String ciuFin;

    public Pasaje() {
    }

    public Pasaje(java.sql.Date fechaPas, Pasajero cliente, Viaje viaje, String ciuInicio, String ciuFin) {
        this.fechaPas = fechaPas;
        this.cliente = cliente;
        this.viaje = viaje;
        this.ciuInicio = ciuInicio;
        this.ciuFin = ciuFin;
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
