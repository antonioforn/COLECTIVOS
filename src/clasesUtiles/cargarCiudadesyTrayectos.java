

package clasesUtiles;

import entidades.Ciudad;
import entidades.Trayecto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class cargarCiudadesyTrayectos {
    
    public static void main(String[] args){
        EntityManagerFactory emf;
        EntityManager em;
        emf= Persistence.createEntityManagerFactory("colectivos.odb");
        em= emf.createEntityManager();
        //A CONTINUACION SE CARGAN CIUDADES
        Ciudad ciu;
        int i;
        String[] ciudades = {"Yaguarón",
                              "Paraguarí",
                              "Carapeguá",
                              "Quiindy", 
                              "Caapucú", 
                              "Villa Florida", 
                              "San Miguel", 
                              "San Juan", 
                              "San Ignacio", 
                              "Santa Rosa", 
                              "San Patricio", 
                              "Santiago",
                              "Ayolas",
                              "General Delgado", 
                              "Coronel Bogado", 
                              "Carmen del Paraná",
                              "Encarnación", 
                              "Hohenau", 
                              "Obligado", 
                              "María Auxiliadora" };
        
         for(i=0; i < ciudades.length;i++){
            em.getTransaction().begin();
            ciu= new Ciudad(ciudades[i]);
            em.persist(ciu);
            em.getTransaction().commit();
            if(i%10==0 ){
                System.out.println("mod 10");
                em.flush();
                em.clear();
            }
         }
         //A CONTINUACION SE GENERAN TRAYECTOS
        Trayecto tr;
        
         for(i=0; i < 4;i++){
            em.getTransaction().begin();
            tr= new Trayecto();
            em.persist(tr);
            em.getTransaction().commit();
         }
         
         //SE ASIGNAN CIUDADES A TRAYECTOS 
         tr= em.find(Trayecto.class, 1);
         for(i=1; i < 6;i++){
            ciu= em.find(Ciudad.class, i);
            em.getTransaction().begin();
            tr.getCiudades().add(ciu);
            em.getTransaction().commit();
         }         
         
         tr= em.find(Trayecto.class, 2);
         for(i=6; i < 12;i++){
            ciu= em.find(Ciudad.class, i);
            em.getTransaction().begin();
            tr.getCiudades().add(ciu);
            em.getTransaction().commit();
         }
         
         tr= em.find(Trayecto.class, 3);
         for(i=14; i < 21;i++){
            ciu= em.find(Ciudad.class, i);
            em.getTransaction().begin();
            tr.getCiudades().add(ciu);
            em.getTransaction().commit();
         }         
        em.close();
        emf.close();    
    }
    
}
