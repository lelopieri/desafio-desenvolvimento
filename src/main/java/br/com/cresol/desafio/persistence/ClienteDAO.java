package br.com.cresol.desafio.persistence;

import br.com.cresol.desafio.entities.ClienteEntity;

import javax.persistence.EntityManager;
import java.util.List;

public class ClienteDAO {

    public ClienteEntity getClientes(){
        EntityManager em = HibernateUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        ClienteEntity cliente = em.find(ClienteEntity.class, new Integer(1));
        return cliente;
    }
}
