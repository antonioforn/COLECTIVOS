

package clasesUtiles;

import entidades.Chofer;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class cargarPasajeros {
    public static void main(String[] args){
        EntityManagerFactory emf;
        EntityManager em;
        emf= Persistence.createEntityManagerFactory("colectivos.odb");
        em= emf.createEntityManager();
        Chofer ch;
        int i;
        String[][] pasajeros = {{"3100101", "Arnaldo", "Abad"},
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
                              {"3100114", "Gerardo", "Garcia"},
                              {"3100115", "Gerardo", "Garcia"},
                                };
        
         for(i=0; i < pasajeros.length;i++){
            em.getTransaction().begin();
            ch= new Chofer();
            ch.setCi(Integer.parseInt(pasajeros[i][0]));
            ch.setNombre(pasajeros[i][1]);
            ch.setApellido(pasajeros[i][2]);
            em.persist(ch);
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
