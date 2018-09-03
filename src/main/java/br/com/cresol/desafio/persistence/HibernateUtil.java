package br.com.cresol.desafio.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {

    private static EntityManagerFactory emFactory;

    public static EntityManagerFactory getEntityManagerFactory(){
        if(emFactory == null) {
            emFactory = Persistence.createEntityManagerFactory("PERSISTENCE");
        }
        return emFactory;
    }

    public static void close(){
        if(emFactory != null){
            emFactory.close();
        }
    }

}
