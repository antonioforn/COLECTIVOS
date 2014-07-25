

package clasesUtiles;

import entidades.Ciudad;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class cargarCiudades {
  
    public static void main(String[] args){
        EntityManagerFactory emf;
        EntityManager em;
        emf= Persistence.createEntityManagerFactory("colectivos.odb");
        em= emf.createEntityManager();
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
            if(i<9){
                ciu.setOrden("0"+(i+1)+"");
            }else{
                ciu.setOrden(""+(i+1)+"");
            }
            em.persist(ciu);
            em.getTransaction().commit();
            if(i%10==0 ){
                System.out.println("mod 10");
                em.flush();
                em.clear();
            }
         }
        em.close();
        emf.close();
        
    }
    
}
