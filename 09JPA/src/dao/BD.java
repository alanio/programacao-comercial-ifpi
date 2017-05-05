/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Imovel;
import java.util.List;
import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 *
 * @author arch
 */
public class BD {
    protected EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
    protected EntityManager em = factory. createEntityManager();            
    
    public List<Imovel> selectAll(){        
        List<Imovel> lista = em.createQuery("select t from Imovel t").getResultList();        
        return lista;        
    }
    
    public void insert(Imovel i){
        em.getTransaction().begin();
        em.persist(i);
        em.getTransaction().commit();
        //em.close();
    }
    
    public void remove(Imovel i){
        em.getTransaction().begin();
        Imovel imv = em.find(Imovel.class, i.getId());
        em.remove(imv);
        em.getTransaction().commit();
        //em.close();
    }    
    
    
    public void update(Imovel i){
        em.getTransaction().begin();
        Imovel imv = em.find(Imovel.class, i.getId());
        em.merge(imv);
        em.getTransaction().commit();
        //em.close();
    }
    
    public void finish(){
        em.close();
        factory.close();
    }
       
}
