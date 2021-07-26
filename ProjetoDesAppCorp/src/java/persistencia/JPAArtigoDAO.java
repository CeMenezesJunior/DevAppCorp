/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

/**
 *
 * @author edu_j
 */

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class JPAArtigoDAO implements ArtigoDAO{
    private EntityManager em;
    
    @Override
    public void salva(Artigo a){
        em = JPAUtil.getEM();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(a);
        et.commit();
        em.close();
    }
    
    @Override
    public Artigo recupera(Long id){
        em = JPAUtil.getEM();
        EntityTransaction et = em.getTransaction();
        et.begin();
        Artigo a = em.find(Artigo.class, id);
        et.commit();
        em.close();
        return a;
    }
}
