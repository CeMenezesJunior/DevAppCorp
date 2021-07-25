/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author edu_j
 */
public class JPAVolumeDAO {
    private EntityManager em;
    
    public JPAVolumeDAO(){  
    }
    
    public void salva(Volume v){
        em = JPAUtil.getEM();
        EntityTransaction et = em.getTransaction();
        et.begin();;
        em.persist(v);
        et.commit();
        em.close();
    }
    
    public Volume recupera(Long id){
        em = JPAUtil.getEM();
        EntityTransaction et = em.getTransaction();
        et.begin();
        Volume v = em.find(Volume.class, id);
        et.commit();
        em.close();
        return v;
    }
}
