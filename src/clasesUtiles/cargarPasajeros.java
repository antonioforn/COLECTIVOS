

package clasesUtiles;

import entidades.Chofer;
import entidades.Pasajero;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class cargarPasajeros {
    public static void main(String[] args){
        EntityManagerFactory emf;
        EntityManager em;
        emf= Persistence.createEntityManagerFactory("colectivos.odb");
        em= emf.createEntityManager();
        Pasajero pasajero;
        int i;
        String[][] pasajeros = {{"3100101", "Arnaldo", "Alvarez"},
                              {"3100102", "Bruno", "B"},
                              {"3100103", "Cristian", "Cuevas"},
                              {"3100104", "Dionisio", "Drogba"}, 
                              {"3100105", "Esther", "Estigarribia"}, 
                              {"3100106", "Fernando", "Fretes"}, 
                              {"3100107", "Gerardo", "Garcia"},
                              {"3100108", "Hugo", "Herebia"},
                              {"3100109", "Ignacio", "Insaurralde"},
                              {"3100110", "Javier", "Jiménez"},
                              {"3100111", "Katy", "Garcia"},
                              {"3100112", "Luis", "Lesme"},
                              {"3100113", "María", "Mendez"},
                              {"3100114", "Norma", "Nuñez"},
                              {"3100115", "Oscar", "Ostrich"},
                              {"3100116", "Patricio", "Perez"},
                              {"3100117", "Quasimodo", "Q"},
                              {"3100118", "Ricardo", "Ramírez"},
                              {"3100119", "Sebastián", "Sosa"},
                              {"3100120", "Tomás", "Tevez"},
                                };
        
         for(i=0; i < pasajeros.length;i++){
            em.getTransaction().begin();
            pasajero= new Pasajero();
            pasajero.setCi(Integer.parseInt(pasajeros[i][0]));
            pasajero.setNombre(pasajeros[i][1]);
            pasajero.setApellido(pasajeros[i][2]);
            em.persist(pasajero);
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
