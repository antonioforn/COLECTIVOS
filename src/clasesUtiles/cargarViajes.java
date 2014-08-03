

package clasesUtiles;

import entidades.Trayecto;
import entidades.Vehiculo;
import entidades.Viaje;
import java.util.ArrayList;
import java.util.Collections;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class cargarViajes {
    public static void main(String[] args){
        EntityManagerFactory emf;
        EntityManager em;
        emf= Persistence.createEntityManagerFactory("colectivos.odb");
        em= emf.createEntityManager();
        Viaje via;
        Trayecto tr;
        Vehiculo veh;
        
        int i;
//    public Viaje(java.sql.Date fechaViaje, java.sql.Time horaViaje, Trayecto trayecto, Vehiculo vehiculo, String estado) {
//        this.fechaViaje = fechaViaje;
//        this.horaViaje = horaViaje;
//        this.trayecto = trayecto;
//        this.vehiculo = vehiculo;
//        this.estado = estado;
//    }        
//PRIMER VIAJE
            em.getTransaction().begin();
            via= new Viaje();
            via.setFechaViaje(java.sql.Date.valueOf("2014-08-08"));
            via.setHoraViaje(java.sql.Time.valueOf("05:00:00"));
            tr= em.find(Trayecto.class, 1);
            via.setTrayecto(tr);
            veh= em.find(Vehiculo.class, "AAA-111");
            via.setVehiculo(veh);
            via.setEstado("Disponible");
            via.setModo(true);//IDA
            ArrayList<Boolean>asient= new ArrayList<>(veh.getCapacidad());
            for(i=0; i<veh.getCapacidad();i++){
                asient.add(true);
            }
            via.setAsientos(asient);
            em.persist(via);
            em.getTransaction().commit();
//SEGUNDO VIAJE
            em.getTransaction().begin();
            via= new Viaje();
            via.setFechaViaje(java.sql.Date.valueOf("2014-08-08"));
            via.setHoraViaje(java.sql.Time.valueOf("10:00:00"));
            tr= em.find(Trayecto.class, 1);
            via.setTrayecto(tr);
            veh= em.find(Vehiculo.class, "AAA-111");
            via.setVehiculo(veh);
            via.setEstado("Disponible");
            via.setModo(false);//VUELTA
            asient= new ArrayList<>(veh.getCapacidad());
            for(i=0; i<veh.getCapacidad();i++){
                asient.add(true);
            }
            via.setAsientos(asient);
            em.persist(via);
            em.getTransaction().commit();            

//TERCER VIAJE
            em.getTransaction().begin();
            via= new Viaje();
            via.setFechaViaje(java.sql.Date.valueOf("2014-08-08"));
            via.setHoraViaje(java.sql.Time.valueOf("06:00:00"));
            tr= em.find(Trayecto.class, 2);
            via.setTrayecto(tr);
            veh= em.find(Vehiculo.class, "AWQ-122");
            via.setVehiculo(veh);
            via.setEstado("Disponible");
            via.setModo(true);//IDA
            asient= new ArrayList<>(veh.getCapacidad());
            for(i=0; i<veh.getCapacidad();i++){
                asient.add(true);
            }
            via.setAsientos(asient);
            em.persist(via);
            em.getTransaction().commit();              

//CUARTO VIAJE

            em.getTransaction().begin();
            via= new Viaje();
            via.setFechaViaje(java.sql.Date.valueOf("2014-08-08"));
            via.setHoraViaje(java.sql.Time.valueOf("11:00:00"));
            tr= em.find(Trayecto.class, 2);
            via.setTrayecto(tr);
            veh= em.find(Vehiculo.class, "AWQ-122");
            via.setVehiculo(veh);
            via.setEstado("Disponible");
            via.setModo(false);//VUELTA
            asient= new ArrayList<>(veh.getCapacidad());
            for(i=0; i<veh.getCapacidad();i++){
                asient.add(true);
            }
            via.setAsientos(asient);
            em.persist(via);
            em.getTransaction().commit();               

//QUINTO VIAJE

            em.getTransaction().begin();
            via= new Viaje();
            via.setFechaViaje(java.sql.Date.valueOf("2014-08-08"));
            via.setHoraViaje(java.sql.Time.valueOf("07:00:00"));
            tr= em.find(Trayecto.class, 3);
            via.setTrayecto(tr);
            veh= em.find(Vehiculo.class, "BNJ-333");
            via.setVehiculo(veh);
            via.setEstado("Disponible");
            via.setModo(true);//IDA
            asient= new ArrayList<>(veh.getCapacidad());
            for(i=0; i<veh.getCapacidad();i++){
                asient.add(true);
            }
            via.setAsientos(asient);
            em.persist(via);
            em.getTransaction().commit();  
            
//SEXTO VIAJE
            
            em.getTransaction().begin();
            via= new Viaje();
            via.setFechaViaje(java.sql.Date.valueOf("2014-08-08"));
            via.setHoraViaje(java.sql.Time.valueOf("12:00:00"));
            tr= em.find(Trayecto.class, 3);
            via.setTrayecto(tr);
            veh= em.find(Vehiculo.class, "BNJ-333");
            via.setVehiculo(veh);
            via.setEstado("Disponible");
            via.setModo(false);//VUELTA
            asient= new ArrayList<>(veh.getCapacidad());
            for(i=0; i<veh.getCapacidad();i++){
                asient.add(true);
            }
            via.setAsientos(asient);
            em.persist(via);
            em.getTransaction().commit();              
            
        em.close();
        emf.close();        
    }    
}
