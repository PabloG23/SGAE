/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;


import entities.Grupo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author pablog23
 */
@Stateless
public class GrupoFacade extends AbstractFacade<Grupo>{
    @PersistenceContext(unitName = "SGAEPU")
    private EntityManager em;
    
    public GrupoFacade(){
        super(Grupo.class);
    }

    @Override
    protected EntityManager getEntityManager() {
       return em;
    }
}