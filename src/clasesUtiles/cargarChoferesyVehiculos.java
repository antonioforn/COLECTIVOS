
package clasesUtiles;

import entidades.Chofer;
import entidades.Ciudad;
import entidades.Trayecto;
import entidades.Vehiculo;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class cargarChoferesyVehiculos {
    public static void main(String[] args){
        EntityManagerFactory emf;
        EntityManager em;
        emf= Persistence.createEntityManagerFactory("colectivos.odb");
        em= emf.createEntityManager();
        Chofer ch;
        int i;
        String[][] choferes = {{"1100101", "Artemio", "Arrua"},
                              {"1272272", "Benedicto", "Benitez"},
                              {"1303303", "Carlos", "Cardozo"},
                              {"1441414", "Dilberto", "Diaz"}, 
                              {"1500565", "Esteban", "Perez"}, 
                              {"1000606", "Facundo", "Fernandez"}, 
                              {"1700777", "German", "Garcia"}};
        
         for(i=0; i < choferes.length;i++){
            em.getTransaction().begin();
            ch= new Chofer();
            ch.setCi(Integer.parseInt(choferes[i][0]));
            ch.setNombre(choferes[i][1]);
            ch.setApellido(choferes[i][2]);
            em.persist(ch);
            em.getTransaction().commit();
            if(i%2==0 ){
                System.out.println("mod 2");
                em.flush();
                em.clear();
            }
         }
         
         Vehiculo ve;
//     @Id String matricula;
//     int nro;
//     String modelo;
//     int anho;
//     int capacidad;
//     @OneToOne Chofer chofer;  
        String[][] vehiculos = {{"AAA-111", "10", "MB Urviabus", "2002", "41", "1100101"},
                                {"AWQ-122", "15", "MB Marcopolo", "1999", "44", "1272272"},
                                {"BNJ-333", "20", "MB 1420", "2000", "44", "1303303"},
                                {"CNJ-444", "25", "MB 1420", "2000", "44", "1441414"}};
         
         for(i=0; i < vehiculos.length;i++){
            em.getTransaction().begin();
            ve= new Vehiculo();
            ve.setMatricula(vehiculos[i][0]);
            ve.setNro(Integer.parseInt(vehiculos[i][1]));
            ve.setModelo(vehiculos[i][2]);
            ve.setAnho(Integer.parseInt(vehiculos[i][3]));
            ve.setCapacidad(Integer.parseInt(vehiculos[i][4]));
            ch = em.find(Chofer.class, Integer.parseInt(vehiculos[i][5]));
            ve.setChofer(ch);
            em.persist(ve);
            em.getTransaction().commit();

         }        
        
        em.close();
        emf.close();
        
    }    
}
