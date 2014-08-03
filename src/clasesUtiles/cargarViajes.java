

package clasesUtiles;

import entidades.Trayecto;
import entidades.Vehiculo;
import entidades.Viaje;
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
        
        int i;
//    public Viaje(java.sql.Date fechaViaje, java.sql.Time horaViaje, Trayecto trayecto, Vehiculo vehiculo, String estado) {
//        this.fechaViaje = fechaViaje;
//        this.horaViaje = horaViaje;
//        this.trayecto = trayecto;
//        this.vehiculo = vehiculo;
//        this.estado = estado;
//    }        
         for(i=0; i < 4;i++){
            em.getTransaction().begin();
            via= new Viaje();
            via.setFechaViaje(java.sql.Date.valueOf("2014-08-08"));
            via.setHoraViaje(java.sql.Time.valueOf("05:00:00"));
            tr= em.find(Trayecto.class, 1);
            via.setTrayecto(tr);
            via.setVehiculo(tr.);
            em.persist(via);
            em.getTransaction().commit();

         }
        em.close();
        emf.close();        
    }    
}
