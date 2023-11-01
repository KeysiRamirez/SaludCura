/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import CRUD.Farmacos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Keysi Ramirez
 */
@Stateless
public class FarmacosFacade extends AbstractFacade<Farmacos> {

    @PersistenceContext(unitName = "SaludCuraPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FarmacosFacade() {
        super(Farmacos.class);
    }
    
}
