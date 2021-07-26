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

public class JPAAutorDAO implements AutorDAO {
    private EntityManager em;
    
    @Override
    public void salva(Autor a){
        em = JPAUtil.getEM();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(a);
        et.commit();
        em.close();
    }
    
    @Override
    public Autor recupera(Long id){
        em = JPAUtil.getEM();
        EntityTransaction et = em.getTransaction();
        et.begin();
        Autor a = em.find(Autor.class, id);
        et.commit();
        em.close();
        return a;
    }
}
