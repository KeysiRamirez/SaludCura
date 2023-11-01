/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import CRUD.Visitas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Keysi Ramirez
 */
@Stateless
public class VisitasFacade extends AbstractFacade<Visitas> {

    @PersistenceContext(unitName = "SaludCuraPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VisitasFacade() {
        super(Visitas.class);
    }
    
}
