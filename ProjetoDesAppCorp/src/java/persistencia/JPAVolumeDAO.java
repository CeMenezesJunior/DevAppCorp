/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author edu_j
 */
public class JPAVolumeDAO implements VolumeDAO{
    private EntityManager em;
    
    public JPAVolumeDAO(){  
    }
    
    @Override
    public void salva(Volume v){
        em = JPAUtil.getEM();
        EntityTransaction et = em.getTransaction();
        et.begin();;
        em.persist(v);
        et.commit();
        em.close();
    }
    
    @Override
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
