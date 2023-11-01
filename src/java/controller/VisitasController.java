package controller;

import CRUD.Visitas;
import facade.VisitasFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "visitasController")
@ViewScoped
public class VisitasController extends AbstractController<Visitas> {

    @Inject
    private MobilePageController mobilePageController;

    public VisitasController() {
        // Inform the Abstract parent controller of the concrete Visitas Entity
        super(Visitas.class);
    }

}
