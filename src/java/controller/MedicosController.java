package controller;

import CRUD.Medicos;
import facade.MedicosFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "medicosController")
@ViewScoped
public class MedicosController extends AbstractController<Medicos> {

    @Inject
    private MobilePageController mobilePageController;

    public MedicosController() {
        // Inform the Abstract parent controller of the concrete Medicos Entity
        super(Medicos.class);
    }
    
            

}
